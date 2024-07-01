package com.br.chap06_method.run;

import java.util.Arrays;

import com.br.chap05_constructor.model.vo.User;
import com.br.chap06_method.controller.OverlodingTest;
import com.br.chap06_method.controller.ParameterTest;
import com.br.chap06_method.controller.ReturnTest;
import com.br.chap06_method.controller.StaticTest;

public class MethodMain {

	public static void main(String[] args) {
		
		ParameterTest ptt = new ParameterTest();
		
		
//		ptt.method1();
//		ptt.method2(1);
//		ptt.method3("Hi");
//		ptt.method4(1,"Hi");
//		ptt.sum((int)(Math.random()*10+1), (int)(Math.random()*10+1));
//		ptt.method5(1,2,2,3,5,4,8,54,14,1,25);
//		ptt.method5(1,2,2,3,5,4,8,54);
//		ptt.method5(1,2,2,3,5);
//		ptt.method6("길동이",1,2,2,3,5);
//		ptt.method7(new String [] {"d","asdf"});
//		ptt.method8(new User("user01","pass01","깅게떵"));
//		
//		
		ReturnTest rt =new ReturnTest();
		
		
		
		
//		int result = rt.method1();
//		System.out.println("1부터 100까지 합 : "+rt.method1());
//		String str =rt.method2();
//		System.out.println(str);
//		double d = rt.method3();
//		System.out.println(d);
//		System.out.println("빼기연산자");
//		System.out.println(rt.minus((int)(Math.random()*10+1), (int)(Math.random()*10+1)));
//		System.out.println(Arrays.toString(rt.method4(5)));
//		System.out.println();
//		
//		
//		
//		User user = rt.method5("id", "pwd", "나다");
//		System.out.println(user.information());
		StaticTest.method1();
		System.out.println();
		System.out.println("total : "+StaticTest.method2());
		System.out.println();
		StaticTest.method3(6, 3);
		System.out.println();
		StaticTest.method3(6, 0);
		System.out.println();
		System.out.println(StaticTest.method4("asdf", "asdf"));
		
		OverlodingTest ot =new OverlodingTest();
		ot.test();
		ot.test(10);
		ot.test(10,"s");
		ot.test("s",10);
		ot.test(10,50);
		
	}

}
