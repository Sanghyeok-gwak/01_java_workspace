package com.hw1.controller;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Calendar;
import java.util.StringTokenizer;

public class test {
	public static void main(String[] args) {
		//2024-07-10T17:22:11.340286600
	
		String ldt = LocalDateTime.now().toString();
//		System.out.println(ldt);\
		
		System.out.println(ldt.replace("T", " ").substring(0,ldt.indexOf(".")));
		System.out.println(ldt.substring(0,ldt.indexOf(".")));
		System.out.println(ldt.indexOf("."));
	}
}
