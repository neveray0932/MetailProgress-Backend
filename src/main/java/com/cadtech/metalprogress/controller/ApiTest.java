package com.cadtech.metalprogress.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.auth0.jwt.interfaces.JWTVerifier;
import com.cadtech.metalprogress.domain.*;
import com.cadtech.metalprogress.dto.FatherDTO;
import com.cadtech.metalprogress.lib.NativeResultProcessUtils;
import com.cadtech.metalprogress.repository.*;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.web.bind.annotation.*;

import javax.persistence.Tuple;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
import java.util.concurrent.atomic.AtomicReference;


import static org.springframework.http.HttpHeaders.AUTHORIZATION;
import static org.springframework.http.HttpStatus.FORBIDDEN;

@RestController
@CrossOrigin
@RequestMapping("/public/api")
public class ApiTest {
    @Autowired
    private BomRepository bomRepository;
    @Autowired
    private MakeProcessRepository MakeProcessRepository;
    @Autowired
    private ProductRepository productRepository;
    @Autowired
    private CustRepository custRepository;
    @Autowired
    private OrdermRepository ordermRepository;
    @Autowired
    private OrderdRepository orderdRepository;
    @Autowired
    private UserListRepository userListRepository;
    @Autowired
    private MakeOrderProcessRepository makeOrderProcessRepository;
    @Autowired
    private AuthenticationManager authenticationManager;
    @Autowired
    private MakeOrderDetailRepository makeOrderDetailRepository;



    @GetMapping("/makeprocess")
    public ResponseEntity<List<MakeprocessEntity>> test1(){
        List<MakeprocessEntity> result = MakeProcessRepository.findAll();
        return ResponseEntity.ok(result);
    }

