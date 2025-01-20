package com.spring_jenkins.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	public  static Logger logger = LoggerFactory.getLogger(DemoApplication.class);

	public  void init(){
		logger.info("The Spring Jenkins integration application has been started");
	}


	public static void main(String[] args) {
		logger.info("Application executed");
		SpringApplication.run(DemoApplication.class, args);
	}

}
