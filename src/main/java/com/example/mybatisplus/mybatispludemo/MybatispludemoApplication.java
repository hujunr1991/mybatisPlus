package com.example.mybatisplus.mybatispludemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.mybatisplus.mybatispludemo.mapper")
public class MybatispludemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatispludemoApplication.class, args);
    }

}
