package com.in28minutes.learnspringframework.examples.c1;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBDataService implements DataService{

	@Override
	public int[] retreveData() {
		// TODO Auto-generated method stub
		return new int[] {11,22,33,44,55};
	}
	
}
