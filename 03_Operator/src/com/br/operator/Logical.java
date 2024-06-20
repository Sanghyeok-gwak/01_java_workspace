package com.br.operator;

import java.util.Scanner;

public class Logical {
	/*
	 * < 논리연산자 (이항연산자) >
	 * 논리값을 연산해주는 연산자 => 논리연산의 결과값도 논리값
	 * 
	 * 논리값 && 논리값 : and 왼쪽 오른쪽 둘 다 true일 경우 최종값은 true
	 * 논리값 || 논리값 : or 왼쪽 오른쪽 하나라도 true 일 경우 최종값은 true 
	 * 
	 * => 주로 여러개의 조건을 연결시켜서 하나의 조건으로 만들고자 할 때 사용
	 * 
	 */
	
	
	public void method1() {
		
		//사용자가 입력한 정수값이 1부터 100사이의 값인지 확인
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("정수 : ");
		
		int num = scan.nextInt();
		
		
		//num값이 1이상이고 100이하인지 비교
		boolean result =0<num && num<101;
		System.out.println(result);
		System.out.println(0<num && num<101);
	
	}
	
	public void method2() {
		// 사용자가 입력한 문자값이 영문 대문자인지 확인
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("문자 : ");
		
		char ch = scan.nextLine().charAt(0);
		
		
		// 'A' ~ 'Z' 실제로 컴퓨터에서는 65~90
		
		//boolean result = 64 < ch && ch < 91;
		
		boolean result = 'A'<= ch && ch <= 'Z';
		
		System.out.println(result);
		
		//사용자가 입력한 x 문자는 대문자입니까 : xxxx
		System.out.println("사용자가 입력한 : "+ch +"문자는 대문자입니까 : "+result);
		
	}
	public void method3() {
		//사용자에게 성별을 입력받은 후 남자인지 확인
		
		Scanner scan = new Scanner(System.in);
	
		System.out.println("성별 (M/F) :");
		char gender = scan.nextLine().charAt(0);
		
		boolean result = gender == 'M' || gender =='m';
	
		System.out.println("사용자가 남자입니까 : " + result);
		System.out.println("사용자가 여자입니까 : " + !result);
		
	}
	
	public void method4() {
		//사용자에게 종료의사를 입력받고 확인
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("종료하시려면 y를 입력해라0"
				+ "");
		char ch = scan.nextLine().charAt(0);
		
		
		
	}
	public void method5() {
		//Dead code 
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("종료하시려면 y를 입력해라0"
				+ "");
		char ch = scan.nextLine().charAt(0);
		
		
		
	}
	public void method6() {
		
		
	}
}
