package com.example.pcr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.pcr")
public class PcrApplication {

	public static void main(String[] args) {
		SpringApplication.run(PcrApplication.class, args);
		System.out.println("Hello world!");
	}

}
