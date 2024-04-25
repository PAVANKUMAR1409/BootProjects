package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vechile;

@SpringBootApplication
public class BootProj02DependencyInjection2Application {

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run
				(BootProj02DependencyInjection2Application.class, args);
		Vechile v=ctx.getBean("vechile",Vechile.class);
		v.journey("hyd", "goa");
		((ConfigurableApplicationContext) ctx).close();
	}

}
