package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;
import com.br.chap03_class.model.vo.Product;
import com.br.chap03_class.model.vo.Snack;

public class CalssMain {

	public static void main(String[] args) {
		/*				   new
		 * 클래스(를) -------생성---------> A객체
		 *   	   -------생성---------> B객체
		 * 			------생성---------> C객체
		 * 		    	인스턴스화 한다
		 * 				실체화 한다
		 *
		 */

//	Person a= new Person();
//	//생성 직후에는 JVM이 초기값들을 세팅해준다.
//	
//	a.setId("user01");
//	a.setPwd("pass01");
//	a.setName("곽상혁");
//	a.setAge(27);
//	a.setGender('남');
//	a.setPhone("010-xxxx-xxxx");
//	a.setEmail("aaa@aaaa.aaa");
//	
//	
//	System.out.println(a.getId());
//	System.out.println(a.getPwd());
//	System.out.println(a.getName());
//	System.out.println(a.getAge());
//	System.out.println(a.getGender());
//	System.out.println(a.getPhone());
//	System.out.println(a.getEmail());
//	
//	
//	Product p = new Product();
//	
//	p.setpName("옷");
//	p.setPrice(3000);
//	p.setBrand("에르메스");
//	
//	System.out.println(p.getpName());
//	System.out.println(p.getPrice());
//	System.out.println(p.getBrand());
//	
//	System.out.print(p.information());
//	Snack s = new Snack();
//	
//		s.setsName("ffff");
//		s.setPrice(22);
//		s.setKcal(11);
//	System.out.println(s.information());
//	
		Product pd = new Product("아이폰",1000000,"애플");	
		System.out.println();
		System.out.println(pd.information());
		System.out.println("2번째 기존가격"+pd.getPrice());
		System.out.println("2번째 할인가격"+(int)(pd.getPrice() * 0.9));
	}
}
