package com.cadtech.metalprogress.filter;


import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.cadtech.metalprogress.domain.UserlistEntity;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.apache.commons.io.IOUtils;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;



public class CustomAuthenticationFilter extends UsernamePasswordAuthenticationFilter {
	private static final ObjectMapper objectMapper = new ObjectMapper();
	private final AuthenticationManager authenticationManager;
	public CustomAuthenticationFilter(AuthenticationManager authenticationManager) {
		this.authenticationManager = authenticationManager;
	}

	//驗證登錄用戶
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
//		String username = request.getParameter("username");
//		String password = request.getParameter("password");
		UsernamePasswordAuthenticationToken authenticationToken = null;
		try{
			String body = IOUtils.toString(request.getInputStream(), StandardCharsets.UTF_8);
			UserlistEntity userBean = objectMapper.readValue(body,UserlistEntity.class);
			String username = userBean.getUserid();
			String password = userBean.getUserpw();
			System.out.println("hello"+userBean);

			authenticationToken = new UsernamePasswordAuthenticationToken(username, password);

		}
		catch (Exception e){
			System.out.println(e);

		}





		return authenticationManager.authenticate(authenticationToken);


	}

	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		User user = (User)authResult.getPrincipal();

		Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());

		String access_token = JWT.create()
				.withSubject(user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() + 10*60*1000))
				.withIssuer(request.getRequestURL().toString())
//				.withClaim("roles", user.getAuthorities().stream().map(GrantedAuthority::getAuthority).collect(Collectors.toList()))
				.sign(algorithm);

		String refresh_token = JWT.create()
				.withSubject(user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() + 30*60*1000))
				.withIssuer(request.getRequestURL().toString())

				.sign(algorithm);

//		response.setHeader("access_token", access_token);
//		response.setHeader("refresh_token", refresh_token);
		Map<String, String> tokens = new HashMap<>();
		tokens.put("access_token", access_token);
		tokens.put("refresh_token", refresh_token);
		response.setContentType("application/json");
		new ObjectMapper().writeValue(response.getOutputStream(), tokens);

	}



}