package com.nt;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.bean.Employee;
import com.nt.controller.PayrollOperationController;

@SpringBootApplication
public class BootProj04LayeredAppApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(BootProj04LayeredAppApplication.class, args);
		
		
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
