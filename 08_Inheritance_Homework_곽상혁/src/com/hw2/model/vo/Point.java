package com.hw2.model.vo;

public class Point {
	private int x ;
	private int y;
	
	public Point() {}

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void draw() {
		System.out.println(x + " "+ y);
	}

	protected int getX() {
		return x;
	}

	protected void setX(int x) {
		this.x = x;
	}

	protected int getY() {
		return y;
	}

	protected void setY(int y) {
		this.y = y;
	}
	
}
