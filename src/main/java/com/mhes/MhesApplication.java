package com.mhes;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan
public class MhesApplication {

	public static void main(String[] args) {
		SpringApplication.run(MhesApplication.class, args);
	}

}