package com.boge.springmybatis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.boge.springmybatis.dao")
public class SpringmybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringmybatisApplication.class, args);
    }
}
