package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Phone;

public class ObjectArrayRun3 {

	public static void main(String[] args) {
		Phone p[] = new Phone[3];
		Scanner scan=  new Scanner(System.in);
		
		p[0]=new Phone("갤럭시","삼성",1000000,"z플립");
		p[1]=new Phone("아이폰","애플",1111111,"12pro");
		p[2]=new Phone("아이폰","애플",1500000,"15pro");
		
		
		p[1].setPrice(1300000);
		
		for(int i=0; i<p.length; i++) {
			System.out.println("판매 "+(i+1));
			System.out.println(p[i].information());
		}
		
		int total = 0;
		for(int i =0; i<p.length; i++) {
			total += p[i].getPrice();
		}
		System.out.println("평균 값 : "+(total/p.length));
		String serach = scan.nextLine();
		String restult = " ";
		for(int i =0; i<p.length; i++) {
			if((p[i].getPhoneName()+p[i].getS()).equals(serach) ) {
				System.out.println("당신이 구매하고자하는 핸드폰의 가격은 "+p[i].getPrice()+"입니다");
			}
		}
		
	}

}
