package com.nt;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.bean.Employee;
import com.nt.controller.PayrollOperationController;

@SpringBootApplication
public class BootProj11LayeredAppFor4ProfilesApplication {
	
//	@Autowired
//	private Environment env;
	
//	@Bean
//	@Profile("test")
//	public ComboPooledDataSource createC3P0s()throws Exception{
//		ComboPooledDataSource cds= new ComboPooledDataSource();
//		cds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
//		cds.setJdbcUrl(env.getProperty("spring.datasource.url"));
//		cds.setUser(env.getProperty("spring.datasource.username"));
//		cds.setPassword(env.getProperty("spring.datasource.password"));
//		
//		cds.setMinPoolSize(Integer.parseInt(env.getProperty("c3P0.minSize")));
//		cds.setMaxPoolSize(Integer.parseInt(env.getProperty("c3P0.maxSize")));
//		return cds;
//	}
 	
	public static void main(String[] args) {
		//creating IOC container
		ApplicationContext ctx=SpringApplication
				.run(BootProj11LayeredAppFor4ProfilesApplication.class, args);
		
		PayrollOperationController controller=ctx.getBean("payroll",PayrollOperationController.class);
		
		try {
			List<Employee> list=controller.showAllEmployeeByDesgs("CLERK","MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}// end of try
		catch(Exception e) {e.printStackTrace();}
		((ConfigurableApplicationContext) ctx).close();
	}

}
