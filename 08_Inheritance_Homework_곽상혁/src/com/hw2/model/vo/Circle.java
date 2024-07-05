package com.hw2.model.vo;

public class Circle extends Point {
	private int radius;

	public Circle(int x,int y,int radius) {
		super(x,y);
		this.radius = radius;
	}
	
	public void draw() {
		int a = getX();
		int b = getY();
		System.out.println("(x,y) : "+a + " " + b);
		System.out.printf("면적 : %.1f",Math.PI*radius*radius);
		System.out.println();
		System.out.printf("둘레 : %.1f",Math.PI*radius*2);
	}
	

	protected int getRadius() {
		return radius;
	}

	protected void setRadius(int radius) {
		this.radius = radius;
	}
	
	
	
	
	
}
