package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Hotel;

@SpringBootApplication
public class BootProj06DataInjectionUsingValueAnnotationApplication {

	public static void main(String[] args) {
		//creating IOC Container
		ApplicationContext ctx=SpringApplication.run(BootProj06DataInjectionUsingValueAnnotationApplication.class, args);
		
		//getting hotel object ref
		Hotel hotel=ctx.getBean("hotel",Hotel.class);
		System.out.println(hotel);
		
		//closing IOC Container
		((ConfigurableApplicationContext) ctx).close();
	}

}
