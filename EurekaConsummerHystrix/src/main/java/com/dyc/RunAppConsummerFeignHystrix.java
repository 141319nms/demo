package com.dyc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
//import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

//@SpringCloudApplication wrapped in SpringBootApplication
@SpringBootApplication
@EnableFeignClients
@EnableHystrix
public class RunAppConsummerFeignHystrix {

	public static void main(String[] args) {

		SpringApplication.run(RunAppConsummerFeignHystrix.class, args);
	}

}
