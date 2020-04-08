package com.sjsu.edu.cmpe.RenterApplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class})
public class RenterApplication {

	public static void main(String[] args) {
		SpringApplication.run(RenterApplication.class, args);
	}

}
