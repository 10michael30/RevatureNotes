package com.ex.beans;

import org.springframework.stereotype.Component;

@Component
public class User {
	
	private String name;
	private String aboutMe;
	private String password;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAboutMe() {
		return aboutMe;
	}
	public void setAboutMe(String aboutMe) {
		this.aboutMe = aboutMe;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public User() {
		super();
	}
	public User(String name, String aboutMe, String password) {
		super();
		this.name = name;
		this.aboutMe = aboutMe;
		this.password = password;
	}

}
