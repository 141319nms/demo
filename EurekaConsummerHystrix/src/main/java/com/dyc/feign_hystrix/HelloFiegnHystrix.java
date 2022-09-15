package com.dyc.feign_hystrix;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

//FeignClient注解，用于关联到Eureka中的服务提供者provider-user
//这样将接口匹配到服务提供者的url+api
@FeignClient("provider-user")
public interface HelloFiegnHystrix {

	//接口映射api，对提供者的服务调用
	//@PathVariable("name") feign要求必须
	@RequestMapping("/eureka/hello/{name}")
	public String hello(@PathVariable("name") String name);
}
