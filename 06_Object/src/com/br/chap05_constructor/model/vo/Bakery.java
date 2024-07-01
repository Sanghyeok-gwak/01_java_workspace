package com.br.chap05_constructor.model.vo;

public class Bakery {
	private String bakeryName;
	private String bakeryAddr;
	private Bread bread;
	
	public  Bakery() {}
	public  Bakery(String bakeryName,String bakeryAddr,Bread bread) {
		this.bakeryName = bakeryName;
		this.bakeryAddr = bakeryAddr;
		this.bread = bread;
	}
	
	public void setBakeryName(String bakeryName) {
		this.bakeryName = bakeryName;
	}
	
	public String getBakeryName() {
		return bakeryName;
	}
	
	public void setBakeryAddr(String bakeryAddr) {
		this.bakeryAddr = bakeryAddr;
	}
	public String getBakeryAddr(String bakeryAddr) {
		return bakeryAddr;
	}
	
	public void setBread(Bread bread) {
		this.bread = bread;
	}
	
	public Bread getBread(Bread bread) {
		return bread;
	}
	
	
	public String information() {
		String str = "빵집 이름 : "+bakeryName + " , 빵집주소 : "+bakeryAddr;
		
		if (bread!= null) {
			str+=", 판매하는 빵 : "+bread.information();
		}
		
		
		
		return str;
	}
	
	
	
	
	
	
	
	
	
	
}
