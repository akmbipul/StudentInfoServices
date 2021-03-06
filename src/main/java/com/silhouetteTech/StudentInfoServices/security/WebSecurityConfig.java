package com.silhouetteTech.StudentInfoServices.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(HttpSecurity httpSecurity)throws Exception{
        httpSecurity.csrf().disable().authorizeRequests().antMatchers("/api/*").permitAll();
        httpSecurity.formLogin().loginPage("/login").permitAll();
        httpSecurity.logout().permitAll();
    }

}
