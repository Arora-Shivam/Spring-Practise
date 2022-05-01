package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		Ecommerce ecommerce=ctx.getBean(Ecommerce.class,"ec");
		ecommerce.fun();
		
		
		Ecommerce2 ecommerce2=ctx.getBean(Ecommerce2.class,"ecom2");
		ecommerce2.fun();
		
		
		((ClassPathXmlApplicationContext)(ctx)).close();
		
		
	}
}
