package com.br.chap02_string;

import java.util.Arrays;

public class StringMethodMain {
	public static void main(String[] args) {
		
		/*
		 * 
		 */
		
		String str1 = "Hello World";
		
		// 문자열.charAt()
		
		char ch = str1.charAt(3);
		System.out.println(ch);
		
		//문자열.concat(문자열) : 기존문자열에 전달된 문자열을 덧붙여서 새로운 문자열로 반환
		String str2 = str1.concat("!!!");
		System.out.println(str2);
		
		// 문자열.equals(문자열) : 두 문자열이 일치하는지 비교 결과값 반환
		// 외우기 웹 시작시 많이 쓸 명령어 equalsIgnoreCase //
		String str3 = "hello world";
		System.out.println(str1.equalsIgnoreCase(str3));
		
		//문자열.contains(문자열) : 기준이 되는 문자열에 전달된 문자열이 포함되어 있을 경우
		System.out.println(str1.contains("llo"));
		
		
		//문자열.substring(시작인덱스)			: 문자열로부터 시작인덱스에서부터 끝까지 추출해서 반환
		//문자열.substring(시작인덱스,끝인덱스)	: 문자열로부터 시작인덱스에서부터 끝인덱스 "이전"까지 추출해서 반환
		System.out.println(str1.substring(6));
		System.out.println(str1.substring(0,4));
		
		// 문자열.indexOf(탐색할문자열) : 문자열로 부터 전달된 문자열의 위치(시작인덱스) 반환
		
		System.out.println(str1.indexOf("l"));//Start
		System.out.println(str1.lastIndexOf("l"));//end
		System.out.println(str1.indexOf("a"));//값이 없는 경우 -1로반환
		
		//문자열.replace(old , new) : 문자열로부터 old 문자열찾아서 new 문자열로 치환(변경)해줘
		
		
		System.out.println(str3.replace("l", "C"));
		
		//문자열.toUpperCase() : 문자열을 다 대문자로 변경해서 반환
		//문자열.toLowerCase() : 문자열을 다 소문자로 변경해서 반환
		
		System.out.println(str1.toUpperCase());
		System.out.println(str1.toLowerCase());
		
		//문자열.trim() : 문자열의 앞 뒤 공백을 제거시킨 값 반환
		String str4 = "   JA  VA   ";
		System.out.println(str4);
		System.out.println(str4.trim());
		
		
		//char
		char[] arr = str1.toCharArray();
		System.out.println(arr[0]);
		
		// 문자열.isBlank()	: 빈문자열이든 공백문자열이드 true반환
		// 문자열.isEmp()		: 빈문자열일때만 true 반환 (공백도 존재하는 문자열로 인식)
		
		// 문자열.split() : 문자열로부터 구분자들을 통해분리시킨후 String[]에 담아 반환
		String str5 = "java,orcle,html,css,javascript";
		String strs[]=str5.split(",");
		
		System.out.println(strs.length);
		System.out.println(Arrays.toString(strs));
		
		String str6 = "곽상혁\n홍길동\n김말똥";
		String [] name = str6.split("\n");
		System.out.println(Arrays.toString(name));
		
	}
}
