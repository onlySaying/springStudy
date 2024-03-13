package com.in28minutes.learnspringframework.examples.a1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

// 자동으로 bean 생성
@Component
class YourBusinessClass
{
	//생성자에 autowired하는 것을 스프링에서는 추천함
	@Autowired
	Dependency1 dep1;
	@Autowired
	Dependency2 dep2;
	
	public void setDep1(Dependency1 dep1) {
		this.dep1 = dep1;
	}

	public void setDep2(Dependency2 dep2) {
		this.dep2 = dep2;
	}

	public String toString()
	{
		return "Using" + dep1 + " and " + dep2;
	}
}

@Component
class Dependency1
{
	
}

@Component
class Dependency2
{
	
}


@Configuration
@ComponentScan
public class DepInjection {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(DepInjection.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);
			System.out.println(context.getBean( YourBusinessClass.class));
		}
		
	}

}
