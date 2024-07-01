package com.br.chap06_method.controller;

public class StaticTest {
	public static void method1() {
		System.out.println("static methode1");
	}
	
	
	
	public static int method2(){
		System.out.println("static methode2");
		int ran = (int)(Math.random()*100+1);
		System.out.println("랜덤 값 : "+ran);
		int total= 0;
		
		for(int i =1; i<=ran; i++) {
			total +=i;
		}
		return total;
	}
	
	public static void method3(int a , int b){
		System.out.println("static method3");
		
		if(b==0) {
			System.out.println("0으로 나눌수 없습니다/");
		}else {
			System.out.println("나눗셈 결과 : "+(a/b));
		}
			
	}
	
	
	public static boolean method4(String str1 ,String str2) {
		System.out.println("static method4");
		
		return str1.equals(str2);
	}
	
	
	
	
}
