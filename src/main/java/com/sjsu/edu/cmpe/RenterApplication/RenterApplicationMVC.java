package com.sjsu.edu.cmpe.RenterApplication;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.stereotype.Controller;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RenterApplicationMVC implements WebMvcConfigurer{
	

	public void addViewControllers(ViewControllerRegistry registry) {
		registry.addViewController("/").setViewName("index");

		
	}
	


}
