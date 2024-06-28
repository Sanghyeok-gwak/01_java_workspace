package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Cosmetic;
import com.br.chap05_constructor.model.vo.User;

public class ConstructorMain {
	public static void main(String[] args) {
//		User u =new User();
//		System.out.println(u.information());
//		u.setUserId("aaa");
//		u.setUserPwd("bbb");
//		u.setUserName("ccc");
////		u.setAge(27);
////		u.setGender('M');
//		System.out.println(u.information());
//		//매개변수 생성자를 이용해서
//		//객체 생성과 동시에 값 초기화
//		User u2 = new User("user02","pass02","김말똥");
//		System.out.println(u2.information());
//		User u3 = new User("user03","pass03","강개순",23,'여');
//		System.out.println(u3.information());
	
		Cosmetic cc = new Cosmetic();
		cc.setcName("립스틱");
		cc.setPirce(15000);
		cc.setBrand("샤넬");
		cc.setCategory("입술?");
		
		System.out.println(cc.inpormation());
		System.out.println("--------------------------");
		Cosmetic cc1 = new Cosmetic("BB크림",50000,"디올","얼굴?");
		System.out.println(cc1.inpormation());
		
	}

}
