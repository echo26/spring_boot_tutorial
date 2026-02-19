package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.persistence.autoconfigure.EntityScan;

@SpringBootApplication
@EntityScan("com.example.demo.entity")
public class HellobootApplication {
	public static void main(String[] args) {
		SpringApplication.run(HellobootApplication.class, args);
	}
}
