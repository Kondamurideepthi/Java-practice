package org.example.SpringApp;

import org.example.SpringApp.model.Alien;
import org.example.SpringApp.model.Laptop;
import org.example.SpringApp.service.ServiceLaptop;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringAppApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(SpringAppApplication.class, args);

		ServiceLaptop service = context.getBean(ServiceLaptop.class);
		Laptop lap = context.getBean(Laptop.class);
		service.addLaptop(lap);


//		Alien  obj = context.getBean(Alien.class);
//		obj.code();
//		System.out.print(obj.getAge());
	}

}
