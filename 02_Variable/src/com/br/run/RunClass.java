package com.br.run;


import com.br.variable.Variable;
import com.br.variable.Keyboardinput;
public class RunClass {
	public static void main(String[] args) {
	
		Variable var = new Variable();
		
		Keyboardinput key = new Keyboardinput();

		key.inputTest1();
		//var.constant();
		//var.whyUseVariable();
		// var.declareVariable();
		/*
		  * 
		  * < 변수 >
		  * 특정 값을 메모리상에 기록하기 위한 공간 (박스)
		  * 
		  * 
		  */
		
		int pay =9860;    // 시급
		int hour = 8;     // 하루 중 근무시간
		int day = 5;      // 일주일 중 근무일수
		int week = 4;     // 한달 중 근무주수
		double tax = 0.1; // 세금 10%
		/*
		System.out.println("변수 사용 후");
		System.out.println(pay * hour);
		System.out.println(pay * hour * day);
		System.out.println(pay * hour * day * week);
		System.out.println(pay * hour * day * week * tax);
		*/

		
	}
	}

