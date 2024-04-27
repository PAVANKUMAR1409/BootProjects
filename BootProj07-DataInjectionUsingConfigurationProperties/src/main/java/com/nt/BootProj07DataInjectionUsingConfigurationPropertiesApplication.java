package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Company;

@SpringBootApplication
public class BootProj07DataInjectionUsingConfigurationPropertiesApplication {

	public static void main(String[] args) {
		//creating ioc container
		ApplicationContext ctx=SpringApplication
				.run(BootProj07DataInjectionUsingConfigurationPropertiesApplication.class, args);
		
		//getting spring bean object
		Company c=ctx.getBean("company",Company.class);
		System.out.println(c);
		
		//closing ioc 
		((ConfigurableApplicationContext) ctx).close();
	}

}
