package com.managementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.util.ResourceUtils;
import org.springframework.web.servlet.View;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.Locale;
//import com.managementsystem.model.PageResult;
//
//import java.io.File;

//使用WebMvcConfigurerAdapter可以来扩展SpringMVC的功能

@SpringBootApplication
@ComponentScan(basePackages = {"com.managementsystem"})
@MapperScan(basePackages={"com.managementsystem.mapper"})
public class CustomerResearchApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerResearchApplication.class, args);
    }

    @Bean
    public PasswordEncoder createPwdEncoder(){

        return new BCryptPasswordEncoder();
//        将密码进行多次的MD5加密

    }
//    @Bean
//    public ViewResolver myViewReolver(){
//        return new MyViewResolver();
//    }
//
//    private static class MyViewResolver implements ViewResolver{
//
//        @Override
//        public View resolveViewName(String s, Locale locale) throws Exception {
//            return null;
//        }
//    }

}

