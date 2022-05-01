package com.masai;

public class Ecommerce {
	private String message;
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void setUp() {
	
		System.out.println("Hello "+message+" You are inside setUp  method of Ecommerce");
	}
	
	public void destroy() {
		System.out.println("Bean is Destoyed of Ecommerce");
	}
	
	public void fun() {
		System.out.println("Inside fun() of Ecommerce");
	}
}

 class Ecommerce2 {
	

	private String message;
	
	public Ecommerce2(String message2) {
		super();
		this.message=message2;
		}
	
	public String getMessage() {
		return message;
	}

	public void setMessage(String message2) {
		this.message = message2;
	}

	public void setUp() {
	
		System.out.println("Hello "+message+" You are inside setUp method of Ecommerce2");
	}
	
	public void destroy() {
		System.out.println("Bean is Destoyed  of Ecommerce2");
	}
	
	public void fun() {
		System.out.println("Inside fun() of Ecommerce2");
	}
}