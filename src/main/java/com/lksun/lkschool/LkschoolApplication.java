package com.lksun.lkschool;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lksun.lkschool.mapper")
public class LkschoolApplication {

    public static void main(String[] args) {
        SpringApplication.run(LkschoolApplication.class, args);
    }

}
