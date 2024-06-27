package test.controller;

import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int x = scan.nextInt(); 
		
		if(1<=x && x<=100) {
			
			if (x %2==0) {
				System.out.println("2의 배수 입니다.");
			}
			else {
				System.out.println("2의 배수가 아닙니다");
			}
		}
		
	}
}
