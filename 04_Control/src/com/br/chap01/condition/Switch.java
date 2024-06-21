package com.br.chap01.condition;

import java.util.Scanner;

public class Switch {
	
	/*
	 * switch문
	 * 
	 * if 문과 동일하게 조건문
	 * 차이점 : if문은 자유롭게 조건식을 작성(범위에 대한 조건,..)
	 * 		 switch문은 동등비교만을 수행함 
	 * 
	 *  
	 *  swtich(동등비교할대상자){
	 *  case 값1 : 실행코드1; break; 
	 *  case 값2 : 실행코드2; break; 
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  
	 *  default : 위의 모든값들과 일치하지 않을경우 실행코드;
	 *  }
	 */
	
	public void method1() {
		/*
		 * 정수를 입력받아
		 * 1일 경우 "파란색"
		 * 2일 경우 "파란색
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("1~3 입력 : ");
		int num = scan.nextInt();
		
		
		switch(num) {
		case 1: System.out.println("빨간색입니다.");break;
		case 2: System.out.println("파란색입니다.");break;
		case 3: System.out.println("초록색입니다.");break;
		
		default : System.out.println("잘못입력했습니다.");
		}
		
	}
	public void method2() {
		Scanner scan = new Scanner(System.in);
		
		//메뉴에 따른 가격 출력
		
		System.out.println("사과 , 바나나 , 복숭아");
		System.out.print("구매하고자하는 과일 입력 : ");
		
		String fruit = scan.nextLine();
		int price=0;
		
		switch(fruit) {
		case "사과" : price=1000;break;
		case "바나나" :price=2000;break;
		case "복숭아" :price=3000;break;
		
		default : System.out.println("잘못입력하셨습니다.");return;
		
		}
		System.out.println(fruit+" 가격은 : "+price+" 원 입니다.");
		 
		
	}
	public void method3() {
	// 성별 입력받아 => 남학생 / 여학생
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("성별 (m/f) : ");
		
		char gender = scan.nextLine().charAt(0);
		String result = " ";
		switch (gender) {
		case 'm' : 
		case 'M' : result="남학생";break;
		case 'F' : 
		case 'f' : result="여학생";break;
		}
		System.out.println(result);
		
	}
	public void method4() {
		// 달을 입력받아 해당 달의 마지막날짜 출력 
		/*
		 * 
		 * 1 3 5 7 8 19 12 
		 * 4 6 9 11 
		 * 2
		 * 
		 */
		
		Scanner scan = new Scanner(System.in);

		System.out.print("1월 ~ 12월까지 중 하나를 입력 : ");
		int month = scan.nextInt();
		
		switch(month) {
		case 1: case 3: case 5: case 7: case 8:case 10: case 12:
			System.out.println("입력하신 월은 31일까지입니다.");break;
		case 4: case 6: case 9: case 11:
			System.out.println("입력하신 월은 30일까지입니다");break;
		case 2:
			System.out.println("입력하신 월은 28또는 29일까지입니다.");break;
			
			default : System.out.println("잘못 입력하셨습니다.");
		}
		
		/*
		 * 유의사항
		 * 비교대상자는 char , int , String 형만 가능
		 * 단 byte, short, char 는 int 로 인식되기 때문에 가능
		 * 
		 */
		
		
		
		
		
	}
}
