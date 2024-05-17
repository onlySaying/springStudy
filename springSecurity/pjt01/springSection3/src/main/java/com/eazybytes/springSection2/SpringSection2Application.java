package com.eazybytes.springSection2;

import com.eazybytes.springSection2.config.ProjectSecurityConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

@SpringBootApplication
public class SpringSection2Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringSection2Application.class, args);
	}

}