package com.in28minute.learnspringsecurity.resources;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SpringSecurityPlayResource {
	
	@GetMapping("/hello-world")
	public String helloWorld()
	{
		return "Hello World v1";
	}
}
