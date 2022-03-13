package com.example.sample01;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
//@ComponentScan(basePackages = {"com.example.sample01"})
@MapperScan("com.example.sample01.**.mapper.**")
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }



}
