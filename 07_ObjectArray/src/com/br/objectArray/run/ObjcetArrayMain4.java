package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.controller.PhoneController;
import com.br.objectArray.model.vo.Phone;

public class ObjcetArrayMain4 {
	public static void main(String[] args) {
		
		
		// 현재 판매중인 핸드폰 목록 배열객체 세팅
		// 초기 데이터 세팅
		PhoneController c = new PhoneController();
		
		Phone p[] = {
				new Phone("갤럭시","삼성",1600000,"z플립"),
				new Phone("아이폰","애플",1600000,"15pro"),
				new Phone("아이폰","애플",1600000,"14pro"),
				new Phone("갤럭시","삼성",1600000,"노트24"),
				new Phone("아이폰","애플",1600000,"12pro")
		};
		
		Scanner scan = new Scanner(System.in);
		while (true) {

			System.out.println("---메뉴---");
			System.out.println("1.모든 폰 조회");
			System.out.println("2.핸드폰 평균가 조회");
			System.out.println("3.구매하고자 하는 핸드폰 가격 조회");
			System.out.println("4.구매하고자 하는 핸드폰들 가격 조회");
			System.out.println("0.프로그램 종료");
			System.out.print("메뉴 입력 : ");
			int num = scan.nextInt();
				
		if(num == 1) {
			c.selectAllPhone(p);
		}
		else if(num == 2) {
			System.out.println((double)c.selectPhoneAvgPrice(p));
			
		}
		else if(num == 3) {
			scan.nextLine();
			System.out.println("입력 : ");
			String str = scan.nextLine();
			int price = c.searchPhonePrice(p, str);
			if( price == 0 ) {
				System.out.println("해당 상품은 존재 하지 않습니다.");
			}
			else {
				System.out.println(c.searchPhonePrice(p, str));
			
			}
		}
		else if (num == 4) {
			System.out.println("입력 : ");
			String str = scan.nextLine();
			
			int [] price= c.searchKeywordPhonePrice(p, str);
			for(int i =0; i<p.length; i++) {
				if(price[i]!= 0) {
					System.out.println(p[i].getPrice());
				}
			}
		}
		else  if(num == 0) {
			System.out.println("프로그램 종료");
			break;
		}
		else  {
			System.out.println("값을 다시입력해주세요.");
		}
		
		}
	}
}
