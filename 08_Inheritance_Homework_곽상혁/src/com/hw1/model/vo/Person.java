package com.hw1.model.vo;

public class Person {
	protected String name;
	private int age;
	private double height;
	private double weight;
	
	public Person() {}
	
	public Person(int age, double height,double weight) {
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String toString() {
		return name + " "+ age + " "+height+" "+weight;
	}

	protected String getName() {
		return name;
	}

	protected void setName(String name) {
		this.name = name;
	}

	protected int getAge() {
		return age;
	}

	protected void setAge(int age) {
		this.age = age;
	}
	
	protected double getHeight() {
		return height;
	}
	
	protected void setHeight(double height) {
		this.height = height;
	}

	protected double getWeight() {
		return weight;
	}

	protected void setWeight(double weight) {
		this.weight = weight;
	}
	
	
}
