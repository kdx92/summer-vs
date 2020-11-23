package com.atguigu.springboot.config;

import com.atguigu.springboot.filter.MyFilter;
import com.atguigu.springboot.listener.MyListener;
import com.atguigu.springboot.servlet.MyServlet;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletListenerRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.servlet.Filter;
import javax.servlet.Servlet;
import javax.servlet.ServletRegistration;
import java.util.Arrays;

@Configuration
public class MyServerConfig {

//    注册三大组件
    @Bean
    public ServletRegistrationBean myServlet(){
        ServletRegistrationBean registrationBean = new ServletRegistrationBean<>(new MyServlet(),"/myServlet");
        registrationBean.setLoadOnStartup(1);
        return registrationBean;

    }
    @Bean
    public FilterRegistrationBean myFilter(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean<>();
        filterRegistrationBean.setFilter(new MyFilter());
        filterRegistrationBean.setUrlPatterns(Arrays.asList("/hello","/myServlet"));
        return filterRegistrationBean;
    }

    @Bean
    public ServletListenerRegistrationBean myListener(){
        ServletListenerRegistrationBean<MyListener> servletListenerRegistrationBean = new ServletListenerRegistrationBean<>(new MyListener());
        return servletListenerRegistrationBean;
    }
//    配置嵌入式的Servlet容器
    @Bean
    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
        return new WebServerFactoryCustomizer<ConfigurableWebServerFactory>(){

            //            定制嵌入式的Servlet容器相关的规则
            @Override
            public void customize(ConfigurableWebServerFactory factory) {
                factory.setPort(8083);
            }
        };
    }
}
