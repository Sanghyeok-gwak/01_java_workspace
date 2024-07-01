package com.br.homework.controller;

import java.util.Scanner;

public class Function {
	public void calculator() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫 번째 정수 : ");
		int x = scan.nextInt();
		System.out.print("두 번째 정수 : ");
		int y = scan.nextInt();
		System.out.print("연산자 (+,-,x,/) : ");
		char ch =scan.next().charAt(0);
		
		
		switch(ch) {
		case '+': System.out.println(x+" + "+y+" = "+(x+y));break;
		case '-': System.out.println(x+" - "+y+" = "+(x-y));break;
		case '*': System.out.println(x+" x "+y+" = "+(x*y));break;
		case '/': if(y==0) {System.out.println("0으로 나눌 수 없습니다.");}else {System.out.println(x+" / "+y+" = "+(x/y));}break;
			
		}
		
		
	}
	public void totalCalculator() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int x= scan.nextInt();
		System.out.print("두번째 정수 : ");
		int y= scan.nextInt();
		
		
		int total =0;
		int max = Math.max(x, y);
		int min = Math.min(x, y);
		
		for(int i =min; i<=max; i++) {
			total +=i;
		}
		System.out.println(min+"부터 "+max+"까지"+" 정수들의 합 : "+total);
		
	}
	public void printProfile() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("나이 : ");
		int age = scan.nextInt();
		System.out.print("성별 : ");
		char ch = scan.nextLine().charAt(0);
		System.out.print("성격 : ");
		String str = scan.nextLine();
		
		System.out.println("이름 : "+name);
		System.out.println("나이 : "+age);
		System.out.println("성별 : "+ch);
		System.out.println("성격 : "+str);
				
	}
	public void printScore() {

		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.nextLine();
		System.out.print("학년 : ");
		int num1 = scan.nextInt();
		System.out.print("반 : ");
		int num2 = scan.nextInt();
		System.out.print("번 : ");
		int num3 = scan.nextInt();
		System.out.print("성별(M/F) : ");
		String x = scan.nextLine();
		scan.nextLine();
		System.out.print("성적 : ");
		double num4= scan.nextDouble();
		
		char abcdf = ' ';
		String ch2=" ";
		
		if(num4>=90) {
			abcdf='A';
		}
		else if (num4>=80) {
			abcdf='B';
		}
		else if (num4>=70) {
			abcdf='C';
		}
		else if (num4>=60) {
			abcdf='D';
		}
		else if (num4<60) {
			abcdf = 'F';
		}
		
		
		
		if(x.equals("M") && x.equals("m")) {
			ch2="남학생";
		}
		else if(x.equals("F") && x.equals("f")) {
			ch2="여학생";
		}
		System.out.printf("%d학년 %d반 %d번 %s %s의 점수는 %.2f이고 %s학점입니다.",num1,num2,num3,ch2,name,num4,abcdf);
	}
	public void printStarNumber() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 : ");
		int x = scan.nextInt();
		
		
		for(int i = 1; i<=x; i++) {
			
			System.out.println(i);
			for(int j =1; j<=i; j++) {
				System.out.print("*");
			}
		}
	}
	public void sumRandom() {
		
		int x = 1; 
		int y= (int)(Math.random()*100+1);
		int total =0;
		
		for(int i =x; i<=y; i++) {
			total +=i;
		}
		System.out.println(x+"부터"+y+"까지의 합 : "+total);
	}
	public void exceptGugu() {
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 : ");
		int x = scan.nextInt();
		
		if(0<x) {
			for(int i =1; i<=9; i++) {
				if(i%x!=0) {
					System.out.println(x +" x "+i +" = "+x*i);
				}
			}
		}
		
	}
	public void diceGame() {
		Scanner scan = new Scanner(System.in);
		
		
		while(true) {
			int x = (int)Math.random()*6+1;
			int y = (int)Math.random()*6+1;
			System.out.print("주사위 두 개의 합을 맞춰보세요(2~12)입력 : ");
			int result = scan.nextInt();
			if (result == x+y) {
				System.out.println("정답입니다.");
				System.out.println("주사위 합 : "+ (x+y));
				scan.nextLine();
				System.out.println("계속 하시겠습니까?(y/n) : ");
				char ch = scan.nextLine().charAt(0);
				if(ch=='n' || ch=='N') {
					System.out.println("종료합니다.");
					break;
				}
			}else {
				System.out.println("틀렸습니다.");
				System.out.println("주사위 합 : "+ (x+y));
			}
			
			
		}
		
		
	}
	
	
	
}
