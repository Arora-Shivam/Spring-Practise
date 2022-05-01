package com.masai;

interface Shapes {
	public void draw();
}


class Triangle implements Shapes{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Triangle");
	}
	
}

class Square implements Shapes{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Draw Square");
	}
	
}