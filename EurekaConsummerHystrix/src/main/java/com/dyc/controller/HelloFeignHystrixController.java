package com.dyc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dyc.feign_hystrix.HelloFiegnHystrix;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

@RestController
public class HelloFeignHystrixController {
	
	@Autowired
	private HelloFiegnHystrix helloFiegnHystrix;

	@RequestMapping("/eureka/hello/{name}")
	@HystrixCommand(fallbackMethod = "hellFallback")
	public String hello(@PathVariable String name) {
		
		return helloFiegnHystrix.hello(name);
	}
	
	public String hellFallback(String name) {
		return "Hello, 😄,🦔";
	}
}
