package com.ex.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class appz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			AbstractApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
			Life Life=(Life)context.getBean("life");
			Life.live();
			context.close();
	}

}
