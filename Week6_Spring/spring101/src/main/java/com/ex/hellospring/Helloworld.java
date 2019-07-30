package com.ex.hellospring;


//Beans must have a no args constructor
public class Helloworld {
	
	public Helloworld() {
		
		System.out.println("In no args constructor");
	}

	public Helloworld(String message) {
		super();
		this.message = message;
		
	//	System.out.println("In message constructor");
	}

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
		System.out.println("in set message()");
	}

}
