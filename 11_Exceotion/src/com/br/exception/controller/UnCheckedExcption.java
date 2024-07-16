package com.br.exception.controller;

import java.util.InputMismatchException;
import java.util.Scanner;

public class UnCheckedExcption {
	
	/*
	 * < RuntimeException 후손클래스들 >
	 * 프로그램 실행시 발생되는 예외클래스들
	 * 
	 *  
	 *  1. IndexOutOfBoundsException	: 부적절한 인덱스로 접근시 발생되는 예외
	 *  2. NullPointerException			: 레퍼런스가 null인 상태에서 접근시 발생되는 예외
	 *  3. ArithmeticException			: 나누기 연산시 0으로 나눠질때 발생되는 예외
	 *  4. ClassCastException			: 허용되지 않는 형변환시 발생되는 예외
	 *  5. NegativeArraySizeException	: 배열 할당 과정에서 배열의 크기를 음수로 지정하는 경우 발생되는 예외
	 *  	...............//무수히 많음
	 *  
	 *     => 충분히 예측가능한 상황이기 때문에
	 *        적절한 조건을 통해서 아싸리 예외가 발생이 안되도록 코드작성
	 *   	  즉, 조건문으로 충분히 핸드링 할 수 있음 (예외처리구문이 필요없음)
	 * 
	 */
	
	
	
	Scanner scan = new Scanner(System.in);
	
	
	
	public void method1 () {
		
		System.out.print("정수1 : ");
		int num1 = scan.nextInt();
		System.out.print("정수2 : ");
		int num2 = scan.nextInt();
//		//애초에 예외 자체가 발생이 안되도록 if문으로 조건검사
//		int result =0;
//		if(num2 != 0) {
//			 result = num1/num2;
//		}
//		System.out.println("결과 값 : "+result);
		//예외처리 : 예외가 "발생했을때" 실행할 내용을 미리 정의해두는 방법
		/*
		 * *try~catch구문
		 * 
		 * try{
		 * 	예외가 발생될수 있는 구문;	
		 * }
		 * catch(발생될예외클래스 매개변수){
		 * 		해당 예외가 발생됐을 경우 실행시킬 구문;
		 * }
		 * 
		 */
		try {
			int result = num1/num2;
			System.out.println("result : "+result);
		}
		catch(ArithmeticException e) {
//			System.out.println(e);
			System.out.println("0으로 나눌 수 없습니다.");
			e.printStackTrace();//강제로 오류난 이력보고자 할 때 실행할수 있는 구문
		}
		System.out.println("프로그램이 종료됩니다.");
	}
	public void method2() {
		//* NegativeArraySizeException // 배열 인덱스 값을 음수로 작성할때 
		//* AraayIndexOutOfBoundsException // 배열 사이즈가 초과 될때 
		//* InputMismatchException // 배열 사이즈를 지정할때 숫자가 아닌 값을 입력할때 
		System.out.println("배열 크기 : ");
		int size = scan.nextInt();
		//예측 가능한 상황이므로 if문 조건검사를 통해 실행되도록
		/*
		if(size >0) {
			int arr []=new int [size];
			System.out.println("성공적으로 배열이 만들어졌다.");
			if(size>100) {
				System.out.println("99번 인덱스 : "+arr[99]);
				
			}
		}
		*/
		try {
			
			System.out.println("성공적으로 배열이 만들어졌다.");
			int arr []=new int [size];
		}
		catch(NegativeArraySizeException n) {
			
		}
//		catch(AraayIndexOutOfBoundsException e) {
//			
//		}
		
		System.out.println("프로그램을 종료합니다.");
		
		
		
	}
	public void method3() {
		//* NegativeArraySizeException // 배열 인덱스 값을 음수로 작성할때 
		//* AraayIndexOutOfBoundsException // 배열 사이즈가 초과 될때 
		//* InputMismatchException // 배열 사이즈를 지정할때 숫자가 아닌 값을 입력할때 
		System.out.println("배열 크기 : ");
		int size = scan.nextInt();
		//예측 가능한 상황이므로 if문 조건검사를 통해 실행되도록
		
	
		try {
			System.out.println("성공적으로 배열이 만들어졌다.");
			int arr []=new int [size];
			System.out.println("99번 인덱스 : "+arr[99]);
		}
		catch(RuntimeException e) {//부모예외클래스 작성시 모든 자식예외발생하는 순간
			System.out.println("배열의 크기가 잘못됐거나 부적절한 인덱스가 제시됨");
			System.out.println(e);
		}
		
		System.out.println("프로그램을 종료합니다.");
	}
	public void method4() {
		//* NegativeArraySizeException // 배열 인덱스 값을 음수로 작성할때 
		//* AraayIndexOutOfBoundsException // 배열 사이즈가 초과 될때 
		//* InputMismatchException // 배열 사이즈를 지정할때 숫자가 아닌 값을 입력할때 
		System.out.println("배열 크기 : ");
		int size = scan.nextInt();
		//예측 가능한 상황이므로 if문 조건검사를 통해 실행되도록
		
		
		try {
			System.out.println("성공적으로 배열이 만들어졌다.");
			int arr []=new int [size];
			System.out.println("99번 인덱스 : "+arr[99]);
		}
		catch(InputMismatchException e) {
			System.out.println("이상한 값이 감지되었습니다");
//			System.out.println(e);
		}
		catch(RuntimeException e) {//부모예외클래스 작성시 모든 자식예외발생하는 순간
			System.out.println("배열의 크기가 잘못됐거나 부적절한 인덱스가 제시됨");
			System.out.println(e);
		}
		//부모예외클래스랑 자식예외클래스를 같이 기술 할경우
		//자식예외클래스의 catch블럭이 위에 있어야됨(아니면 unreachable catch block(절대 실행될수없어))
		System.out.println("프로그램을 종료합니다.");
	}
	/*
	 * *RuntimeException == UnCheckedException (예외처리구문이 필수는 아님)
	 *  if문 : 애초에 예외자체가 발생되기 전에 소스코드 핸드링
	 *  try~catch문 : 예외가 "발생됐을겨우" 처리할 구문을 작성해두는거
	 */
}
