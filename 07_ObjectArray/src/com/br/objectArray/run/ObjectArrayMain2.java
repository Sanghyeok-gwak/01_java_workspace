package com.br.objectArray.run;

import java.util.Arrays;

import com.br.objectArray.model.vo.Book;

public class ObjectArrayMain2 {
	public static void main(String[] args) {
		
		int [] arr = new int [3];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		
		
		Book[] books = new Book[3];
		books[0] = new Book();
		books[1] = new Book("C언어","강개똥",1000,"구디");
		books[2] = new Book("파이썬","김개똥",2000,"나무");
	
		
		books[0].setTitle("자바");
		books[0].setAuthor("홍길동");
		books[0].setPrice(500);
		books[0].setPublisher("문학");
		int total=0;
//		for(int i =0; i<books.length; i++) {
//			total +=books[i].getPrice();
//			System.out.println(books[i].information());
//		}
		for(Book bk : books) {
			total+= bk.getPrice();
		}
		System.out.println(total);
	}
}	
