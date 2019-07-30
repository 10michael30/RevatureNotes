package com.ex.hellospring;

public class DepBean {

	
	public Helloworld getHello() {
		return hello;
	}

	public void setHello(Helloworld hello) {
		this.hello = hello;
	}

	public DepBean() {
		super();
	}

	public DepBean(Helloworld hello) {
		super();
		this.hello = hello;
	}

	private Helloworld hello;
}
