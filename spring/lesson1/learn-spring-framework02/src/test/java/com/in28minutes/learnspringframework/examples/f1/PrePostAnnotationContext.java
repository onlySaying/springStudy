package com.in28minutes.learnspringframework.examples.f1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

@Component
class SomeClass
{
	private SomeDependency somedef;
	
	public SomeClass(SomeDependency somedef)
	{
		super();
		this.somedef = somedef;
		System.out.println("All defendencies are ready!");
	}
	
	//가장 먼저 호출한다.
	@PostConstruct
	public void initialize()
	{
		somedef.getReady();
	}
	
	@PreDestroy
	public void cleanUP()
	{
		System.out.println("clean up");
	}
}

@Component
class SomeDependency
{
	public void getReady()
	{
		System.out.println("some logic using this");
	}
}

@Configuration
@ComponentScan
public class PrePostAnnotationContext {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(PrePostAnnotationContext.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);;
		}
		
	}

}
