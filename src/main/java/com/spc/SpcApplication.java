package com.spc;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = {"com.spc.mapper"})
public class SpcApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpcApplication.class, args);
    }

}
