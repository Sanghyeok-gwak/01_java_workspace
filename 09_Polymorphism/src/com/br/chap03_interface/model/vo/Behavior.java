package com.br.chap03_interface.model.vo;

public interface Behavior {// 인터페이스도 클래스의 일종
	
	//오로지 상수필드랑 추상메소드만 작성가능
	int NUM = 10;
	//생략가능
	
	/*public abstract*/ void eat();
	public abstract void sleep();
	

}
