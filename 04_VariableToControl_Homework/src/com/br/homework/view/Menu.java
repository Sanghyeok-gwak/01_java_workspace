package com.br.homework.view;

import java.util.Scanner;

import com.br.homework.controller.Function;

public class Menu {
	public void displayMenu() {
		Scanner scan = new Scanner(System.in);
		Function fn= new Function();
		while(true) {
			System.out.println("과제");
			System.out.println("1.간단 계산기");
			System.out.println("2.작은 수에서 큰 수까지 합계");
			System.out.println("3.신상 정보 확인");
			System.out.println("4.학생 정보 확인");
			System.out.println("5.별과 숫자 출력");
			System.out.println("6.난수까지의 합계");
			System.out.println("7.구구단");
			System.out.println("8.주사위 숫자 알아맞추기 게임");
			System.out.println("9.프로그램 종료");
			System.out.print("1~9 입력 : ");
			int num = scan.nextInt();
//			switch(num) {
//			case1:
//			case2:
//			case3:
//			case4:
//			case5:
//			case6:
//			case7:
//			case8:
//			case9:
//			
//			}
		
		
		}
	}
}
