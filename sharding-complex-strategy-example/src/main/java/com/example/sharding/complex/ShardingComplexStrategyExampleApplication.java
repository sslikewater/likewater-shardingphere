package com.example.sharding.complex;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.**.mapper.**")
public class ShardingComplexStrategyExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingComplexStrategyExampleApplication.class, args);
    }

}
