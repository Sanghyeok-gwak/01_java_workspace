package com.br.chap06_method.controller;

import java.util.Arrays;

import com.br.chap05_constructor.model.vo.User;

public class ParameterTest {
	/*
	 * < 메소드 >
	 * 한 기능을 처리하기 위해 실행될 코드를 정의해두는 개념
	 * 
	 * [표현범]
	 * 접근제한자 [예약어] 반환형 메소드명([매개변수,매개변수,....]){
	 * 		수행내용;
	 * 		[return 결과값;]
	 * }
	 * 
	 * 1. 반환형 : 메소드 실행 후 반환되는 값의 타입(자료형) : (반환값이 없을 경우)
	 * 2. 매개변수(parameter) : 메소드 호출시 전달되는값(인자,인수,argument)을 저장할 변수
	 * 
	 * 
	 * 
	 */
	
	public void method1() {
		
		System.out.println("method1");
		
	}
	public void method2(int x) {// int x = 전달값;
		System.out.println("method2 : " + x);
	}
	public void method3 (String str) {// String str = 전달값;
		System.out.println("method3 : "+ str);
	}
	public void method4 (int x, String str) {// int x = 전달값 , String str = 전달값
		System.out.println("method4 : "+ x + str);
	}
	
	
	public void sum (int x, int y) {
		System.out.println(x +" , "+ y );
		System.out.println("덧셈 결과 : "+(x+y));
	}
	
	//가변 매개변수(전달되는 값의 갯수가 정해져있지 않을 경우)
	
	public void method5 (int... params) {//params : 배열이다
		System.out.println("method5 : "+ Arrays.toString(params));
	}
	public void method6 (String str ,int ... params) {
		System.out.println("method6 : "+str+"\n"+ Arrays.toString(params));
	}
	public void method7 (String [] arr ) {
		System.out.println("method7 : "+Arrays.toString(arr));
	}
	public void method8 (User u) {
		System.out.println("method8 : "+ u);
		u.setUserPwd("5678");
		System.out.println(u.information());
	}
	
	
	
	
	
	
	
}