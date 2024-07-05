package com.hw1.model.vo;

public class Employee extends Person{
	
	private int salary;
	private String dept;
	
	
	
	
	public Employee(String name,int age, double height,double weight,int salary, String dept) {
		super(age,height,weight);
		super.name = name;
		this.salary = salary;
		this.dept = dept;
	}
	
	public String toString() {
		return super.toString()+" "+salary+" "+dept;
	}
	
	
	
	
	public Employee() {} 
	
	
	protected int getSalary() {
		return salary;
	}





	protected void setSalary(int salary) {
		this.salary = salary;
	}





	protected String getDept() {
		return dept;
	}





	protected void setDept(String dept) {
		this.dept = dept;
	}




}
