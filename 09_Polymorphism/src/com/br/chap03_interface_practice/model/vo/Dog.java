package com.br.chap03_interface_practice.model.vo;

public class Dog extends Animal implements Moveable, Swimable{

	public Dog() {}
	public Dog(String name ,String kinds) {
		super(name,kinds);
	}
	
	
	@Override
	public void swim() {
		System.out.println(getName()+"이(가) 개헤엄을 첨벙첨벙첨범");
	}

	@Override
	public void dive() {
		System.out.println(getName()+"이(가) 물속으로 다이빙합니다.");
	}

	@Override
	public void forward() {
		System.out.println(getName()+"이(가) 네발로 앞으로 걸어 갑니다");
	}

	@Override
	public void back() {
		System.out.println(getName()+"이(가) 백스템 합니다.");
	}
	

	@Override
	public void jump() {
		System.out.println(getName()+"이(가) 두발을 들며 껑충 뜁니다.");
	}

	@Override
	public String bark() {
		return "멍 멍 멍 멍 멍 멍 멍 멍 멍 멍 멍 멍 멍 멍 멍";
	}
	
		
	
}
