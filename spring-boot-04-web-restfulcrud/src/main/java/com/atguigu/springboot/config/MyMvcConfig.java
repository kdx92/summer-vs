package com.atguigu.springboot.config;

import com.atguigu.springboot.component.LoginHandlerInterceptor;
import com.atguigu.springboot.component.MyLocaleResolver;
import org.springframework.boot.autoconfigure.web.embedded.EmbeddedWebServerFactoryCustomizerAutoConfiguration;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.server.ConfigurableServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.*;

import java.awt.*;
import java.util.Locale;

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
// 将组件注册在容器
    @Bean
    public WebMvcConfigurer webMvcConfigurerAdapter(){
        WebMvcConfigurer configuer = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
//                super.addViewControllers(registry);
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                super.addInterceptors(registry);
                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
                        .excludePathPatterns("/index.html","/","/user/login","/webjars/**","/asserts/**");
            }
        };
        return configuer;

    }

    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
