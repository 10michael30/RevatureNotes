package com.ex.autowire;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

//dependency using spring annotations
/*
 * @Component-registers any class as a bean
 * @Service-used for buisness logic layer, does not indicate a web service
 * @Repository- used for DAO layer
 */

@Component//can be used to register any bean
@Scope("prototype")
public class Department {
private String name;

public String getName() {
	return name;
}

public Department() {
	super();
}

public void setName(String name) {
	this.name = name;
}

public Department(String name) {
	super();
	this.name = name;
}
}