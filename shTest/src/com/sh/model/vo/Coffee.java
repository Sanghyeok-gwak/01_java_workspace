package com.sh.model.vo;

public class Coffee {
	private String coffeeName;
	private int price;
	private int count;
	public String getCoffeeName() {
		return coffeeName;
	}
	public void setCoffeeName(String cafeName) {
		this.coffeeName = cafeName;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public Coffee(String cafeName, int price, int count) {
		super();
		this.coffeeName = cafeName;
		this.price = price;
		this.count = count;
	}
	public Coffee(String cafeName, int price) {
		super();
		this.coffeeName = cafeName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Coffee [cafeName=" + coffeeName + ", price=" + price + ", count=" + count + "]";
	}
	
}
