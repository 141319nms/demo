package com.dyc.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.util.JSONPObject;


@RestController
public class OtherServerContoller {

	@RequestMapping(value = {"/","/index","/home"})
	public String home() {
		
		return "{\"index\": \"欢迎来到其他服务\"}";
	}
	
	@RequestMapping(value = {"/health.json"})
	public Map<String, Object> healthJson() {

		Map<String, Object> map = new HashMap<String, Object>();
		map.put("status", "UP");
		return map;
	}
}
