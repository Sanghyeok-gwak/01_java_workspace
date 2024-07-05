package com.br.chap01_poly.run;

import com.br.chap01_poly.model.vo.Child1;
import com.br.chap01_poly.model.vo.Child2;
import com.br.chap01_poly.model.vo.Parent;

public class PolyMain {

	public static void main(String[] args) {
		
		// = 대입연산자 왼쪽, 오른쪽 자료형이 같아야됨!
		
		System.out.println("1. 부모타입 레퍼런스로 부모객체를 다루는 경우");
		
		Parent p1 = new Parent();
		p1.printParent();
		// p1 레퍼런스로 Parent에만 접근 가능
		
		System.out.println("2. 자식타입 레퍼런스로 자식객체를 다루는 경우");
		
		Child1 c1 = new Child1();
		c1.printChild1();
		c1.printParent();
		// c1 레퍼런스로 Child1, Parent에 둘 다 접근 가능
		
		System.out.println("3. 부모타입 레퍼런스로 자식객체를 다루는 경우 (다형성)");
		
		Parent p2 = /*(Parent)*/new Child1();   // 자동형변환 
		p2.printParent();
		((Child1)p2).printChild1();
		
		
		
		/*
		 * * 상속 구조의 클래스들 간 형변환 가능
		 * 
		 * 1. UpCasting
		 *    자식 타입 -> 부모 타입 
		 *    자동형변환 
		 * 
		 * 2. DownCasting
		 *    부모 타입 -> 자식 타입 
		 *    강제형변환
		 * 
		 */
		
		/*
		 * < 다형성 > 
		 * 
		 * 부모타입으로부터 파생된 여러타입의 자식 객체들을
		 * 부모타입 하나로 다룰 수 있는 기술
		 * 
		 * < 다형성 적용 목적(장점) >
		 * 
		 * 1. 다수의 자식객체들을 하나로 관리할 수 있어 용이(부모타입배열로 관리)
		 * 2. 메소드 정의시 매개변수로 부모타입 기술하게 되면 메소드 갯수 줄일 수 있음
		 * 
		 * 
		 * => object 클래스에 equals메소드의 매개변수가 object로 설정되어있음
		 * 	
		 * 		학생객체.equals();
		 * 		도서객체.equals();
		 * 		제품객체.equals();
		 */
		
		// 다형성 적용 전 . Child1객체 2개,Child2객체 2개 관리
		Child1[] arr1 = new Child1[2];
		arr1[0] = new Child1(1,2,4);
		arr1[1] = new Child1(3,4,5);
		
		Child2[] arr2 = new Child2[2];
		arr2[0] = new Child2(4,2,1);
		arr2[1] = new Child2(2,3,1);
		//--------------------------------------------
		
		// 다형성 적용 후. Child1객체 2개 , Child2객체 2개 관리
		Parent[] arr = new Parent[4];// {Parent타입 , Parent타입 ,Parent타입,Parent타입}
		
		arr[0] = new Child1(1,2,4);
		arr[1] = new Child2(4,2,1);
		arr[2] = new Child2(2,3,1);
		arr[3] = new Child1(3,4,5);
		// 하나의 부모타입만으로 여러 자식객체들을 관리할 수 있음 => 편리함,코드 길이 감소
		System.out.println("=========================================");
		((Child1)arr[0]).printChild1(); 
		((Child2)arr[1]).printChild2(); 
		((Child2)arr[2]).printChild2();
		((Child1)arr[3]).printChild1();
		System.out.println("===============반복문 활용====================");
		/*
		 * instanceof 연산자 = > true/false
		 * 현재 레퍼런스가 "실질적"으로 어떤 클래스타입을 참조하는지 확인할때 사용
		 * 
		 */
		for(int i =0; i<arr.length; i++) {
			if(arr[i] instanceof Child1) {//각 인덱스자리에 어떤 자식객체가 담겼을지 모를 경우
				((Child1)arr[i]).printChild1();
			}else {
				((Child2)arr[i]).printChild2();
			}
		}
		System.out.println("===============오버라이딩 활용====================");
		
		for(int i =0; i<arr.length; i++) {
			arr[i].print();
		}
		/* 
		 *  소스코드 ====== 컴파일=====> byte코드 ====실행====>프로그램실행
		 *  .java    	컴파일과정     .class     런타임 과정  프로그램동작
		 *  
		 *  동적바인딩 : 프로그램 실행 전 "컴파일 시점" 에는 정적바인딩에 의해
		 *  	     부모 클래스 의 메소드를 카리킴
		 *  		 단, 프로그램 실행 되는 순간(런타임 시점)
		 *  		 실제로는 자식클래스에 오버라이딩된 메소드가 실행됨
		 *  
		 */
		
		System.out.println("===============for문 상위 활용====================");
		
		for(Parent p: arr) {	
			p.print();
		}
	}

}
