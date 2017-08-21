package com.yammii.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.yammii.demo.Demo1;

@RestController
public class MyController {

	@RequestMapping(value = "/test/{id}", method = RequestMethod.POST)
	public String getStr() {
		System.out.println("testing getStr");
		Demo1.apiKey = "apikey";
		Demo1.secret = "secret";
		return "OK~~~";
	}
	
	@RequestMapping("/test1")
	public String getStr1() {
		System.out.println("testing getStr");
		return Demo1.apiKey + "~~~" + Demo1.secret;
	}
}
