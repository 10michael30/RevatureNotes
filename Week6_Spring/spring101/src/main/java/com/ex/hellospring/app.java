package com.ex.hellospring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
	//	ApplicationContext context2= new ClassPathXmlApplicationContext("beans.xml");
		//dont use multiple context files use prototype in beans xml
		
		
		//must cast the object
		Helloworld world=(Helloworld)context.getBean("thisIsABean");
		//Spring does not use the new keyword for its beans
		
		System.out.println(world.getMessage());
		
		world.setMessage("I changed my message");
		System.out.println(world.getMessage());
		
		DepBean dep=(DepBean)context.getBean("dependent");
		//Beans are singleton meaning i am getting same object
		//so if i change this message when i call it later i get the changed message
		System.out.println(dep.getHello().getMessage());
	}

}