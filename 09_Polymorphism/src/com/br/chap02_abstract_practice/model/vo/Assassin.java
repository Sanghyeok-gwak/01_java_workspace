package com.br.chap02_abstract_practice.model.vo;

public class Assassin extends GameCharacter{
	
	public Assassin () {}
	public Assassin (String name, int hp , int level,int exp) {
		super(name,hp,level,exp);
	}
	@Override
	public void attack() {
		System.out.println("뒤로 돌아 목 따");
		setExp(getExp()+5);
	}
	@Override
	public void defence() {
		System.out.println("은둔술");
	}
	
	//toString 생략 => GameCharacter에 있는 toString 실행됨 
	
}
