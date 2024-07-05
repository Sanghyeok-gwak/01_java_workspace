package com.br.chap03_interface_practice.model.vo;

public class Dolphin  extends Animal implements Swimable{
	
	public Dolphin () {}
	public Dolphin (String name , String kinds) {
		super(name,kinds);
	}
	
	
	@Override
	public void swim() {
		
		
		System.out.println(getName()+"이(가) 자유롭게 헤엄칩니다.");
	}

	@Override
	public void dive() {
		System.out.println(getName()+"이(가) 포물선을 그리면서 다이빙합니다.");
	}

	@Override
	public String bark() {
		return "끼이이이이ㅣ이이ㅣ이ㅣ이ㅣ이ㅣ이ㅣ이ㅣ이ㅣ이ㅣ익";
	}
	
}
