package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;

@MapperScan("com.example.mapper")
@CrossOrigin
@SpringBootApplication
public class catApplication {
    public static void main(String[] args) {
        SpringApplication.run(catApplication.class, args);
    }

}
