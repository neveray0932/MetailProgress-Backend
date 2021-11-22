package com.cadtech.metalprogress.service;



import com.cadtech.metalprogress.domain.UserlistEntity;
import com.cadtech.metalprogress.repository.UserListRepository;
import lombok.RequiredArgsConstructor;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;


@Service
@RequiredArgsConstructor
@Transactional

public class UserListService implements UserDetailsService { //實作UserService,UserDetailsService介面
    private final UserListRepository userRespository;

    private final PasswordEncoder passwordEncoder;


    @Override //UserDetailsService的方法
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserlistEntity user = userRespository.findByUserid(username); //驗證資料庫裡的資料

        //進行登入者與腳色匹配
        Collection<SimpleGrantedAuthority> authorities = new ArrayList<>();
//        user.getRoles().forEach(role ->{
//
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//        });
        return new org.springframework.security.core.userdetails.User(user.getUserid(),new BCryptPasswordEncoder().encode(user.getUserpw()) , authorities);
    }






}
