package com.br.chap02.loop;

public class Continue {
	/*
	 * continue; : 반복문 안에 기술되는 구문으로
	 * 			   continue; 실행시 그 뒤의 구믄들은 실행되지 않고
	 * 			   그 즉시 현재 속해있는 반복문 위로 올라가서
	 * 			   이어서 진행됨
	 */

	public void method1(){
		//1부터 10까지 홀수 출력
		for(int i =1; i<=10; i++) {
			if(i%2==0) {
				continue;
			}
				System.out.print(i+" ");
		}
	}
	public void method2(){
		int total =0;
		for(int i =1; i<=100; i++) {
			if(i%6==0) {
				continue;
			}
			System.out.print(i+" ");
			total+=i;
		}
		System.out.println(total);
	}
	public void method3(){
		for(int i =2; i<10; i++) {
			if(i%3==0) {
				continue;
			}
			System.out.println("=== "+i+" 단 ===");
			for(int j =1; j<10; j++) {
				System.out.println(i+" x "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}
	public void method4 () {
		
	}
}
