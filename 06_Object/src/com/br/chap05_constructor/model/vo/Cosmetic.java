package com.br.chap05_constructor.model.vo;

public class Cosmetic {
	private String cName;
	private int pirce;
	private String brand;
	private String category;
	
	public void setcName(String cName) {
		this.cName = cName;
	}
	public void setPirce(int pirce) {
		this.pirce = pirce;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	//-------------------------------------------
	public String getcName() {
		return  cName;
	}
	public int getPirce() {
		return  pirce;
	}
	public String getBrand() {
		return  brand;
	}
	public String getCategory() {
		return  category;
	}
	//-------------------------------------------
	public Cosmetic() {}
	public Cosmetic( String cName, int pirce,String brand,String category) {
		this.cName = cName;
		this.pirce = pirce;
		this.brand = brand;
		this.category = category;
	}
	//-------------------------------------------
	public String inpormation() {
		return "cName : "+cName+"\npirce : "+pirce+"\nbrand : "+brand+"\ncategory : "+category; 
	}
}

