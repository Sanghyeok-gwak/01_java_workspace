package com.br.objectArray.model.vo;

public class Phone {
	
	private String phoneName;
	private String phoneBrand;
	private int price;
	private String s;
	
	public Phone() {}
	public Phone(String phoneName,String phoneBrand,int price,String s) {
		this.phoneName = phoneName;
		this.phoneBrand = phoneBrand;
		this.price = price;
		this.s = s;
	}
	
	public String getPhoneName() {
		return phoneName;
	}
	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}
	public String getPhoneBrand() {
		return phoneBrand;
	}
	public void setPhoneBrand(String phoneBrand) {
		this.phoneBrand = phoneBrand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getS() {
		return s;
	}
	public void setS(String s) {
		this.s = s;
	}

	
	public String information () {
		return phoneName + ", "+ phoneBrand + ", "+price+", "+s;
	}
	
	
	
	
	
}
