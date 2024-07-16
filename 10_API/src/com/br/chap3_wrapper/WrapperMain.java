package com.br.chap3_wrapper;

import java.util.Scanner;

public class WrapperMain {
	public static void main(String[] args) {
		/*
		 * < Wrapper Class >
		 * 기본자료형을 객체로 포장시킬 수 있는 클래스
		 * 즉, 기본자료형을 Wrapper클래스를 통해 객체화 시킬 수 있음
		 * 
		 * *기본자료형을 객체로 취급해야될 경우
		 * 1)기본자료형 데이터를 통해서 메소드를 호출하고자 할 경우
		 * 2)메소드의 매개변수로 기본자료형이 아닌 객체 타입만이 요구될 경우
		 * 3)다형성을 적용시키고 싶을 때
		 * 
		 * 	기본자료형 		<--> 	wrapper
		 *  boolean				Boolean
		 *   char				Character
		 *   byte				  Byte
		 *   short				  Short
		 *    int				Integer
		 *   long				  Long
		 *   float				  Float
		 *   double				  Double
		 * 
		 * 
		 */
		
		int num1 = 10;
		int num2 = 15;
		
		
		Integer i1 = new Integer(num1);
		Integer i2 = new Integer(num2);
		System.out.println(i1);
		System.out.println(i2);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.compareTo(i2));
		
		
		Integer i3 = num1;
		Integer i4 = 15;
		
//		Integer i5 = new Integer("1234");// 가능하나 권장 x 
		Integer i5 = Integer.valueOf("123");
		
		System.out.println("======================");
		// UnBoxing : wrapper 클래스 자료형 => 기본자료형-----------------------------
		// 방법1. Wrapper 클래스의 xxxValue 메소드 이용 방법
		
		int num3 = i3.intValue();
		int num4 = i4.intValue();

		System.out.println(num3);
		System.out.println(num4);
		
		int num5 = i5;
		System.out.println(num5);
		
		// **********기본자료형 <--> String**********
		String str1 = "10";
		String str2 = "15.3";
		
		
		System.out.println((str1 + str2));//문자열로 작업
		
		
		//String --> 기본자료형 (파싱한다)
		
		
		int x = Integer.parseInt(str1);
		double y = Double.parseDouble(str2);
		
		System.out.println(x+y);
		
		
		
		String strI = String.valueOf(x);
		String strD = String.valueOf(y);
		
		
		
		
		System.out.println(strI);
		System.out.println(strD);
		
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = Integer.parseInt(scan.nextLine());
		
		System.out.println("키 : ");
		double d = Double.parseDouble(scan.nextLine());
		
		
	}
}
