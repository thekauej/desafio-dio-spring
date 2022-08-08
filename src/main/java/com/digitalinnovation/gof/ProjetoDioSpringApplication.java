package com.digitalinnovation.gof;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class ProjetoDioSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoDioSpringApplication.class, args);

	}

}