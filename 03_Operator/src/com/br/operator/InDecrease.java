package com.br.operator;

public class InDecrease {
	
	
	/*
	 * < 증감 연산자 (단항 연산자) >
	 * 
	 *  
	 *  ++ : 변수에 담긴 값을 1씩 증가시켜주는 연산자
	 * 		 ++변수 : 변수++
	 *  -- : 변수에 담긴 값을 1씩 감소시켜주는 연산자
	 *  	 --변수 : 변수--
	 *  
	 *  (증감연산자)변수 : 전위연산 => "선증감" 후처리
	 *  변수(증감연산자) : 후위연산 =>  선처리 "후증감"
	 *  
	 */
	
	public void method1() {
		//전위연산테스트
		
		int num1 = 10;
		
		System.out.println("전위연산적용 전 : "+num1); //num1 = 10;
		System.out.println("1회 수행 후 : "+ ++num1);//num1 = 11; 
		System.out.println("2회 수행 후 : "+ ++num1);//num1 = 12;
		System.out.println("최종 값 : "+ num1);//num1 = 12;
		
		System.out.println("========================");
		
		//후위연산테스트
		
		int num2 = 10;
		
		System.out.println("후위연산적용 전 : "+num2);//num2 = 10;
		System.out.println("1회 수행 후 : "+ num2++);//10출력 후 --> num2 = 11;
		System.out.println("2회 수행 후 : "+ num2++);//11출력 후 --> num2 = 12;
		System.out.println("최종 값 : "+ num2);//num2 = 12
		
		
	}
	
	
	public void method2() {
		
		int a = 10;
		int b = ++a;
		
		System.out.printf("a : %d,b : %d\n",a,b);
		
		int c = 10;
		int d = c++;
		
		System.out.printf("c : %d, d : %d\n",c,d);
		
		System.out.println("---------------------");
		
		int num =20;
		
		System.out.println(num);//20
		System.out.println(num++);//20
		System.out.println(++num);//22
		System.out.println(--num);//21
		System.out.println(num--);//21
		System.out.println(num);//20
	
	}
	public void method3() {
		int num1 = 20;
		int result = ++num1 * 3; 
		System.out.printf("num1 : %d , result1 : %d\n",num1,result);
		
		
		int num2 = 20; 
		int result2 = num2++ *3;
		System.out.printf("num2 : %d , result2 : %d\n",num2,result2);
		
		
		
	}
	public void method4() {
		int a = 10;
		int b= 20;
		int c =30;
		
		System.out.println(a++); //10
		System.out.println((++a) + (b++)); //32
		System.out.println((a++) + (--b) + (--c));//61
		
	
	
		System.out.println(a);//13
		System.out.println(b);//20
		System.out.println(c);//29
		
	
	}
}
