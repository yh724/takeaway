package com.yh.takeawaysystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.yh.takeawaysystem.dao")
public class TakeawaySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(TakeawaySystemApplication.class, args);
    }

}
