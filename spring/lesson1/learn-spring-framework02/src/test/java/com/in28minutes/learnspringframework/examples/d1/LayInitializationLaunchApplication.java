package com.in28minutes.learnspringframework.examples.d1;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Component
class ClassA
{
	
}

@Component
@Lazy // 사용시 초기화 발생하게 만드는 annotation
class classB
{
	private ClassA classA;
	public classB(ClassA classA)
	{
		System.out.println("aaa");
		this.classA = classA;
	}
}

@Configuration
@ComponentScan
public class LayInitializationLaunchApplication {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(LayInitializationLaunchApplication.class)) 
		{
			Arrays.stream(context.getBeanDefinitionNames())
			.forEach(System.out::println);;
		}
		
	}

}