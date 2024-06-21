package com.br.chap01.condition;

import java.util.Scanner;

public class If {
	
	/*
	 *  프로그램 진행은 위에서 부터 아래로 순차적으로 진행
	 *  
	 *  
	 *  소스코드1; 
	 *  소스코드2; //선택적으로 실행 => 조건문
	 *  소스코드3; //반복적으로 실행 => 반복문
	 *  소스코드4;//
	 *  
	 *  < 조건문 > 
	 *  
	 *  조건식을 제시해서 참이냐 거짓이냐를 판단해서
	 *  해당 조건이 참일 경우 그에 해당하는 구문을 실행
	 *  
	 *  조건식은 반드시 true/false로 나오도록 작성
	 *  
	 *  1. if 문 (단독if 문/ if else 문 / if-else if문)
	 *  2. switch 문
	 *  
	 *  단독 if문
	 *  
	 *  if (){
	 *  	선택적으로 실행하고자하는 코드 ;
	 *  }
	 *  
	 *  
	 *  
	 */
	
	public void method1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num1 = scan.nextInt();
		if (num1>0) {
			
			System.out.println("양수다");
		}
		if (num1 <=0){
			
			System.out.println("양수가 아니다");
		}
		
		
		/*
		 * if else 문
		 * if(true){
		 * 	해당 조건이 참일경우 실행크드;
		 * }
		 * else {
		 * 	해당 조건이 거짓일경우 실행코드;
		 * }
		 */
		

		
	}
	
	public void method2() {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = scan.nextInt();
		
		
		if(num > 0 ) {
			System.out.println("양수다");
		}
		else {
			System.out.println("양수가아닙니다");
		}
		
	}
	
	/*
	 * if - else if 문
	 * 
	 * 같은 비교대상으로 여러개의 조건을 제시해야될 경우
	 * 
	 * if (조건식1){
	 * 	조건식1이 참일경우 실행코드;
	 * }
	 * else if {
	 * 	조건식2가 참일경우 실행코드;
	 * }
	 * else if {
	 * 	조건식3이 참일경우 실행코드;
	 * }
	 * else {
	 * 	위의 조건이 다 false 일 경우 실행코드;
	 * }
	 */
	public void method3() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println( "정수 : ");
		int num = scan.nextInt();
		
		
		if (num < 0) {
			System.out.println("음수다");
		}else if (num == 0) {
			System.out.println("0이다");
		}
		
		
	}
	
	public void method4() {
		Scanner scan = new Scanner(System.in);
		
		
		int num = scan.nextInt();
		
//		if (num <=13) {
//			System.out.println("어린이");
//		}
//		else if (num <=19){
//			System.out.println("청소년");
//		}
//		else {
//			System.out.println("성인");
//		}
		
		String result ="";
		
		if (num>=0 && num <=120) { //유효한 범위로 나이값을 잘 입력 했을 경우
			if (num <=13) {
				result="어린이";
			}else if (num <=19) {
				result="청소년";
			}else {
				result="성인";
			}
			System.out.println(result);
		}
		else {
			System.out.println("사망하셨습니다.");
		}
		
		
		
		
	}
	public void method5() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scan.nextLine();
		
		System.out.println("성별(M/F) : ");
		char gender = scan.nextLine().charAt(0);
		
		
//		if (gender == 'F'|| gender =='f') {
//			System.out.println(name+"님은 여학생이다");
//			
//		}
//		else if (gender =='M' || gender =='m') {
//			System.out.println(name+"님은 남학생이다.");
//		}
//		else {
//			System.out.println("값을 잘못입력하였습니다.");
//		}
		String result= "";
		
		if (gender == 'F'|| gender =='f') {
			result = "여학생";
		}
		else if (gender =='M' || gender =='m') {
			result="남학생";
			
		}else {
			System.out.println("성별을 잘못입력하였습니다.");
			return; // 현재 속해있는 메소드를 빠져나가는 구문(뒤쪽 코드는 더이상 수행되지 않음)
		}
		
		System.out.println(name +"님은 "+result+" 입니다.");
		
		
	}
	public void method6() {
		
		Scanner scan = new Scanner(System.in);
		
		
		//사용자에게 이름 입력받아서
		//"홍길동"과 일치할 경우 =>"반갑습니다."출력
		//	일차하지 않을 경우 =>"안녕히가세요."출력

		System.out.println("이름 : ");
		String name =scan.nextLine();
		
		
		
		if(name.equals("홍길동")) { 
			System.out.println("반갑습니다");
			}
		else {
			System.out.println("잘가세요");
		}
		/*
		 * 
		 * 기본자료형 : boolean byte short int long float double char 
		 * 참조자료형 : String --------- 기본자유형을 제외한 나머지 자료형들
		 * 
		 * 기본자료형들끼리는 동등비교식 == != 사용가능(정상적으로 비교됨)
		 * 참조자료형끼리는 동등비교시 == != 사용시 비교적으로 비교가 안됨
		 * 			=>메소드를 이용해서 비교하면됨
		 * 				ex)문자열.eqluls 일치
		 * 				   !문자열.equls 반대
		 * 
		 * 
		 * 
		 * 
		 */
	}
	public void method7() {
		
		/*
		 * 사용자가 입력한 정수값이 양수가 아닐 경우 => "양수가 아닙니다."
		 * 				  양수일 경우 => 이때 3의배수일 경우 =>"3의 배수입니다."
		 * 							아닐경우 => "3의 배수가 아닙니다"출력
		 *
		 * 
		 */
		Scanner scan = new Scanner(System.in);
		
		
		
		System.out.println("정수(양수) : ");
		
		int num = scan.nextInt();
		
		if (num > 0) {
			if (num%3==0) {
				System.out.println("3의 배수입니다.");
			}
			else {
				System.out.println("3의 배수가 아닙니다");
			}
		}
		else {
			System.err.println("잘못입력했습니다.");
		}
	}
	
	public void method8() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("점수 : ");
		int score= scan.nextInt();
		System.out.println("반 : ");
		int ban= scan.nextInt();
		
		String result;
		if (ban>0 && ban<4) {
			if (score>=60) {
				result="합격";
			}else {

				result="불합격";
			}
			System.out.println(ban+"반"+score+"점으로"+result);
			
		}
		else if (ban>=4 &&ban<7) {
			if (score>=70) {
				result="합격";
			}else {
				result="불합격";
			}
			System.out.println(ban+"반"+score+"점으로"+result);
		}
		
		
		
		
		
		
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
