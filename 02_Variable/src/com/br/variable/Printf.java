package com.br.variable;

public class Printf {
	public void printfTest(){
		
		/*
		 * print(출력값)		: 값 출력만 해줌 (줄바꿈X)
		 * println([출력값])	: 값 출력 후 줄바꿈o
		 * 
		 * printf("출력하고자하는형식(포맷)",[출력값,..........])
		 * :출력하고자하는 값들이 제시한 형식에 맞춰서 출력 (줄바꿈X)
		 * 
		 * 포맷 안에 쓰일수 있는 키워드
		 * %d : 정수값이 들어갈 자리 확보
		 * %f : 실수값이 들어갈 자리 확보
		 * %s : 문자열이 들어갈 자리 확보(문자도 가능)
		 * %c : 문자값이 들어갈 자리 확보(문자열 안됨)
		 * 
		 * 
		 */
		int iNum1 = 10;
		int iNum2 = 20;
		
		//10 20
		
		
		
		System.out.println(iNum1 + " " + iNum2+"%");
		System.out.printf("%d %d%% %n",iNum1,iNum2);
		
		System.out.printf("%5d\n",iNum1);
		System.out.printf("%5d\n",250);
		System.out.printf("%5d\n",3000);
		System.out.printf("%5d\n",2);
		
	
		
		
		char ch= 'a';
		String str = "Hello";
		
		System.out.printf("%c %10s %s\n", ch,str,ch);
		
		
		System.out.printf("%C %S\n", ch,str);
	}
}
