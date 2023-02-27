package com.imranmadbar.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.imran.appcore.CoreCommonFunction;

@RestController
public class HomeController implements CoreCommonFunction{

	Logger logger = LoggerFactory.getLogger(HomeController.class);

	@GetMapping(value = "/")
	public String welcomeMsg() {
		logger.info("Welcome to SimpleWebApplication");
		return "Welcome to SimpleWebApplication";
	}
	
	@GetMapping(value = "/2")
	public String helloMsg2() {
		logger.info("Welcome to ModuleOneApp | " + getSimpleMsg());
		return "Welcome to ModuleOneApp | " + getSimpleMsg();
	}

	@GetMapping(value = "/home")
	public String helloMsg() {
		logger.info("Welcome Home to Spring Boot  SimpleWebApplication");
		return "Welcome Home to Spring Boot  SimpleWebApplication";
	}

}
