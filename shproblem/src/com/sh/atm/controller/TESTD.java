package com.sh.atm.controller;

import java.util.Random;

public class TESTD {
	public static void main(String[] args) {
		String str[]  = {"보겸","상혁","시우","준","수민"};
		
		Random ran = new Random();
		int r = ran.nextInt(100)+1;
		System.out.println(r);
		
		for(int i =0; i<r; i++) {
			int rNum = ran.nextInt(str.length);
			String temp = str[0];
			str[0] = str[rNum];
			str[rNum] =temp;
		
			System.out.println(str[rNum]);
		}
		
		
		
	
		
	}
	
}
