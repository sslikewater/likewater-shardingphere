package com.example.sharding.complex;

import com.sankuai.inf.leaf.plugin.annotation.EnableLeafServer;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableLeafServer

@MapperScan("com.example.**.mapper.**")
public class ShardingComplexStrategyExampleApplication {


    public static void main(String[] args) {
        SpringApplication.run(ShardingComplexStrategyExampleApplication.class, args);

    }

}
