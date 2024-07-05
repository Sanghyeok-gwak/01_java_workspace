package com.br.chap02_abstract_practice.model.vo;

public class Archor extends GameCharacter{
	
	private int distance;
	private int count;
	
	
	public Archor() {}
	public Archor(String name , int hp,int level,int exp ,int distance,int count) {
		super(name,hp,level,exp);
		this.distance = distance;
		this.count = count;
	}
	public int getDistance() {
		return distance;
	}
	public void setDistance(int distance) {
		this.distance = distance;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	@Override
	
	
	public String toString() {
		return super.toString()+", distance=" + distance + ", count=" + count;
	}
	@Override
	public void attack() {
		if (0<count) {
			System.out.println(distance+" 거리까지 화살로 적을 멸한다.");
			count --;
			System.out.println("잔여 활수 : "+count);
			setExp(getExp()+15);
		}else {
			System.out.println("잔여 활이 없어 공격 불가");
		}
	
	}
	@Override
	public void defence() {
		System.out.println("으악");
		setHp(getHp()-30);
	}
	
	
	
	
	
}
