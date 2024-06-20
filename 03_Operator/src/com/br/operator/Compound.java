package com.br.operator;

public class Compound {
	/*
	 * < 복합 대임 연산자 >
	 * 
	 * 산술 연산자와 대입연산자가 결합되어있는 형태
	 * 연산처리 속도가 빨라지기때문에 사용하는걸 권장 
	 *
	 * += -= *= /= %=
	 * 
	 */
	public void method1(){
		int num = 12;
		
		num++;		
		System.out.println(num);
		
		num = num + 3;
		System.out.println(num);
		
		num += 3;
		System.out.println(num);
		
		num -= 5;//num = num -5
		System.out.println(num); //14
		
		num*= 3; 
		System.out.println(num);
		
		num/= 2;
		System.out.println(num);
		
		num%= 4;
		System.out.println(num);
		
		String str = "hello";
		str +="World";
		System.out.println(str);
		
	}
	
	
	
}
