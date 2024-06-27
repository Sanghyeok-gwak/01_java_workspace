package com.br.practice.example;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		
		int a[] = new int [10];
		
		
		for(int i =0; i<a.length; i++) {
			a[i]=i+1;
		}
		System.out.println(Arrays.toString(a));
		
		
		
	}
	public void practice2() {
		int arr[] = new int [10];
		int count = 0;
		for(int i =arr.length; i>0; i--  ) {
			System.out.println(i);
			arr[count]= i;
			count ++;
		}
		System.out.println(Arrays.toString(arr));
	}
	public void practice3() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("입력 : ");
		int size = scan.nextInt();
		
		
		int arr []= new int [size];
		
		for(int i =0; i<arr.length; i++) {
			arr[i]=i+1;
		}
		System.out.println(Arrays.toString(arr));
		
	}
	public void practice4() {
		Scanner scan = new Scanner(System.in);
		
		String arr [] = {"사과","귤","포도","복숭아","참외"};
		
		System.out.println("입력 : ");
		int a= scan.nextInt();
//		String str = scan.nextLine();
		
		
		for(int i =0; i<arr.length; i++) {
			if(a == i) {
				System.out.println(arr[i]);
			}
		}
		
	}
	public void practice5() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 : ");
		String str = scan.nextLine();
		
		char c = scan.nextLine().charAt(0);
		
		char ch [] =new char[str.length()];
		
		for(int i =0; i<str.length(); i++) {
			ch[i]=(char)str.charAt(i);
		}
		int count = 0;
		for(int i = 0; i<str.length(); i++) {
			if(c==ch[i]) {
				count ++;
			}
		}
		System.out.println(count);
		
	}
	public void practice6() {
		Scanner scan = new Scanner(System.in);
		
		String week []= {"월요일","화요일","수요일","목요일","금요일","토요일","일요일"} ;
		
		System.out.println("0~6 사이 숫자 입력 : ");
		int num = scan.nextInt();
		
		if(0<=num && num<7) {
			for(int i =0; i<week.length; i++) {
				if(num == i) {
					System.out.println(week[i]);
				}
			}
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
	}
	public void practice7() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("입력 : ");
		int size = scan.nextInt();
		
		int arr [] =new int[size];
		
		int total = 0;
		for(int i =0; i<size ; i++) {
			System.out.println(i+"번째 인덱스에 넣을 값 : ");
			int num = scan.nextInt();
			arr[i]=num;
			total+=arr[i];
		}
		System.out.println(Arrays.toString(arr));
		System.out.println(total);
	
	}
	public void practice8() {
		Scanner scan = new Scanner(System.in);
		while(true) {
			
			System.out.println("정수 : ");
			int x = scan.nextInt();
		//1. 사용자에게 3이상의 홀수 값 받기	
		if(x>=3 && x%2!=0) {
			int arr [] = new int [x];
			/*
			 * 3 입력시 => 1 , 2 , 1
			 * 5 입력시 => 1 , 2 , 3 , 2 , 1
			 * 7 입력시 => 1 , 2 , 3 , 4 , 3 ,2 , 1
			 */
			/*
			 * int value = 1; 
			 * 
			 * for(int i =0; i<arr.length; i++){
			 * 
			 * 	arr[i] = value ; 
			 * if(i<arr.length/2){
			 * 	value++;
			 * }
			 * else{
			 * value --;
			 * }
			 * 
			 * }
			 * 
			 * 
			 */
			
			int min  = x/2;
			
			for(int i =0; i<=min; i++) {
				arr[i]=i+1;
			}
			for(int i= min; i<x; i++) {
				arr[i]=arr[x-i-1];
			}
			
			System.out.println(Arrays.toString(arr));
			break;
		}else {
			System.out.println("다시입력하세요.");
		}
		
		}
	}
	public void practice9() {
		Scanner scan = new Scanner(System.in);
		
		String arr []= {"치즈","매콤","달콤","짭잘"};
		
		
			System.out.print("치킨 이름 : ");
			String str = scan.nextLine();
//			int a = 0;
			
			boolean result = false;
			for(int i =0; i<arr.length; i++) {
				if(str.equals(arr[i])) {
					result = true;
				}
			}
//			if(arr[a].equals(str)){
//				System.out.println(arr[a]+"치킨 배달가능");
//			}else {
//				System.out.println(str+"치킨은 없는 메뉴입니다.");
//			}
			System.out.println(str + (result ? "치킨 배달 가능" 
									  : "치킨은 없는 메뉴입니다"));
	}
	public void practice10() {
		int arr [] =new int [10];
		for(int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		System.out.println(Arrays.toString(arr));
	}
	public void practice11() {
		Scanner Scan= new Scanner(System.in);
		
		System.out.println("주민등록번호(-포함) : ");
		String str = Scan.nextLine();
		
		
		char ch [] = new char [str.length()];
		
		
		for(int i =0; i<ch.length; i++) {
			ch[i]=str.charAt(i);
		}
		
		for(int i = 0; i<ch.length; i++){
			if(i>7) {
	 			System.out.print("*");
			}else {
				System.out.print(ch[i]);
				
			}
		}
		
		
		
		
		
		
	}
}
