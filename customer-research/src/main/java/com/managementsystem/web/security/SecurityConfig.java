package com.managementsystem.web.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//启动web安全功能
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers()
                .frameOptions()
                .sameOrigin()
                .httpStrictTransportSecurity()
                .disable();
        http.authorizeRequests()
                .antMatchers("/prodorder/list").hasAnyAuthority("PRODORDER_READ")
                .antMatchers("/prodorder/detail").hasAnyAuthority("PRODORDER_READ")
                .antMatchers("/prodorder/listJson").hasAnyAuthority("PRODORDER_READ")
                .antMatchers("/prodorder/add").hasAnyAuthority("PRODORDER_ADD")
                .antMatchers("/prodorder/delete").hasAnyAuthority("PRODORDER_DELETE")
                .antMatchers("/prodorder/save").hasAnyAuthority("PRODORDER_SAVE")
                .antMatchers("/prodorder/edit").hasAnyAuthority("PRODORDER_EDIT")
                .antMatchers("/login").permitAll()
                .antMatchers("/**").fullyAuthenticated()
                .and()
                .formLogin()
                .loginPage("/login")
                .permitAll()
                .defaultSuccessUrl("/index", true)
                .and()
                .csrf()
                    .disable()
                    .httpBasic();
    }
}
