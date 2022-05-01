package com.masai;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	Shapes shape;

	
	public void setShape(Shapes shape) {
		this.shape = shape;
	}
	
	
	public static void main(String[] args) {
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		
		
		Shapes shapeObj=ctx.getBean(Circle.class, "circle");
		
		shapeObj.draw();
	}
}
