package com.example.github;

import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ch.qos.logback.classic.Logger;

@SpringBootApplication
public class JenkinsApplication {
	public static org.slf4j.Logger logger=LoggerFactory.getLogger(JenkinsApplication.class);

	public static void main(String[] args) {
	    logger.info("application started");
		SpringApplication.run(JenkinsApplication.class, args);
	}

}
