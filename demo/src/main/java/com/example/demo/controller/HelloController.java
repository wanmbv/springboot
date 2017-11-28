package com.example.demo.controller;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	Log log = LogFactory.getLog(HelloController.class);
	
	@RequestMapping("/hello")
	public String world(){
		log.info("hhhhhh");
		return "Hello World!";
	}

}
