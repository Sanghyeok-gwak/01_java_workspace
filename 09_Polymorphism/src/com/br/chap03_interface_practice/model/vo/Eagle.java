package com.br.chap03_interface_practice.model.vo;

public class Eagle extends Animal implements Flyable,Moveable{
	public Eagle() {}
	public Eagle(String name ,String kinds) {
		super(name,kinds);
	}
	
	@Override
	public void forward() {
		System.out.println(getName()+"이(가) 뾰족한 발톱으로 걸어갑니다.");
	}
	@Override
	public void back() {
		System.out.println(getName()+"이(가) 뾰족한 발톱으로 백스텝 합니다.");
	}
	@Override
	public void jump() {
		System.out.println(getName()+"이(가) 점프불가.");
	}
	@Override
	public void fly() {
		System.out.println(getName()+"이(가) 먹이를 찾아 큰날개를 펼치면서 날아갑니다.");
		
	}
	@Override
	public String bark() {
		return "구구구구ㅜㄱ구구구구구구구국구구구구구";
	}
	
}
