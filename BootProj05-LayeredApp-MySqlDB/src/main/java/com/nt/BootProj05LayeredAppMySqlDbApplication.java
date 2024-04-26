package com.nt;

import java.beans.PropertyVetoException;
import java.util.Arrays;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import com.nt.bean.Employee;
import com.nt.controller.PayrollOperationController;

@SpringBootApplication
public class BootProj05LayeredAppMySqlDbApplication {
	
	/*@Bean
	public ComboPooledDataSource createC3P0Ds() throws Exception {
		ComboPooledDataSource ds= new ComboPooledDataSource();
		ds.setDriverClass("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:orcl");
		ds.setUser("c##pavan"); ds.setPassword("pavankumar");
		return ds;
	}*/

	public static void main(String[] args) {
		ApplicationContext ctx=
				SpringApplication.run(BootProj05LayeredAppMySqlDbApplication.class, args);
		
		
		PayrollOperationController controller=ctx.getBean("payroll",PayrollOperationController.class);
		
		try {
			List<Employee> list=controller.showAllEmployeeByDesgs("CLERK","MANAGER", "SALESMAN");
			list.forEach(emp->{
				System.out.println(emp);
			});
		}// end of try
		catch(Exception e) {e.printStackTrace();}
		
//		String beanIds[]=ctx.getBeanDefinitionNames();
//		System.out.println("All bean ids are : "+Arrays.toString(beanIds));
		
		((ConfigurableApplicationContext) ctx).close();
	}

}
