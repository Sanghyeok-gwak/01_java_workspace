package com.sh.model.vo;

public class Bread {
	private String breadName;
	private int price;
	public String getBreadName() {
		return breadName;
	}
	public void setBreadName(String breadName) {
		this.breadName = breadName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Bread(String breadName, int price) {
		super();
		this.breadName = breadName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bread [breadName=" + breadName + ", price=" + price + "]";
	}
}
