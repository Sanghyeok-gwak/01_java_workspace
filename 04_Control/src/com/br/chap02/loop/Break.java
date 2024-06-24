package com.br.chap02.loop;

import java.util.Scanner;

public class Break {

	/*
	 * break; :  반복문 안에 사용되는 분기문
	 * 		     break;을 만나는 순간 현재 속해있는 반복문을 강제로 빠져나감
	 * 
	 * 반복문(){
	 * 	반복문(){
	 * 		break;//반복문2를 빠져나감	
	 * 	}
	 * 이 시점으로빠져나감
	 * }
	 * 
	 * * 유의사항 : switch문안에서의 break;는 단지 switch문만 빠져나가짐
	 * 
	 */
	
	public void method1 () {
		//사용자에게 문자열을 입력받아 해당 그문자열과 길이출력
		Scanner scan = new Scanner(System.in);
		 
		
		while(true) {
			System.out.print("입력 : ");
			String str = scan.nextLine();
			
			if(str.equals("exit")) {
				System.out.println("종료되었습니다.");
				break;
			}
			else {
				System.out.println(str + " : " +str.length());
			}
		}
	
	}
	public void method2 () {
		while(true) {
			int ran=(int)((Math.random()*100)+1);
			
			if(ran%3==0) {
				break;
			}
			else {
				System.out.println(ran);
			}
			
		}
	}
	
	public void method3 () {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("입력 : ");
			int s= scan.nextInt();
			System.out.println(s);
			
			if(s>=2 && s<=9) {
				for(int i =1; i<10; i++ ) {
					System.out.println(s+" x "+i+" = "+s*i);
				}
				break;
			}
			else  {
				System.out.println("오류");
			}
		}
		
		
		
	}
	
	
	
}
