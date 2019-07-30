package com.ex.autowire;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Employee {
private String name;
private int salary;


//this is all you need to tell it to autowire to look for department
@Autowired
private Department department;
public Employee(String name, int salary, Department department) {
	super();
	this.name = name;
	this.salary = salary;
	this.department = department;
}
public Employee() {
	super();
}
public Employee(String name) {
	super();
	this.name = name;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public int getSalary() {
	return salary;
}
public void setSalary(int salary) {
	this.salary = salary;
}
public Department getDepartment() {
	return department;
}
public void setDepartment(Department department) {
	this.department = department;
}
}