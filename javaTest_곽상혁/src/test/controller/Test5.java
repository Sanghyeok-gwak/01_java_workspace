package test.controller;

import java.util.Scanner;

public class Test5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	
		System.out.println("입력1 : ");
		int x= scan.nextInt();
		System.out.println("입력2 : ");
		int y= scan.nextInt();
		String result = "";
		
		
		
	
		if (x>0 && x<10 && y>0 && y<10) {
			if((x*y)<=10) {
				result = "한자리 수 입니다.";
			}else {
				result = "두자리 수 입니다.";
			}
		}
	System.out.println(result);
	}
}
