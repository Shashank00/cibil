package com.axis.cibil;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.axis.cibil.*")
public class CibilApplication {

	public static void main(String[] args) {
		SpringApplication.run(CibilApplication.class, args);
	}

}
