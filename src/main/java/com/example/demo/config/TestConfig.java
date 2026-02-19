package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TestConfig {

    public TestConfig() {
        System.out.println("Test Config");
    }

    @Bean
    public MyBean MyBean() {
        return new MyBean();
    }
}