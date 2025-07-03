package com.example.SpringProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import static org.springframework.boot.SpringApplication.run;

@SpringBootApplication
public class SpringProjectApplication {

	public static void main(String[] args)
	{
		ApplicationContext context =  SpringApplication.run(SpringProjectApplication.class, args);

		Alien obj = context.getBean(Alien.class);
		obj.code();

//		System.out.print("Hello world");
	}

}
