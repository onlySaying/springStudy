package com.in28minutes.learnspringframework.game;

import org.springframework.beans.BeansException;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.GamingConsole;

@Configuration
@ComponentScan("com.in28minutes.learnspringframework.game")
public class DepedencyInjectionLauncher {
	
	public static void main(String[] args) {
		
		try (var context = 
				new AnnotationConfigApplicationContext
				(DepedencyInjectionLauncher.class)) 
		{
			context.getBean(GamingConsole.class).up();
			context.getBean(GameRunner.class).run();
		} 
		catch (BeansException e) { 
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
