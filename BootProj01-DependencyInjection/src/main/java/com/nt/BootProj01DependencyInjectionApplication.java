package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbeans.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionApplication {
	
	@Bean(name="id")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		
		//get IOC Container
		ApplicationContext ctx=
				SpringApplication.run
					(BootProj01DependencyInjectionApplication.class, args);
		
		//get target spring bean class object
		SeasonFinder season=ctx.getBean("season",SeasonFinder.class);
		
		//invoke business method
		String result=season.findSeason();
		System.out.println("This is "+result);
		
		//close the container
		((ConfigurableApplicationContext)ctx).close();
	}

}
