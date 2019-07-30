package com.revature.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.revature.model.IceCream;
import com.revature.repository.IceCreamRepository;

@Service
public class IceCreamService {
	
	@Autowired
	private IceCreamRepository iceCreamRepository;
	
	public IceCream create(IceCream iceCream) {
		return iceCreamRepository.save(iceCream);
	}
	
	//this is kind of like our getbyusername passing in a string
	//and searching by the username 
	
	public IceCream getIceCream(String flavor) {
		return iceCreamRepository.findById(flavor).get();
		
	}
	
	public List<IceCream> getAllIceCream(){
		return iceCreamRepository.findAll();
	}

}
