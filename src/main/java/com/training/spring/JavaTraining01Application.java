package com.training.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JavaTraining01Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaTraining01Application.class, args);
	}
	
	
	@RequestMapping(value="/hello", method=RequestMethod.GET)
	public String hello() {
		return "Hello from the Spring Microservice project ...";
	}
}
