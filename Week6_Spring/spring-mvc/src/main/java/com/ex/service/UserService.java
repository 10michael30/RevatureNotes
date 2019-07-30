package com.ex.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ex.beans.User;


@Service
public class UserService {

	static ArrayList<User> users =new ArrayList<User>();
	
	
	static {
		
		users.add(new User("Mike","My Bio","password"));
		users.add(new User("Tom","toms Bio","password"));
		users.add(new User("Jerry","Jerry Bio","password"));
	}
	

	
	public List<User> getAll(){
		return users;
		
	}
	
	public User login(String username,String password) {
		
		Optional<User> user=users.stream().filter(u->u.getName().equalsIgnoreCase(username)).findFirst();
		
		
		if(user.isPresent()) {
			if(user.get().getPassword().equals(password)) {
				return user.get();
			}
			
		}
		
		return null;
		
	}
}
