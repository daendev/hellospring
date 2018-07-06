package com.daendev.hellospring.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.daendev.hellospring.model.Greeting;

@RestController
@RequestMapping("/data")
public class HelloSpringController {

	@RequestMapping("/hello")
	public Greeting hi() {
		return new Greeting(0, "Hello", "World");
	}
	
}
