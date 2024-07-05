package com.br.objectArray.controller;

import java.util.Scanner;

import com.br.objectArray.model.vo.Phone;

	//요청처리만을 담당하는 클래스
public class PhoneController {
	/**
	 * 판매중인 핸드폰 목록(배열)을 전달받아
	 * 전체 출력시켜주는 기능의 메소드
	 * 
	 * @param p 판매중인 핸드폰목록의 배열객체
	 */
	
	public void selectAllPhone(Phone[] p) {
//		for(int i =0; i<p.length; i++) {
//			System.out.println(p[i].information());
//		}
		for(Phone pon: p) {
			System.out.println(pon.information());
		}
	}
	
	/**
	 * 판매중인 핸드폰목록(배열)을 전달받아
	 * 해당 핸드폰들의 평균 가격을 구해 반환해주는 기능 메소드
	 *  
	 * 
	 * @param p 판매중인 핸드폰 목록의 배열객체
	 * @return 핸드폰들의 평균 가격
	 */
	public double selectPhoneAvgPrice(Phone[] p) {
		int total =0;
//		for(int i=0; i<p.length; i++) {
//			total += p[i].getPrice();
//		}
		for(Phone pon: p) {
			total+=pon.getPrice();
		}
		return (double)total / p.length;
	}
	
	/**
	 * 판매중인 핸드폰목록과
	 * 검색하고자하는 핸드폰정보를 전달받아
	 * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
	 * 
	 * @param p 판매중인 핸드폰 목록의 배열객체
	 * @param buy 검색하고자 하는 핸드폰의 정보
	 * @return 검색된 핸드폰의 가격
	 */
	public int searchPhonePrice(Phone[] p,String buy) {
		Scanner scan = new Scanner(System.in);
//		질문
//		int price1=0;
//		for(int i =0; i<p.length; i++) {
//			if((p[i].getPhoneName()+p[i].getS()).equals(buy)) {
//				return p[i].getPrice();
//			}
//		}
		for(Phone pon : p) {
			if((pon.getPhoneName()+pon.getS()).equals(buy)) {
				return pon.getPrice();
			}
			
		}
		return 0;
	}
	/**
	 * 판매중인 핸드폰목록과
	 * 검색하고자하는 핸드폰정보(키워드)를 전달받아
	 * 검색된 핸드폰의 가격을 반환해주는 기능의 메소드
	 * 단 키워드 검색으로 구현
	 * (즉 포함 하고있는지 비교 하기 )
	 * 
	 * @param p 판매중인 핸드폰 목록의 배열객체
	 * @param buy 검색하고자 하는 핸드폰의 정보
	 * @return 검색된 가격값들이 담겨있는 int[]객체
	 */
	public int[] searchKeywordPhonePrice(Phone[] p ,String buy) {
		Scanner scan = new Scanner(System.in);
		
		int [] prices =new int [p.length];
		
		for(int i =0; i<p.length; i++) {
			if((p[i].getPhoneName()+p[i].getPhoneName()).contains(buy)) {
				prices[i]= p[i].getPrice();
			}
		}
//		for(Phone pon : p) {
//			if((pon.getPhoneName()+pon.getS()).contains(buy)) {
//				prices[i] = pon.getPrice();
//			}
//			
//		}
		return prices;
	}
	
}
