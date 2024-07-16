package com.br.collection.run;


import com.br.collection.model.vo.Container;

public class GenericMain {
	public static void main(String[] args) {
		
		// Container 객체 생성시 정수값 데이터 보관
		
		Container<Integer> intContainer = new Container<Integer>();
		
		intContainer.setItem(12);
		System.out.println(intContainer);
		
		// Container 객체 생성시 String 데이터 보관
		Container<String> stringContainer = new Container<String>();
		stringContainer.setItem("아브라카타브라");
		System.out.println(stringContainer);
		
		Container<String[]> arrContainer = new Container<String[]>();
		arrContainer.setItem(new String[]{"아","에","이"});
		
		Container whatContainer = new Container();
		whatContainer.setItem("ㅎㅇ");
		whatContainer.setItem(1);
		System.out.println(whatContainer);
		
	}
}
