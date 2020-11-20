package com.atguigu.springboot;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBoot03LoggingApplicationTests {

    //记录器
    Logger logger = LoggerFactory.getLogger(getClass());
    @Test
    void contextLoads() {

//        日志的级别
//        由低到高
//        trace<debug<info<warn<error
//        可以调整输出的日志级别，日志就只会在这个级别以后的高级别生效

//        logger.trace("这是trace日志");
//        logger.debug("这是debug日志");
//        logger.info("这是info日志");
//        logger.warn("这是warn日志");
//        logger.error("这是error日志");
    }

}
