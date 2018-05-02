package com.f22pkj31;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.f22pkj31.dao")
public class LeadcampusbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(LeadcampusbootApplication.class, args);
    }
}
