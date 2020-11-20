package com.atguigu.springboot.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.*;

//使用WebMvcConfigurerAdapter可以扩展SpringMVC的功能
//@EnableWebMvc
// 不要接管SpringMVC
@Configuration
public class MyMvcConfig implements WebMvcConfigurer {
//    继承（不是）

//    @Override
//    public void addViewControllers(ViewControllerRegistry registry) {
////        super.addVIewControllers(registry);
////        浏览器发送/atguigu请求来到success
//        registry.addViewController("/atguigu").setViewName("login");
//
//    }

//    所有的WebMvcConfigurerAdapter组件都会一起起作用
    @Bean
// 将组件注册在容器
    public WebMvcConfigurer webMvcConfigurerAdapter(){
        WebMvcConfigurer configuer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/login.html").setViewName("login");
            }
        };
        return configuer;

    }
}
