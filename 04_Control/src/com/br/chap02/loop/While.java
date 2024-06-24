package com.br.chap02.loop;

import java.util.Scanner;
import com.br.chap01.practice.example.*;
import com.br.chap01.condition.Switch;

public class While {
	/*
	 * while(조건식){
	 * 반복적으로 실행시키고자하는 코드;
	 * 
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 */
	
	
	public void method1() {

		int i =0;
		
		while (i<5) {
			System.out.println("안녕하세요");
			i++;
		}
	}
	
	public void method2() {
		int i =1;
		while (i<6) {
			System.out.print(i+" ");
			i++;
		}
	}
	public void method3() {
		int i=1;
		int t=0;
		int r=(int)(Math.random()*100+1);
		System.out.println(r);
		while (i<=r) {
			t+=i;
			i++;
		}
		System.out.println(i+" "+i +" = "+t);
	}
	public void method4() {
		Scanner scan = new Scanner(System.in);
		
		
	
		while(true) {
			System.out.println("===메뉴==="); 
			System.out.println("0.프로그램 종료");
			System.out.println("1.안녕하세요 5번 출력");
			System.out.println("2.1부터 5까지 출력");
			System.out.println("3.1부터 랜덤값까지의 합계 출력");
			System.out.print("입력 : ");
			int num = scan.nextInt();
			
			
			switch(num){
				case 0 : System.out.println("프로그램을 종료합니다");return; 
				case 1 :method1();break;
				case 2 :method2();break;
				case 3 :method3();break;
				default : System.out.println("값을 잘못입력했습니다.");
			}
			
			
			
//			if(num==1) {
//				for(int i =0; i<5; i++) {
//					System.out.println("안녕하세요");
//				}
//			}
//			else if(num==2) {
//				for(int i =1; i<6; i++) {
//					System.out.print(i+ " ");
//				}
//			}
//			else if(num==3) {
//				int r = (int)(Math.random()*100+1);
//				int i =0;
//				int t = 0;
//				while (i<r) {
//					t+=i++;
//				}
//				System.out.println(r+" : "+t);
//			}
//			else if (num==0) {
//				System.out.println("프로그램 종료");
//				break;
//			}
//			else {
//				System.out.println("값을 잘못입력했습니다.");
//			}
			
		}
	}
	public void method5() {
		ConditionPractice cp = new ConditionPractice();
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("1. 메뉴 출력");
			System.out.println("2. 짝수/홀수");
			System.out.println("3. 합격/불합격");
			System.out.println("4. 계절");
			System.out.println("5. 로그인");
			System.out.println("6. 권한 확인");
			System.out.println("7. BMI");
			System.out.println("8. 계산기");
			System.out.println("0. 종료");
			System.out.print("선택 : ");
			int num = scan.nextInt();
			switch(num) {
			case 1 : cp.practice1();break;
			case 2 : cp.practice2();break;
			case 3 : cp.practice3();break;
			case 4 : cp.practice4();break;
			case 5 : cp.practice5();break;
			case 6 : cp.practice6();break;
			case 7 : cp.practice7();break;
			case 8 : cp.practice8();break;
			case 0 : System.out.println("종료");return;
			default : System.out.println("잘못입력했습니다.");
		}
		
		
		
		}
	}
	
	
}
