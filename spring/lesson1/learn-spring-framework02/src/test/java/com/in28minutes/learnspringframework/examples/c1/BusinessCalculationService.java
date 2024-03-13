package com.in28minutes.learnspringframework.examples.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.examples.c1.DataService;

@Component
public class BusinessCalculationService {
	DataService dataService;
	
	public BusinessCalculationService(DataService dataService)
	{
		super();
		this.dataService = dataService;
	}
	
	public int findMax()
	{
		return Arrays.stream(dataService.retreveData()).max().orElse(0);
	}
}
