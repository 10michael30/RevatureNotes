package com.ex.run;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ex.beans.Author;
import com.ex.service.AuthorService;

public class app {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	ApplicationContext context=new ClassPathXmlApplicationContext("beans.xml");
	
	AuthorService service=context.getBean("authorService",AuthorService.class);
	
	Author a=new Author("Stephen","King","This guy is weird");
	
	service.addAuthor(a);
	}

}
