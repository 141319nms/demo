package com.dyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunAppEurekaProvider {

	public static void main(String[] args) {
		SpringApplication.run(RunAppEurekaProvider.class, args);
	}

}