    @GetMapping("/product")
    public ResponseEntity<List<ProductEntity>> product(){
        List<ProductEntity> result = productRepository.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/cust")
    public ResponseEntity<List<CustEntity>> cust(){
        List<CustEntity> result = custRepository.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/orderm")
    public ResponseEntity<List<OrdermEntity>> orderm(){
        List<OrdermEntity> result = ordermRepository.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/orderd")
    public ResponseEntity<List<OrderdEntity>> orderd(){
        List<OrderdEntity> result = orderdRepository.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/bom")
    public ResponseEntity<List<BomEntity>> bom(){
        List<BomEntity> result = bomRepository.findAll();
        return ResponseEntity.ok(result);
    }
    @GetMapping("/makeorderprocess")
    public ResponseEntity<List<MakeOrderProcessEntity>> makeorderprocess(){
        List<MakeOrderProcessEntity> result = makeOrderProcessRepository.findAll();
        return ResponseEntity.ok(result);
    }


    @PostMapping ("/fatherwhere")
    public ResponseEntity<?> fatherWhere(@RequestBody  WhereMapping whereMapping) {
        List<FatherDTO> a = new ArrayList<>();
        List<FatherDTO> apage = new ArrayList<>();
        Map<String,Object> b = new HashMap<>();
        Map<String,Object> c = new HashMap<>();

        System.out.println(whereMapping.getOcode());
        System.out.println(whereMapping.getOdate1());
        System.out.println(whereMapping.getOdate2());

        if(whereMapping.getOdate1().isEmpty()){
            whereMapping.setOdate1("1911-01-01");
        }
        if( whereMapping.getOdate2().isEmpty()){
            whereMapping.setOdate2("2099-12-31");
        }
        if(whereMapping.getOtargetdate1().isEmpty()){
            whereMapping.setOtargetdate1("1911-01-01");
        }
        if(whereMapping.getOtargetdate2().isEmpty()){
            whereMapping.setOtargetdate2("2099-12-31");
        }




        List<Tuple> result = custRepository.selectDistinctWhere(whereMapping.getCsname(),whereMapping.getPname(), whereMapping.getPno(), whereMapping.getOcode(),
                 whereMapping.getOdate1(),  whereMapping.getOdate2(),  whereMapping.getOtargetdate1() , whereMapping.getOtargetdate2() );
        List<Tuple> resultPage = custRepository.selectDistinctWherePage(whereMapping.getCsname(),whereMapping.getPname(), whereMapping.getPno(), whereMapping.getOcode(),
                whereMapping.getOdate1(),  whereMapping.getOdate2(),  whereMapping.getOtargetdate1() , whereMapping.getOtargetdate2(), whereMapping.getPageIndex(), whereMapping.getPageSize());
        result.stream().map(tuple -> {
            FatherDTO fatherDTO = NativeResultProcessUtils.processResult(tuple, FatherDTO.class);
            a.add(fatherDTO);

            return fatherDTO;
        }).forEach(System.out::println);
        resultPage.stream().map(tuple -> {
            FatherDTO fatherDTO = NativeResultProcessUtils.processResult(tuple, FatherDTO.class);
            apage.add(fatherDTO);


            return fatherDTO;
        }).forEach(System.out::println);
        System.out.println(a);

        b.put("size",a.size());
        b.put("result",apage);



        return ResponseEntity.ok(b);
    }

    @PostMapping ("/childwhere")
    public ResponseEntity<?> childWhere(@RequestBody (required = false) WhereMapping whereMapping) {

        System.out.println(whereMapping.getOcode());
        System.out.println("odate1:"+ whereMapping.getOdate1());
        System.out.println("odate2:"+whereMapping.getOdate2());

        if(whereMapping.getOdate1().isEmpty()){
            whereMapping.setOdate1("1911-01-01");
        }
        if( whereMapping.getOdate2().isEmpty()){
            whereMapping.setOdate2("2099-12-31");
        }
        if(whereMapping.getOtargetdate1().isEmpty()){
            whereMapping.setOtargetdate1("1911-01-01");
        }
        if(whereMapping.getOtargetdate2().isEmpty()){
            whereMapping.setOtargetdate2("2099-12-31");
        }




        List<Map<String, Object>> result = custRepository.selectWhere(whereMapping.getCsname(),whereMapping.getPname(), whereMapping.getPno(), whereMapping.getOcode(),
                whereMapping.getOdate1(),  whereMapping.getOdate2(),  whereMapping.getOtargetdate1() , whereMapping.getOtargetdate2() );

        return ResponseEntity.ok(result);
    }

    @PostMapping("/user/login")
    public ResponseEntity<?> userLogin(@RequestBody UserlistEntity bean, HttpServletRequest request) throws Exception{
        String access_token = null;
        System.out.println(bean.getUserid());
        System.out.println(bean.getUserpw());
        try{

            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(bean.getUserid(),bean.getUserpw())
            );

            System.out.println("ok");
            Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
            //User user =(User) authResult.getPrincipal();
//            Collection<Roles> roles = userServiceImpl.getUser(bean.getUsername()).getRoles();
//            System.out.println(userServiceImpl.getUser(bean.getUsername()).getRoles());
            access_token = JWT.create()
                    .withSubject(bean.getUserid())
                    .withExpiresAt(new Date(System.currentTimeMillis() + 10*60*60*1000))
                    .withIssuer(request.getServletPath().toString())
//                    .withClaim("roles", roles.stream().map(Roles::getName).collect(Collectors.toList()))
                    .sign(algorithm);

        }
        catch (BadCredentialsException e){
            throw new Exception("Incorrect username or password",e);
        }
        Map<String, String> tokens = new HashMap<>();
        tokens.put("access_token", access_token);
//        tokens.put("name",userServiceImpl.getUser(bean.getUsername()).getName());


        return ResponseEntity.ok(tokens);
    }

    @GetMapping("/token/refresh")
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws Exception {
        String authorizationHeader = request.getHeader(AUTHORIZATION);
        if (authorizationHeader != null && authorizationHeader.startsWith("Cadtech ")) {
            try {
                String refresh_token = authorizationHeader.substring("Cadtech ".length());
                Algorithm algorithm = Algorithm.HMAC256("secret".getBytes());
                JWTVerifier verifier = JWT.require(algorithm).build();
                DecodedJWT decodedJWT = verifier.verify(refresh_token);
                String username = decodedJWT.getSubject();
                Optional<UserlistEntity> user = userListRepository.findById(username);
                String access_token = JWT.create().withSubject(user.get().getUserid())
                        .withExpiresAt(new Date(System.currentTimeMillis() + 10 * 60 * 1000))
                        .withIssuer(request.getRequestURL().toString())
//                        .withClaim("roles", user.getRoles().stream().map(Roles::getName).collect(Collectors.toList()))
                        .sign(algorithm);

                Map<String, String> tokens = new HashMap<>();
                tokens.put("access_token", access_token);
                tokens.put("refresh_token", refresh_token);
                response.setContentType("application/json");
                new ObjectMapper().writeValue(response.getOutputStream(), tokens);

            } catch (Exception e) {

                response.setHeader("error", e.getMessage());
                response.setStatus(FORBIDDEN.value());
                // response.sendError(FORBIDDEN.value());

                Map<String, String> error = new HashMap<>();
                error.put("error_message", e.getMessage());

                response.setContentType("application/json");
                new ObjectMapper().writeValue(response.getOutputStream(), error);
            }

        } else {
            throw new RuntimeException("Refresh token is missing");
        }
    }
    @GetMapping("/ordered/{id}")
    public ResponseEntity ordered(@PathVariable("id") Integer id){
        Optional<OrderdEntity> result = orderdRepository.findById(id);
        List<MakeOrderDetailEntity> abc = result.get().getProductEntity().getMakeOrderDetailEntities();
        ArrayList<List<MakeOrderProcessEntity>> orders = new ArrayList<>();
        for (MakeOrderDetailEntity item : abc){
            orders.add(item.getMakeOrderProcessEntities());
        }

        return ResponseEntity.ok(orders);

    }
}
@Data
@NoArgsConstructor
@AllArgsConstructor
class WhereMapping{
    private String csname;
    private String pname;
    private String pno;
    private String ocode;
    private String odate1;
    private String odate2;
    private String otargetdate1;
    private String otargetdate2;
    private Integer pageIndex;
    private Integer pageSize;
}

