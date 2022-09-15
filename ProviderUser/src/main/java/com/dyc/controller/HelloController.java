package com.dyc.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@RequestMapping("/eureka/hello/{name}")
	public String hello(@PathVariable String name) {
		
		return "eureka provicer :" + name;
	}
}
