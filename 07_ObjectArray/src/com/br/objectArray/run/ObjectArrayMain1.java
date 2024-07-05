package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Book;

public class ObjectArrayMain1 {
	//다수의 객체들을 하나의 배열로 관리해보기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] arr= new int [3];
		Book[] books = new Book[3];
		
		for(int i =0; i<books.length; i++) {
			System.out.println((i+1)+"번째");
			System.out.print("도서명 : ");
			String title = scan.nextLine();
			System.out.print("도서저자 : ");
			String author = scan.nextLine();
			System.out.print("가격 : ");
			int price = scan.nextInt();
			
			scan.nextLine();
			System.out.print("출판사 : ");
			String publisher =scan.nextLine();
			books[i] = new Book (title,author,price,publisher);
			
		}
//			System.out.println(books[0].information());
//			System.out.println(books[1].information());
//			System.out.println(books[2].information());
	
		
//		for(int i =0; i<books.length; i++){
//			System.out.println(books[i].information());
//		}
		for(Book bk : books) {
			System.out.println(bk.information());
		}
		
		
		
		
		System.out.print("검색 : ");
		String str = scan.nextLine();
//		for(int i =0; i<books.length; i++) {
//			if(str.equals(books[i].getTitle())) {
//				System.out.println(books[i].information());
//			}
//		}
//		
		for(Book bk : books) {
			if(bk.getTitle().equals(str)) {
				System.out.println(bk.information());
			}
		}
		
		
		
	}
}
