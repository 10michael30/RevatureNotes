package com.ex.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");

		Employee employee=(Employee)context.getBean("Employee");
		
		employee.getDepartment().setName("Training Team");
		
		
		Department dept=(Department)context.getBean("Department");
		
		System.out.println(dept.getName());
	}

}
