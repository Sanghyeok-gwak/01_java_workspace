package com.br.chap03_class.model.vo;

public class Snack {
	
	
	private String sName;
//	private String brand;
	private int price;
	private int kcal;
	public static final String BRAND = "농심";
	
	public Snack() {}
	
	public Snack(String sName ,int price ,int kcal) {
		this.sName = sName;
		this.price = price;
		this.kcal = kcal;
	}
	//-----------------------------------------
	
	public void setsName(String sName) {
		this.sName= sName;
	}
	
//	public void setBrand(String brand) {
//		this.brand= brand;
//	}
	public void setPrice(int price) {
		this.price= price;
	}
	public void setKcal(int kcal) {
		this.kcal= kcal;
	}
	

	
	public String getsName() {
		return sName;
	}
//	public String getsBrand() {
//		return brand;
//	}
	public int getPrice() {
		return price;
	}
	public int getKcal() {
		return kcal;
	}
		
		
	
	public String information() {
		return "과자명 : "+sName+"\n브랜드명 : "+Snack.BRAND+"\n가격 : "+price+"\n칼로리 : "+kcal;
	}
	
	

}
