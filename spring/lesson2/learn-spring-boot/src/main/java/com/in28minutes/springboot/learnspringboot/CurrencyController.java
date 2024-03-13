package com.in28minutes.springboot.learnspringboot;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class CurrencyController {
	//courses
	// Course : id, name, author
	@Autowired
	private currencyService configuration;
	@RequestMapping("/currency-configuration")
	public currencyService retrievAllCourses()
	{
		return configuration;
	}
}
