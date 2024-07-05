package com.hw2.model.vo;

public class Rectangle extends Point{
	private int width;
	private int height;
	
	
	public Rectangle(int x, int y,int width, int height) {
		super(x,y);
		this.width = width;
		this.height = height;
	}
	public void draw() {
		int a = getX();
		int b = getY();
		System.out.println("(x,y) : "+a + " " + b);
		System.out.print("면적 : "+width*height);
		System.out.println();
		System.out.print("둘레 : "+(2*(width+height)));
	}
	
	protected int getWidth() {
		return width;
	}
	protected void setWidth(int width) {
		this.width = width;
	}
	protected int getHeight() {
		return height;
	}
	protected void setHeight(int height) {
		this.height = height;
	}
	
	
	
}
