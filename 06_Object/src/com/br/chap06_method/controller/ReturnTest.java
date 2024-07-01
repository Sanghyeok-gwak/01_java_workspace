package com.br.chap06_method.controller;

import java.util.Scanner;

import com.br.chap05_constructor.model.vo.User;

public class ReturnTest {
	
	public int method1() {
		System.out.println("method1");
		// 1부터 100까지의 총합계를 구해서 반환
	
		int total = 0;
		
		
		for(int i=1; i<=100; i++) {
			total +=i;
		}
		return total;
	}
	
	public String method2() {
		Scanner scan = new Scanner(System.in);
		System.out.println("method2");
		
		System.out.print("이름 : ");
//		String str = scan.nextLine();
//		return str ;
		return scan.nextLine();
	}
	
	public double method3() {
		System.out.println("method3");
		return Math.random() ;
	}
	/**
	 *  
	 * @param a
	 * @param b
	 * @return 
	 * 
	 * 
	 * 
	 */
	
	public int minus(int a , int b) {
		System.out.println(a+","+b);
		return (a-b);
	}
	public int[] method4(int size) {
		int [] arr= new int[size];
		for(int i =0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
		}
		return arr;
	}
	
	//객체 반환 => 사실상 객체의 주소값 반환
	public User method5(String userId,String userPwd , String name ) {
		
//		return new User (userId,userPwd,name); 
		
		
		User u = new User (userId,userPwd,name);
		return u ;// return => 주소값 
	
	
	
	
	}
}
