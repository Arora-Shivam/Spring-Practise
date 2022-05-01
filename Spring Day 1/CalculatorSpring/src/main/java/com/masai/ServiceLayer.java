package com.masai;

public class ServiceLayer {
	
	
	private ArithmeticOperations operation;

	public void setOperation(ArithmeticOperations operation) {
		this.operation = operation;
	}
	
	public ArithmeticOperations getOperation() {
		return operation;
	}
	
	
}

interface ArithmeticOperations{
	public void compute();
}

class Addition implements ArithmeticOperations{

	public void compute() {
		// TODO Auto-generated method stub
		add();
		
	}
	
	public void add() {
		System.out.println("Addition is performed");
	}
}

class Subtarction implements ArithmeticOperations{

	public void compute() {
		// TODO Auto-generated method stub
		subtract();
		
	}
	
	public void subtract() {
		System.out.println("Subtract is performed");
	}
}

class Multiplication implements ArithmeticOperations{

	public void compute() {
		// TODO Auto-generated method stub
		multiply();
		
	}
	
	public void multiply() {
		System.out.println("Multiplication is performed");
	}
}