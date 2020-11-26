package com.managementsystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
//import com.managementsystem.model.PageResult;
//
//import java.io.File;

@SpringBootApplication
@ComponentScan(basePackages = {"com.managementsystem"})
@MapperScan(basePackages={"com.managementsystem.mapper"})
public class CustomerResearchApplication {

    public static void main(String[] args) {

        SpringApplication.run(CustomerResearchApplication.class, args);
    }

}

//@ComponentScan("com.managementsystem.**")
//@ComponentScan("com.managementsystem")
//
//@MapperScan("com.managementsystem.mapper")

//扫描Mapper