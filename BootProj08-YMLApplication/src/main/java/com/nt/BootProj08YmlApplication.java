package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Customer;

@SpringBootApplication
public class BootProj08YmlApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(BootProj08YmlApplication.class, args);
		
		Customer customer=ctx.getBean("cust",Customer.class);
		System.out.println(customer);
		
		//closing ioc
		((ConfigurableApplicationContext) ctx).close();
	}

}
