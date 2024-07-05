package com.br.objectArray.run;

import java.util.Scanner;

import com.br.objectArray.model.vo.Book;

public class ObjectMain {
	public static void main(String[] args) {
		
		//다수의 객체들을 따로따로 관리해보기
		Book bk1 = null;
		Book bk2 = null;
		Book bk3 = null;
		
		
		//bk1 기본생성자로 생성후 setter이용해서 값 대입
//		bk1 = new Book();
//		bk1.setTitle("자바의 정석");
//		bk1.setAuthor("홍길동");
//		bk1.setPrice(9999);
//		bk1.setPublisher("소나무");
//		System.out.println(bk1.information());
//		//bk2 매개변수생성자로 생성과 동시에 값 대입
//		bk2 = new Book("C 언어","김개똥",20000,"개나리");
//		System.out.println(bk2.information());
		//bk3 사용자에게 도서정보를 입력받아 매개변수 생성자로 생성
//		Scanner scan = new Scanner(System.in);
//		System.out.print("도서명 : ");
//		String title = scan.nextLine();
//		System.out.print("도서저자 : ");
//		String author = scan.nextLine();
//		System.out.print("가격 : ");
//		int price = scan.nextInt();
//		
//		scan.nextLine();
//		System.out.print("출판사 : ");
//		String publisher =scan.nextLine();
//		//첫 번째 방법
//		bk3  = new Book();
//		bk3.setTitle(title);
//		bk3.setAuthor(author);
//		bk3.setPrice(price);
//		bk3.setPublisher(publisher);
//		bk3  = new Book(title,author,price,publisher);
//		System.out.println(bk3.information());
//		
		
		Scanner scan = new Scanner(System.in);
		
		for(int i =0; i<3; i++) {// i=0 => i=1 => i=2
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
			if(i==0) {
				bk1 = new Book (title,author,price,publisher);
			
			}
			else if(i==1) {
				bk2 = new Book (title,author,price,publisher);
			}
			else {
				bk3 = new Book (title,author,price,publisher);
			}
		}
		
		// 모든 도서 정보 조회
		System.out.println(bk1.information());
		System.out.println(bk2.information());
		System.out.println(bk3.information());
		
		System.out.print("검색 : ");
		String str = scan.nextLine();
		
		
		if(bk1.getTitle().equals(str)) {
			System.out.println(bk1.information());
		}
		else if (bk2.getTitle().equals(str)) {
			System.out.println(bk2.information());
		}
		else if(bk3.getTitle().equals(str)) {
			System.out.println(bk3.information());
		}
		else {
			System.out.println("없습니다");
		}
		
		
		
	}
}
