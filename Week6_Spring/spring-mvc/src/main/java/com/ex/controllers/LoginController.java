package com.ex.controllers;

//make this package 

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ex.beans.User;
import com.ex.service.UserService;

@Controller
public class LoginController {
	@Autowired
	static UserService service=new UserService();
	
	@CrossOrigin(origins="http://localhost:4200/recipeapp")
	@RequestMapping(value="/home1", method=RequestMethod.GET)
	public String getHomePage(HttpSession s) {
		System.out.println("Get homepage");
		if(s.getAttribute("user")==null) {
			
			System.out.println();
			return "home";
		}
		else {
			return "landing";
		}
		
	}
	
	@CrossOrigin(origins="http://localhost:4200")
	@RequestMapping(value="/login1",method=RequestMethod.POST)
	public String login(HttpServletRequest req) {
		String name=(String) req.getAttribute("username");
		
		System.out.println("Touched login");
		
		req.getAttribute("password");
		String password=(String) req.getAttribute("password");
		
		
		System.out.println("name and passsowrd:  "+name+" : "+password );
		User u=service.login(name,password);
	
		
		if(u==null) {
			
			System.out.println("no user found");
			return "redirect:home";
			
			
		}
		else {
			
			System.out.println("It worked!");
			
			HttpSession session=req.getSession();
			session.setAttribute("user", u);
			
			
			return "redirect:home";
		}
		
		
		
	}
}
