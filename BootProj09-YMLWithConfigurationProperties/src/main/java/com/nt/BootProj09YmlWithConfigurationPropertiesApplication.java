package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Employee;

@SpringBootApplication
public class BootProj09YmlWithConfigurationPropertiesApplication {

	public static void main(String[] args) {
		
		// getting ioc container
		ApplicationContext ctx=SpringApplication
				.run(BootProj09YmlWithConfigurationPropertiesApplication.class, args);
		
		
		//getting spring bean class object
		Employee emp=ctx.getBean("emp",Employee.class);
		System.out.println(emp);
		
		//closing ioc
		((ConfigurableApplicationContext) ctx).close();
	}

}
