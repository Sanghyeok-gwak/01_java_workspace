package com.br.chap01_poly.model.vo;

public class Tablet extends Electronic {
	private boolean penFlag;
	
	public Tablet (){}

	public Tablet(String brand, String name, int price ,boolean penFlag) {
		super(brand,name, price);
		this.penFlag = penFlag;
	}
	@Override
	public String toString() {
//		return super.toString()+" "+penFlag;
		return super.toString()+" "+(penFlag ? "있음" : "없음" );
		
	}

	public boolean isPenFlag() {
		return penFlag;
	}

	public void setPenFlag(boolean penFlag) {
		this.penFlag = penFlag;
	}
	
}
