package com.br.chap03_interface.model.vo;

public class Mother extends Person implements Behavior {
	
	private String babyBirth;
	
	
	public Mother() {}
	
	public Mother (String name , double height, int health, String babyBirth) {
		super(name , height,health);
		this.babyBirth = babyBirth;
	}

	public String getBabyBirth() {
		return babyBirth;
	}

	public void setBabyBirth(String babyBirth) {
		this.babyBirth = babyBirth;
	}

	@Override
	public String toString() {
		return "Mother [ "+super.toString()+", babyBirth=" + babyBirth + "]";
	}

	@Override
	public void eat() {
		//밥먹으면 몸무게 10 증가
		super.setWeight(getWeight()+10);
		//건강도 10 감소
		super.setHealth(getHealth()-10);
		
	}

	@Override
	public void sleep() {
		//잠자면 건강도 20증가
		setHealth(getHealth()+20);
	}

	
	
	
	
}
