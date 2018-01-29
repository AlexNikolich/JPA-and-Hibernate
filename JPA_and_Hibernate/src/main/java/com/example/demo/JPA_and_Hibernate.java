package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan
public class JPA_and_Hibernate {

	public static void main(String[] args) {
		SpringApplication.run(JPA_and_Hibernate.class, args);
		
	}
}
