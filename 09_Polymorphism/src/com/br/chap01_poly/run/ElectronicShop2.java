package com.br.chap01_poly.run;

import com.br.chap01_poly.model.vo.Electronic;

//전자제품 판매 가게
public class ElectronicShop2 {//다형성 적용
	
	
	
	//부모타입 배열로 만든 자식 객체 수용 가능
	private Electronic[] elec = new Electronic[3];  
	private int count =0;
	
	
	public void insert(Electronic any) {
		elec[count]=any;
		count++;
	}
	
	//조회용 
	
	public Electronic select(int index) {
		return elec[index];
	}
	
	
}
