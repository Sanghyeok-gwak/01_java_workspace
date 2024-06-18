package com.br.variable;

import java.util.Scanner;

public class test {
	public void practice1() {
		//사용자에게 이름, 년, 반 순으로 입력받은 후
		// 결과를 출력해보기
		
	Scanner scn= new Scanner(System.in);
	
	System.out.print("당신의 이름을 입력을 해주세요 : ");
	String name = scn.nextLine();
	
	System.out.print("당신의 학년을 입력 해주세요 : ");
	int years = scn.nextInt();
	
	
	System.out.println("당신의 반을 아래번호를 골라 입력해주세요 : ");
	System.out.println("1. 깻잎반 2. 복숭아반 3. 상추반");
	
	int ban= scn.nextInt();
	if (ban<3);{
		System.out.println("값을 정확히 입력하지않아 종료 되었습니다.");
		
	}
	if (ban==1) {
		
		System.out.println("당신의 이름은 "+name +"이며, "+years +"학년이고"+"깻잎반 입니다.");
	}
	if (ban == 2) {
		
		System.out.println("당신의 이름은 "+name +"이며, "+years +"학년이고"+"복숭아반 입니다.");
	}
	if (ban == 3) {
		System.out.println("당신의 이름은 "+name +"이며, "+years +"학년이고"+"상추반 입니다.");
		
	}
	

	
	
	
	
	
		
		
		
	}
}
