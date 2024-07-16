package com.br.collection.model.vo;

public class Snack {

	private String flavor;
	private int calory;
	
	
	public Snack() {}

	@Override
	public String toString() {
		return "Snack [flavor=" + flavor + ", calory=" + calory + "]";
	}
	

	public Snack(String flavor, int calory) {
		super();
		this.flavor = flavor;
		this.calory = calory;
	}


	public String getFlavor() {
		return flavor;
	}


	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}


	public int getCalory() {
		return calory;
	}


	public void setCalory(int calory) {
		this.calory = calory;
	}


	
	
}
