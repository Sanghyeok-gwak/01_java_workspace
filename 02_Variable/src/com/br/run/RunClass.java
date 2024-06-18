package com.br.run;
import com.br.variable.Variable;
public class RunClass {
	public static void main(String[] args) {
		
		Variable var = new Variable();
		
		
		var.whyUseVariable();
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
		
		System.out.println("변수 사용 후");
		System.out.println(pay * hour);
		System.out.println(pay * hour * day);
		System.out.println(pay * hour * day * week);
		System.out.println(pay * hour * day * week * tax);
		
		/*
		 * < 변수 사용 이유 > 
		 * 
		 * 1. 값에 의미를 부여할 수 있음 ( 가독성이 좋아짐 )
		 * 2. 자주 사용하는 값을 변수에 담아두면 동일한 값을 계속 사용 할 수 있음
		 * 3. 유지보수에 용이함 
		 * 
		 * 
		 */
		
	}
}
