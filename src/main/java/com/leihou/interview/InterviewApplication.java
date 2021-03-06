package com.leihou.interview;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * 项目启动类
 */
@MapperScan("com.leihou.interview.mapper")
@ComponentScan("com.leihou")
//@EnableTransactionManagement
//@EnableScheduling
@SpringBootApplication//(exclude = {DataSourceAutoConfiguration.class})
//@EnableAsync
@EnableSwagger2
public class InterviewApplication extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(
            SpringApplicationBuilder application) {
        return application.sources(InterviewApplication.class);
    }

    public static void main(String[] args) {
        SpringApplication.run(InterviewApplication.class, args);
    }




}
