package com.br.chap02.loop;

import java.util.Random;
import java.util.Scanner;

public class For {
	
	/*
	 * < 반복문 > 
	 * 
	 * 프로그램의 흐름을 제어하는 제어문 중 하나
	 * 특정 코드를 반복적으로 수행시켜줌
	 * 
	 * 두 종류(for문 / while문(do-while문))
	 * 
	 * for문
	 * 
	 * for(초기식; 조건식; 증감식){//반복 횟수를 지정하기 위해 제시하는 것들
	 * 반복적으로 실행시키고자 하는 코드;
	 * }
	 * 
	 * - 초기식 : 반복문이 수행될때 " 처음에 단 한번만 실행되는 구문" 
	 * 			보통 반복문 안에서 사용될 변수를 선언 및 초기화하는 구문
	 * 
	 * 
	 * - 조건식 : "반복문이 수행될 조건 " 작성하는 구문
	 * 			조건식이 true일 경우 해당 블럭안의 구문 실행
	 * 			조건식이 false가 되는 순간 반복을 멈추고 빠져나옴
	 * 			보통 초기식에 제시된 변수를 가지고 조건식을 작성함
	 * 
	 * - 증감식 : 반복문을 제어하는 변수 값을 증감 시키는 구문
	 * 			(보통 초기식에 제시된 변수를 가지고 증감연산자(++,--)와 함께 작성)
	 * 
	 * 실행되는 순서
	 * 
	 * 초기식 => 조건식 검사 => true일 경우 블럭안의 코드 실행 => 증감식
	 *		=> 조건식 검사 =>						=> 증감식
	 *		=> 조건식 검사 =>						=> 증감식
	 *			-----------반복 수행됨 ----------------
	 *		=> 조건식 => false일 경우 그 즉시 반복문을 빠져나옴
	 *
	 */
	
	
	public void method1 () {
		//안녕하세요 5번 반복
		//내가 원하는 횟수만큼 반복문 도리고자 할 때
		//0부터 원하는 횟수만큼 하면된다 .
		
		
		
		for(int i =0 ; i<5; i++) {
			System.out.println("반갑습니다");
		}
		 
		
		
		for(int i=11; i<16; i++) {
			System.out.println("저리가세요");
		}
		  
		
		for(int i =1; i<10; i+=2) {
			System.out.println("hello");
		}
	}
	
	public void method2 () {
		for(int i =1; i<6; i++) {
			System.out.print(i);
		}
	}
	public void method3 () {
		for(int i=5; i>0; i--) {
			System.out.println(i);
		}
	}
	
	public void method4 () {
		for(int i =0; i<10; i++) {
			System.out.println(i+1);
		}
		
	}
	
	public void method5 () {
		for(int i =1; i<10; i+=2) {
			System.out.print(i+" ");
//			if(i%2==1) {
//				System.out.print(i+ " ");
//			}
		}
	}
	public void method6 () {
		int total =0;
		for(int i =1; i<11; i++) {
			total +=i;
			System.out.println(i + " : "+ total);
		}
		System.out.println("최종 : "+total);
		
	}
	
	public void method7 () {
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {
	
		System.out.print("정수 : ");
		int x= scan.nextInt();
		
		int total =0;
		if (x >0) {
			for(int i =0; i<=x; i++) {
				total +=i;
				System.out.println("    "+"Number   Total");
				System.out.println(i+" : "+i+" + "+total);
			}
			System.out.println(total);
			break;
			
		}else {
			System.out.println("정수가 아닙니다");
		}
		}
		
	}
	public void method8 () {
		Random ran = new Random();
		
		//랜덤 값 ? 랜덤 ? 호출이다르다 ? Math.random();
		//다른 개념 ? 
		
//		Tip 랜덤값 발생 범위 지정
//		(int)(Math.random()*발생시킬랜덤값갯수 +시작수
//		ex ) 1+10 => (int )(math.random()*10+1;
//		    11+20 => (int )(math.random()*10+11;
		
		
		double r = Math.random()*10+1;
		
		int x= ran.nextInt(100)-1;
		
		
		int total =0;
		for(int i =0; i<=x; i++) {
			total +=i;
			System.out.println(i+" : "+i+" + "+total);
		}
		System.out.println("Random : "+x+" Total : "+total);
		
	}
	
	public void method9 () {
		//문자열로부터 각 인덱스의 문자들을 뽑아서 출력
		
		/*
		 * "hello"
		 * 
		 * h
		 * e
		 * l
		 * l
		 * o
		 * 
		 */
		
		
		String x= "banana";
		
		for(int i =0; i<x.length(); i++) {
			System.out.println(x.charAt(i));
		}
		
	}
	
	public void method10 () {
		Scanner scan= new Scanner(System.in);
		
		
		System.out.print("문자열 입력 : " );
		String str = scan.nextLine();
		
		System.out.println(str+" : "+str.length());
		for(int i =0; i<str.length(); i++) {
			System.out.print(str.charAt(i)+" ");
		}
	}
	public void method11 () {
		int j =2; 
		for(int i =1; i<10; i++) {
			System.out.println(j+" x "+i+" = "+j*i);
		}
	}
	public void method12 () {
		Random ran = new Random();
		
		int r = ran.nextInt(9);
		int dan = (int)(Math.random()*8+2);
		for(int i =1; i<10; i++) {
			System.out.printf("%d x %d = %d\n",r,i,r*i);
		}
	}
	public void method13 () {
		
		for(int j =2; j<10; j++) {
			System.out.println("========"+j+"========");
			for(int i =1; i<10; i++) {
			System.out.print(j+" x "+i+" = "+j*i+"\n");
			}
		}
		
	}
	public void method14 () {
		for(int i = 1; i<4; i++) {
			for(int j =1; j<6; j++) {
				System.out.print(j);
			}
			System.out.println();
		}
	}
	public void method15 () {
		for(int i=0; i<4; i++) {
			for(int j =0; j<4; j++) {
				System.out.print("*"); 
			}
			System.out.println();
		}
	}
	public void method16 () {
		for(int i =1; i<=4; i++) {
			for(int j =1; j<=4; j++) {
				if(i==j) {
					System.out.print(i);
				}else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
	public void remind () {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("입력 : ");
		int x = scan.nextInt();
		System.out.println("정수 : "+x);
		if(x>0) {
			for(int i =1; i<=x; i++) {
				if(i%2!=0) {
					System.out.print("박");
					
				}else {
					System.out.print("수");
					
				}
			}
		}
		
		else {
			
			System.out.println("다시입력해주세요");
		}
		
	}
}
