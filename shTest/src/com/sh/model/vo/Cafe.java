package com.sh.model.vo;

public class Cafe {
	private String cafeName;
	private int price;
	public String getCafeName() {
		return cafeName;
	}
	public void setCafeName(String cafeName) {
		this.cafeName = cafeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Cafe(String cafeName, int price) {
		super();
		this.cafeName = cafeName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Cafe [cafeName=" + cafeName + ", price=" + price + "]";
	}
	
}
