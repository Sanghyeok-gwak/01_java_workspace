package com.hw3.controller;

import java.util.Arrays;

public class Function {
	
	public void printLottoNumbers() {
		int arr []= new int [6];
		
		for(int i =0; i<arr.length; i++) {
			int ran = (int)(Math.random()*45+1);
			arr[i]=ran;
		}
		System.out.println(Arrays.toString(arr));
		
		
	}
	
	public void outputChar(int num,char c) {
		for(int i =1; i<=num; i++) {
			System.out.print(c+" ");
		}
	}
	
	public char alphabette() {
		System.out.println();
		char ch = (char)(Math.random()*90+65);
		System.out.println("랜덤 값 : "+(int)ch+" "+ch);
		return ch;
	}

	public String mySubstring(String str,int index1, int index2) {
		String result ="";
		//apple
		
		for(int i =index1; i<index2; i++) {
			result+=str.charAt(i);
		}

		
		return str+index1+index2+result ;
		
	}
	
	
}
