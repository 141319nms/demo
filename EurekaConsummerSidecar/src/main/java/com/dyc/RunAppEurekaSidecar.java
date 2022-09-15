package com.dyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
//@EnableEurekaClient
//@EnableZuulProxy
@EnableSidecar
public class RunAppEurekaSidecar {

	public static void main(String[] args) {

		SpringApplication.run(RunAppEurekaSidecar.class, args);
	}

}
