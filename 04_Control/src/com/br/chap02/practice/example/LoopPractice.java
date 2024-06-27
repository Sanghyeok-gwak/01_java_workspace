package com.br.chap02.practice.example;

import java.util.Scanner;

public class LoopPractice {
	public void method1(){
		Scanner scan = new Scanner(System.in);
		
		int x= scan.nextInt();
		
		for(int i =1; i<=x; i++) {
			System.out.print(i+" ");
		}
	}
	public void method2(){
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			System.out.println("입력 : ");
			int x= scan.nextInt();
			
			if(x<=0) {
				System.out.println("잘못입력했습니다. 다시입력해주세요");
			}
			else {
				for(int i =1; i<=x; i++) {
					System.out.println(i);
				}
				break;
			}
		}
	}
	public void method3(){
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int x= scan.nextInt();
		
		if(x <=0) {
			System.out.println("잘못 입력하셨습니다.");
		}else {
			for(int i =x; i>=1; i--) {
				System.out.print(i+" ");
			}
			
		}
	}
	public void method4(){
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			System.out.print("입력 : ");
			int x= scan.nextInt();
			
			if(x<=0) {
				System.out.println("잘못 입력하셨습니다. 다시입력해주세요.");
			}else {
				for(int i=x; i>=1; i--) {
					System.out.println(i);
				}
				break;
			}
		}
	}
	public void method5(){
		Scanner scan = new Scanner(System.in);
		
		System.out.print("입력 : ");
		int x= scan.nextInt();
		int t= 0;
		for(int i =1; i<=x; i++) {
			t+=i;
		}
		System.out.println(t);
		
	}
	public void method6(){ // 다시
		// 메소드 활용해서 풀어보기
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int x= scan.nextInt();
		System.out.println("입력2 : ");
		int y= scan.nextInt();
		
		if (x>0 && y>0) {
			
			if(x > y) {
				for(int i=y; i<=x; i++ ) {
					System.out.println(i);
				}
			}
			
			
			
			
			else {
				for(int i=x; i<=y; i++ ) {
					System.out.println(i);
				}
			}
		}else {
			System.out.println("1이상의 숫자만 입력해주세요.");
		}
	
		
	}
	public void method7(){
		// 최소값 최대값 구하는 메소드 
		// int min = Math.min(변수 , 변수);
		// 메소드 활용해서 풀어보기 
		//
		Scanner scan = new Scanner(System.in);
//		if(x>y) {
//			for(int i =y; i<=x; i++) {
//				System.out.print(i + " ");
//			}
//			break;
//		}
//		else {
//			for(int i =x; i<=y; i++) {
//				System.out.print(i + " ");
//			}
//			break;
//		}
		while(true) {
			
		System.out.println("입력1 : ");
		int x= scan.nextInt();
		System.out.println("입력1 : ");
		int y= scan.nextInt();
		
			if(x>0 && y>0) {
				int max = Math.max(x, y);
				int min = Math.min(x, y);
				for(int i =min; i<=max; i++) {
					System.out.println(i+" ");
				}
			}
			else {
				System.out.println("1 이상의 숫자를 입력해주세요.");
			}
		}
		
	}
	public void method8(){
		Scanner scan = new Scanner(System.in);
		
		int x = scan.nextInt();
		
		for(int i=1; i<=9; i++) {
			System.out.println(x+" x "+i+" = "+x*i);
		}
	}
	public void method9(){
		Scanner scan = new Scanner(System.in);
		System.out.print("입력 : ");
		int x= scan.nextInt();
		
			for(int j =x; j<=9; j++) {
				for(int i =1; i<=9; i++) {
					System.out.println(j+" x "+i+" = "+j*i);
				}
			System.out.println();
		}
		
	}
	public void method10(){
		Scanner scan = new Scanner(System.in);
		while(true) {
			
		System.out.print("입력 : ");
		int x= scan.nextInt();
		if(2<=x &&x<=9) {
			
			for(int j =x; j<=9; j++) {
				for(int i =1; i<=9; i++) {
					System.out.println(j+" x "+i+" = "+j*i);
				}
				System.out.println();
			}
			break;
		}else {
			System.out.println("2~9 사이의 숫자만 입력해주세요.");
		}
		}
	}
	public void method11(){
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력1 : ");
		int x=scan.nextInt();
		System.out.println("입력2 : ");
		int y=scan.nextInt();
	
		int t=x;
//		int i =1;
//		while(i<=10) {
//			System.out.print(t+" ");
//			t+=y;
//			i++;
//		}
		for(int i =1; i<=10; i++) {
			System.out.println(t);
			t+=y;
		}
	}
	public void method12(){
		Scanner scan  = new Scanner(System.in);
		
		while(true) {
			
			System.out.println("연산자(+,-,*,/,%) : ");
			String str = scan.nextLine();
			if(str.equals("exit")) {
				System.out.println("프로그램을종료합니다.");
				break;
			}
		
			else {
				
				System.out.println("입력1 : ");
				int x= scan.nextInt();
				System.out.println("입력2 : ");
				int y = scan.nextInt();
				
				if(str.charAt(0)=='+') {
					System.out.println(x+" + "+y+" = "+(x+y));
					scan.nextLine();
				}
				else if(str.charAt(0)=='-') {
					System.out.println(x+" - "+y+" = "+(x-y));
					scan.nextLine();
				}
				else if(str.charAt(0)=='*') {
					System.out.println(x+" x "+y+" = "+(x*y));
					scan.nextLine();
				}
				else if(str.charAt(0)=='/') {
					if(x==0 ||y==0) {
						System.out.println("0으로 나눌 수 없습니다. 다시입력해주세요.");
						scan.nextLine();
					}
					else {
						System.out.println(x+" / "+y+" = "+(x/y));
						scan.nextLine();
					}
				}
				else if(str.charAt(0)=='%') {
					System.out.println(x+" % "+y+" = "+(x%y));
					scan.nextLine();
				}
				
				else  {
					System.out.println("없는 연산자입니다. 다시입력해주세요.");
					scan.nextLine();
				}
			}
		}
	}
