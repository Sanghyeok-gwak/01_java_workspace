package com.br.operator;

import java.util.Scanner;

public class Triple {
	/*
	 * < 삼항 연산자 >
	 * 
	 * 조건식 ? 참일경우 돌려줄 결과값 : 거짓일 경우 돌려줄 결과값
	 * 
	 * 
	 * 
	 */
	
	public void method1() { 
		//입력 받은 정수값이 양수인지 아닌지 판별 후 출력
		Scanner scan = new Scanner(System.in);
		
		
		System.out.print("정수값 : " );
		int num = scan.nextInt();
		
		
		System.out.println(num>0 ? "양수이다" : "양수가 아니다");
		
		
		
		String x ="양수이다";
		String y ="양수가아니다";
		
		
		//String result =num>0 ? x : y;
		
		String result = num <=0 ? x:y;
		
		System.out.println(num+"은"+result);
		
	}
	
	public void method2() {
		// 입력받은 정수값이 짝수인지 홀수인지 판별 후 출력
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int num = scan.nextInt();
		
		
		String result = num % 2 ==0 ? "짝수" : "홀수";
		
		System.out.println(num+"은"+result);
		
		
		
	}
	public void method3() {
		// 사용자에게 종료의사 입력받아서 판별해서 출력
		// 사용자가 입력한 문자값이 y또는 Y 경우 "프로그램을 종료합니다." 출력
		// 그게아닐경우 "계속진행하겠습니다"
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("프로그램을 종료하시겠습니까 ? (Y/N)");
		
		char x = scan.nextLine().charAt(0);
							
		
		String result = x == 'y' || x=='Y' ? "프로그램을 종료합니다":"계속진행하겠습니다";
		
		System.out.println(result);
		
		
	}
	public void method4() {
		//입력받은 문자값이 영문자인지 아닌지 판별해서 출력
		//사용자가 입력한 문자값이 영문자(소문자 또는 대문자)일 경우 "영문자이다 ." 출력
		//										그게아닐경우 "영문자가이나다"
		
		Scanner scan = new Scanner(System.in);
		
		char x = scan.nextLine().charAt(0);
		//a~z 97 ~ 122
		//A~Z 65 ~ 90
		String result = (97<=(int)x &&(int)x<=122)||((int)x>=65 && (int)x<=90) ? "영문자이다":"영문자가이나다";		
		
		System.out.println(result);
		
				
				
				
				
	}
			
}
