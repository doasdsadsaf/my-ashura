package com.example.ashura.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AshuraWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(AshuraWebApplication.class, args);
        System.out.println("启动成功");
    }

}
