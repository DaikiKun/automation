package com.osk.hub;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ApiPractice5Application {
	private static final Logger LOGGER=LoggerFactory.getLogger(ApiPractice5Application.class);
	public static void main(String[] args) {
		SpringApplication.run(ApiPractice5Application.class, args);
		
		LOGGER.info(" MY FIRST LOGGER");
	}

}