public void practice13() {
		
		/*
		 * 사용자에게 문자열을 입력 받고 	
		 * 입력받은 문자열에서 검색하고 싶은 문자도 입력받기
		 * 문자열에 그 문자가 몇 개 있는지 개수 출력
		 * 
		 * ex)
		 * 문자열 : banana 		(=> 사용자가 입력한 값)
		 * 찾고자하는 문자 : a 	(=> 사용자가 입력한 값)
		 * 
		 * 포함된 갯수 : 3		(결과출력)
		 */
		
		Scanner scan = new Scanner(System.in);
		
		String str = scan.nextLine();
		
		String result = scan.nextLine();
		int count =0;
		for(int i =0; i<str.length(); i++) {
			if (str.charAt(i)== result.charAt(0)) {
				System.out.print(i+ " ");
				count++;
			}
		}
		System.out.println();
		System.out.println(count);
		
		
	}
	
	
	public void practice14() {
		
		/*
		  아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 작성해보시오.
		  (5행 10열짜리 *을 먼저 출력해놓고 거기서 응용한다고 생각해보시오)
		
		
			**********
			*        *
			*        *
			*        *
			**********

		 */
		
		for(int i=1; i<=5; i++) {
			for(int j =1; j<=10; j++) {
				
			if(i==1 || i==5) {
				System.out.print("*");
			}else {
				if(j==1 || j==10) {		
					System.out.print("*");
				}else {					
					System.out.print(" ");
				}
			}
			}
			System.out.println();
		}
	}
	
	// 난이도 상
	public void practice15() {
		/*
		  아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 활용하여 작성하시오.
		  
		     1
		    123
		   12345
		  1234567
		 123456789
		  1234567
		   12345
		    123
		     1
		     
	     */
		
		for(int i=-4; i<=4; i++) {	// i는 -4~4까지 1씩 증가 (-4,-3,-2,-1,0,1,2,3,4)
			
			int k = i < 0 ? -i : i;	// i의 절대값을 k변수에 담는 구문 (4,3,2,1,0,1,2,3,4)
			
			// 앞에 공백을 먼저 출력시키는 for문 
			for(int j=0; j<k; j++) { // k횟수만큼 공백이 먼저 출력됨
//				System.out.print(" ");
			}
			
			// 그 후에 숫자를 출력시키는 for문 
			for(int j=1; j<=9-2*k; j++) { // 1에서부터 9-2*k까지 1씩 증가되는 구문이 출력
				System.out.print(j);
			}
			
			/*
			 * * 추가설명 
			 * k=4일 경우 j=1까지 출력 (1)
			 * k=3일 경우 j=3까지 출력 (123)
			 * k=2일 경우 j=5까지 출력 (12345)
			 * k=1일 경우 j=7까지 출력 (1234567)
			 * k=0일 경우 j=9까지 출력 (123456789)
			 * 
			 * 따라서 j는 9-2*k 까지로 제시되어야함
			 */
			
			System.out.println(); // 한줄 다 출력되면 그 다음줄로 넘기는 개행출력
			
		}
		
	}
	
	// 난이도 상
	public void practice16() {
		/*
		 아래와 같은 형식으로 출력될 수 있도록 중첩 for문을 활용하여 작성하시오.
		 
		   *
		  * *
		 *   *
		  * *
		   *
		   
		 */
		//2 ,13 ,234
//		,13 ,2
		for(int i =1; i<=5; i++) {
			for(int j =1; j<=5; j++) {
				
			}
		}
		
	}
	
	public void practice17() {
		
		/*
		 * 70원씩 모금을 하여 최종 목표 모금액인 10,000원을 달성하려고 한다.
		 * 이때 아래와 같은 출력문이 나올 수 있도록하시오. 
		 * 
		 * 
		 *   1회 모금액 :    70원
		 *   2회 모금액 :   140원
		 *   3회 모금액 :   210원
		 * 			...
		 * 142회 모금액 :  9940원
		 * 143회 모금액 : 10010원 
		 * 
		 * 총 모금횟수 : 143회
		 * 
		 * 
		 * 
		 */
		
		
		// 목표금액 (상수로 선언)
		
	}
	
	
	
}
