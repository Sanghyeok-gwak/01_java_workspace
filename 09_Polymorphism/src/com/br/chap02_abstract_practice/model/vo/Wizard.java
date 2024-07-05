package com.br.chap02_abstract_practice.model.vo;

public class Wizard extends GameCharacter{
	
	
	private int mp;
	
	public Wizard() {};
	
	public Wizard(String name,int hp,int level , int exp ,int mp) {
		super(name,hp,level,exp);
		this.mp = mp;
	}

	public int getMp() {
		return mp;
	}

	public void setMp(int mp) {
		this.mp = mp;
	}

	@Override
	public String toString() {
		return super.toString()+", mp=" + mp ;
	}

	@Override
	public void attack() {
		System.out.println("지팡이로 후드려 팬다");
		mp-=10; 
		super.setExp(super.getExp()+20);
	}

	@Override
	public void defence() {
		System.out.println("냄뚜로 막는다.");
		mp+=5;
		setHp(getHp()-5);
	}
	
	
}
