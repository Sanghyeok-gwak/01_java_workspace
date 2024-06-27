package com.br.chap03_class.run;

import com.br.chap03_class.model.vo.Person;

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

	Person a= new Person();
	//생성 직후에는 JVM이 초기값들을 세팅해준다.
	
	a.setId("user01");
	a.setPwd("pass01");
	a.setName("곽상혁");
	a.setAge(27);
	a.setGender('남');
	a.setPhone("010-xxxx-xxxx");
	a.setEmail("aaa@aaaa.aaa");
	
	System.out.println(a.getId());
	System.out.println(a.getPwd());
	System.out.println(a.getName());
	System.out.println(a.getAge());
	System.out.println(a.getGender());
	System.out.println(a.getPhone());
	System.out.println(a.getEmail());
	
	}

}
