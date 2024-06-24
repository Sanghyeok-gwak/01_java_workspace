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
		Scanner scan = new Scanner(System.in);
		while(true) {
			
		System.out.println("입력1 : ");
		int x= scan.nextInt();
		System.out.println("입력1 : ");
		int y= scan.nextInt();
		
		if(x>0 && y>0) {
			if(x>y) {
				for(int i =y; i<=x; i++) {
					System.out.print(i + " ");
				}
				break;
			}
			else {
				for(int i =x; i<=y; i++) {
					System.out.print(i + " ");
				}
				break;
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
		
		int count =1;
		
		while (true) {
			System.out.println(x+y);
			if(count ==10) {
				break;
			}
			count ++;
			
			
			
		}
		
		
		
	}
}
