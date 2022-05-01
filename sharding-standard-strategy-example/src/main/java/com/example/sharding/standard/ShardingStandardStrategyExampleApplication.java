package com.example.sharding.standard;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.**.mapper.**")
public class ShardingStandardStrategyExampleApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingStandardStrategyExampleApplication.class, args);
    }

}
