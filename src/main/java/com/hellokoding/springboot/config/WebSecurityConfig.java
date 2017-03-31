/*
 * Copyright (c) 2013, FPX and/or its affiliates. All rights reserved.
 * Use, Copy is subject to authorized license.
 */
package com.hellokoding.springboot.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 安全控制
 * 
 * @author zengzw
 * @date 2017年3月31日
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{

    @Override
    protected void configure(HttpSecurity http) throws Exception {
   
        http.authorizeRequests()
        .antMatchers("/","/home").permitAll() // /home  /  不用认证。其他路径需要认证
        .anyRequest().authenticated()
        .and()
        .formLogin() //定义当需要用户登录时候，转到的登录页面。
        .loginPage("/login")
        .permitAll()
        .and()
        .logout().permitAll();
        super.configure(http);
    }
    
    
    /**
     * 创建了一个用户，该用户的名称为user，密码为password，用户角色为USER。
     * 
     * @param auth
     * @throws Exception
     */
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER");
    }
}
