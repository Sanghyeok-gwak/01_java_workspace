package com.br.chap03_class.run;

import java.util.Scanner;

import com.br.chap03_class.model.vo.Snack;

public class RemindeMain {
	public static void main(String[] args) {
		
		//사용자에게 과자 정보를 입력받아 대입
		
		Scanner scan = new Scanner(System.in);
		
		
		
		
		System.out.print("과자 이름 : ");
		String name=scan.nextLine();
//		System.out.print("브랜드 명 : ");
//		String brand=scan.nextLine();
		System.out.print("가격 : ");
		int price = scan.nextInt();
		System.out.print("칼로리 : ");
		int Kcal = scan.nextInt();
//		
//		Snack meok = new Snack();
//		meok.setsName(name);
////		meok.setBrand(brand);
//		meok.setPrice(price);
//		meok.setKcal(Kcal);

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		System.out.println(meok.information());
		
		Snack sk = new Snack(name,price,Kcal);
		System.out.println(sk.information());
	
	}
		
	}

