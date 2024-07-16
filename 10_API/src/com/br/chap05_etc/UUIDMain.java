package com.br.chap05_etc;

import java.util.UUID;

public class UUIDMain {
	public static void main(String[] args) {
		
		/*
		 * < java.util.UUID >
		 * 
		 * 1. Universal Unique IDentifier
		 * 2. 전역 고유 식별자(한 프로그램 내에서 절재적으로 고유한 값) 
		 * 3. 형식
		 * 	  1)- 16진수 32개와 하이픈(-) 4개로 구성
		 * 	  2)- 8자리 - 4자리 - 4자리 - 4자리 - 12자리
		 * 	  
		 * 
		 * 
		 * 	  ex) 사용자가 업로드한 첨부파일 한모양 수정사냐
		 * 
		 */
		
		UUID uuid = UUID.randomUUID();
//		System.out.println(uuid);
		String result = uuid.toString();
//		System.out.println(uuid);
		
		
		String originFilename1="te.st.txt";
		String originFilename2="te.st.txt";
		
		String originFileExt1 = originFilename1.substring(originFilename1.lastIndexOf("."));
//		System.out.println(originFileExt1);
		String originFileExt2 = originFilename2.substring(originFilename2.lastIndexOf("."));
		
		
		String changeFilename1 = UUID.randomUUID().toString().replace("-", "")+originFileExt1;
		String changeFilename2 = UUID.randomUUID().toString().replace("-", "")+originFileExt2;
		
		
		System.out.println(changeFilename1);
		System.out.println(changeFilename2);
		
	}
}
