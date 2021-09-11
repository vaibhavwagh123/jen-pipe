package com.job.jenpipe;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/job")
public class TestController {
	@GetMapping("/hello")
	String hello()throws Exception{
		//test method
		return "Hello World";
	}
}
