package com.hw2.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw2.model.vo.AniBook;
import com.hw2.model.vo.Book;
import com.hw2.model.vo.CookBook;
import com.hw2.model.vo.Member;

public class LibrayManager {
	private Member mem = null;
	private List<Book> bookList= new ArrayList<>();{
		bookList.add(new CookBook("백종원의 집밥","백종원","tvN",true));
		bookList.add(new AniBook("한번 더해요","미티","원모어",19));
		bookList.add(new AniBook("루피의 원피스","루피","japan",12));
		bookList.add(new CookBook("이혜정의 얼마나 맛있게요","이혜정","문학",false));
		bookList.add(new CookBook("최현석 날 따라해봐","최현석","소금책",true));
	
	}
	
	
	
	
	public void insertMember(String name , int age,char gender) {
		mem = new Member(name,age,gender,0);
	}
	public Member getMem() {
		return mem;
	}
	public void updateMember(String name , int age , char gender) {
		mem.setName(name);
		mem.setAge(age);
		mem.setGender(gender);
		
	}
	public List<Book> selectAll() {
		
		return bookList;
	}
	public List<Book> searchBook(String keyword){
		List <Book> b = new ArrayList<>();
		for(int i =0; i<bookList.size(); i++) {
			if(bookList.get(i).getTitle().contains(keyword)) {
				b.add(bookList.get(i));
			}
		}
		
		
		
		
		return b;
	}
	public int rentBook(int index) {
		int result = 0;
		
		
		for(int i =0; i<bookList.size(); i++) {
			if(i == index) {
				
				if(bookList.get(i) instanceof CookBook) {
					if(((CookBook)bookList.get(i)).getCoupon() == true) {
						result=2;
						mem.setCouponCount(mem.getCouponCount()+1);
					}
				}else {
					if(((AniBook)bookList.get(i)).getAccessAge()> mem.getAge()) {
						result=1;
					}
					
				}
			}
			
		}
		
		
//			if(((AniBook)bookList.get(index)).getAccessAge()> mem.getAge()) {
//				result=1;
//				
//			}
//			else if(((CookBook)bookList.get(index)).getCoupon()==true) {
//				result=2;
//				mem.setCouponCount(+1);
//			}
		
		return result;
	}
	
	
}
