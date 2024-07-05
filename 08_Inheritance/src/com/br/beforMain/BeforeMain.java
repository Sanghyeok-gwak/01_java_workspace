package com.br.beforMain;

import com.br.before.model.vo.Desktop;
import com.br.before.model.vo.SmartPhone;
import com.br.before.model.vo.Tv;

public class BeforeMain {
	public static void main(String[] args) {
		//Desktop 객체
		// brand, pCode,pName, price , allInOne
		Desktop d =new Desktop("삼성","d-02","짱짱데스크탑",150000,true);
		
		//Tv 객체
		//brand, pCode , pName ,price, inch
		Tv t = new Tv("엘지","t-1003","올레드",350000,65);
		
		//SmartPhone
		//brand, pCode , pName ,price, mobileAgency
		SmartPhone s = new SmartPhone("애플","s-2001","아이폰",1300000,"LG");
		
		
		System.out.println(d.information());
		System.out.println(t.information());
		System.out.println(s.information());
		
		/*
		 * 세 클래스에 공통적인 필드와 공통적인 메소드가 존재
		 * 		문제점 : 중복된 코드를 수정해야만 할 때
		 * 			   일일히 찾아서 다 수정해야됨 (유지보수 불편)
		 * 		해결방안 : 중복된 코드를 하나의 클래스로정의해두고
		 * 			 	상속구조를 갖춰서 가져다 쓸 수 있도록 작업
		 * 
		 * 	brand , pCode, pName, 
		 * 
		 *
		 */
		
		
	}
}
