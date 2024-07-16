package com.hw2.controller;

import java.time.LocalDateTime;
import java.util.Calendar;
import java.util.StringTokenizer;

import com.hw2.common.DateCalculator;
import com.hw2.common.MathCalculator;
import com.hw2.common.StringCalculator;
import com.hw2.model.vo.FoodShop;

public class Calculator implements DateCalculator,StringCalculator,MathCalculator{
	// 해당 클래스안에 정의해야되는 메소드들은 현재
	// StringCalculator, MathCalculator, DateCalculator 인터페이스에 추상메소드로 정의되어있다. 
	// 세 인터페이스를 구현하는 클래스로 완성하시오. 즉, implements 하여 해당 각 메소드를 완성하시오.

	@Override
	public int sumString(String num1, String num2) {
		
		
		double result = Double.parseDouble(num1)+Double.parseDouble(num2);
	
		
		return (int)Math.round(result);
	}

	@Override
	public int minusString(String num1, String num2) {
		
		double d = Double.parseDouble(num1)-Double.parseDouble(num2);
		
		int result =0;
		if (d>0) {
			result = (int)d;
		}else {
			result = -1;
		}
		return result;
	}

	@Override
	public int findCharCount(String str, char ch) {
		char arr []= str.toCharArray();
		int count = 0;
		for(int i =0; i<arr.length; i++) {
			if(arr[i]== Character.toLowerCase(ch)||arr[i]==Character.toUpperCase(ch)) {
				count ++;
			}
		}
		
		
		return count;
	}

	@Override
	public int selectTokenCount(String str) {
		
		StringTokenizer stn = new StringTokenizer(str," "); 
		
		return stn.countTokens();
	}

	@Override
	public String toSpaceUppder(String str) {
		
		String arr[] =str.split(" ");
		StringBuilder s = new StringBuilder();
			
		for(int i =0; i<arr.length; i++) {
			s.append(String.valueOf(arr[i].charAt(0)).toUpperCase()+arr[i].substring(1)+" ");
		}
		
		
		
		
		
		return s.toString();
	}

	@Override
	public FoodShop[] csvFormat() {
		
		String csvStr =  "1,맘스쿡,광주광역시 동구 동계천로143,062-233-1233,향토맛집,2022-01-11\n"
						+ "2,옛날밥상,광주광역시 남구 용대로119번길 6,062-653-7337,향토맛집,2022-01-11\n"
						+ "3,송정떡갈비,광주광역시 광산구 광산로29번길 1,062-944-1439,향토맛집,2022-01-11\n"
						+ "4,홍춘이,광주광역시 북구 무등로180번길 9-18,062-521-7733,향토맛집,2022-01-11\n"
						+ "5,종가집떡갈비,광주광역시 광산구 상무대로 226,062-943-8282,향토맛집,2022-01-11\n"
						+ "6,광신보리밥,광주광역시 북구 두리봉길 2-1(두암동),062-264-1811,향토맛집,2022-01-11\n"
						+ "7,조선옥,광주광역시 남구 효덕로 103,062-654-3322,한상맛집,2022-01-11\n"
						+ "8,송원회관,광주광역시 북구 경양로135번길 29(신안동),062-529-3250,한상맛집,2022-01-11\n"
						+ "9,만선당어부의밥상,광주광역시 광산구 수완로11번길 3,062-955-5595,한상맛집,2022-01-11\n"
						+ "10,백년미가(유촌점),광주광역시 서구 유덕로28번길 18,062-946-3392,한상맛집,2022-01-11";
		
		String s[] =csvStr.split("\n");
		FoodShop arr[]=new FoodShop [s.length];
		for(int i =0; i<s.length; i++) {
			String temp[]=s[i].split(",");
			arr[i]= new FoodShop(Integer.parseInt(temp[0]),temp[1],temp[2],temp[3],temp[4],temp[5]);
		}
		
		
		return arr;
	}

	@Override
	public void printNowDateTime() {
		
		String date = LocalDateTime.now().toString();
		System.out.println(date.replace("T"," ").substring(date.indexOf(".")));
		
		
	}

	@Override
	public Calendar makeCalendar(String year, String month, String date) {
		Calendar cd = Calendar.getInstance();
		cd.set(Integer.parseInt(year),Integer.parseInt(month),Integer.parseInt(date));
		
		
		return cd ;
		
	}

	@Override
	public void printFormat(Calendar calc) {
	}

	@Override
	public boolean isLeapYear(int year) {
		return false;
	}

	@Override
	public long leapDate(int startYear, int endYear) {
		return 0;
	}

	
	
	
}
