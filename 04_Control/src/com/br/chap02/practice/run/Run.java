package com.br.chap02.practice.run;

import com.br.chap02.practice.example.*;
public class Run {
	public static void main(String[] args) {
		
		LoopPractice lp =new LoopPractice();
		
//		lp.method1();
//		lp.method2();
//		lp.method3();
//		lp.method4();
//		lp.method5();
//		lp.method6(); //V 메소드 활용 (Math)
//		lp.method7(); //V 메소드 활용 (Math)
//		lp.method8();
//		lp.method9();
//		lp.method10();
//		lp.method11(); //V
//		lp.method12(); //V switch , continue , 사용해서 풀어보기 
//		lp.practice13();
//		lp.practice14();
//		lp.practice15();
		for(int i =-4; i<=4; i++) {
			int k= i<0 ? -i : i;
			System.out.print(k+" ");
		}
//		System.out.println(9-2*4);
//		for(int i =1; i<=1; i++) {
//			System.out.println(i);
//		}
		
		
for(int i=-2; i<=2; i++) {		// i는 -2에서부터 2까지 1씩 증가 (-2,-1,0,1,2)
			
			int k = i < 0 ? -i : i;	 	// i의 절댓값을 k변수에 대입해둠 (2,1,0,1,2)
			
			for(int j=0; j<k; j++) {	// k횟수만큼 공백을 먼저 출력
				System.out.print(" ");
			}
			
			for(int j=1; j<=5-2*k; j++) { // 5-2*k만큼 "*" 또는 "공백"이 출력되어야됨
				
				if(j==1 || j==5-2*k) {		// 이때 첫번째열 또는 마지막열에만 * 출력하고
					System.out.print("*");
				}else {						// 그게 아닐경우 공백을 출력하도록
					System.out.print(" ");
				}
				
			}
			
			/*
			 * k=2일때 j=1~1   => *
			 * k=1일때 j=1~3   => * *
			 * k=0일때 j=1~5   => *   * 
			 */
			
			System.out.println();
			
		}
	}	
	
	
}
