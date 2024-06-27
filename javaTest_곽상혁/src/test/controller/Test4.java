package test.controller;

import java.util.Scanner;

public class Test4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 1: ");
		int x = scan.nextInt();
		System.out.println("입력 2 : ");
		int y= scan.nextInt();
//		System.out.println(0<=x && x>10);
		
		
		if(x>0 && y>0) {
			if(x>=0 && x<10 && y>=0 && y<10) {
				System.out.println("합 : "+(x+y));
				System.out.println("차 : "+(x-y));
				System.out.println("곱 : "+(x*y));
				System.out.println("나누기 : "+(x/y));
				
			}
		}else {
			System.out.println("잘못 입력하였습니다.");
		}
		
		
	}
}
