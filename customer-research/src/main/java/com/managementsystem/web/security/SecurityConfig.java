package com.managementsystem.web.security;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

//启动web安全功能
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers()
                .frameOptions().sameOrigin()
                .httpStrictTransportSecurity().disable();

        http.authorizeRequests()
//                .antMatchers("/prodorder").hasRole("ROLE_USER")
//                设置所有的访问路径都需要认证
//                .antMatchers("/prodorder/list").hasAnyAuthority("PROD READ")
//                .antMatchers("/prodorder/add").hasAnyAuthority("PROD ADD")
//                .antMatchers("/prodorder/detail").hasAnyAuthority("PROD READ")
//                .antMatchers("/prodorder/delete").hasAnyAuthority("PROD DELETE")
//                .antMatchers("/prodorder/save").hasAnyAuthority("PROD SAVE")
//                .antMatchers("/prodorder/edit").hasAnyAuthority("PROD EDIT")
//                .antMatchers("/prodorder/listJson").hasAnyAuthority("PROD READ")
//                代表login不需要拦截
                .antMatchers("/**").fullyAuthenticated()
//                .antMatchers("/index").fullyAuthenticated()
//                .antMatchers("/prodorder/detail").fullyAuthenticated()
//                .antMatchers("/prodorder/list").fullyAuthenticated()

                .and()

                .formLogin();
//                .loginPage("/login");

//                .defaultSuccessUrl("/index");
//                设置登录页面
//                .failureUrl("https://www.baidu.com/");
    }
}
