package com.hw1.view;

import java.util.List;
import java.util.Scanner;

import com.hw1.controller.BookController;
import com.hw1.model.vo.Book;


public class BookMenu {
	Scanner sc = new Scanner(System.in);
	BookController bc = new BookController();
	
	
	public void mainMenu() {
		while(true) {
			
		System.out.println("\n=== 메인 메뉴 ===");
		System.out.println("1. 새 도서 추가 ");
		System.out.println("2. 도서 전체 조회 ");
		System.out.println("3. 도서 검색 조회");
		System.out.println("4. 도서 삭제하기");
		System.out.println("0. 프로그램 종료하기");
		System.out.println("메뉴 번호 선택 : ");
		int select = sc.nextInt();
		sc.nextLine();
		
		switch(select) {
		case 1:insertBook(); break;
		case 2:selectList(); break;
		case 3:searchBook(); break;
		case 4:deleteBook(); break;
		case 0: System.out.println("프로그램을 종료합니다.");return;
		default : System.out.println("메뉴 번호를 다시 선택해주세요 .");
		}
		
		}
		
	}
	public void insertBook() {
		System.out.println("\n=== 새 도서 추가 ===");
		System.out.println("제목 : ");
		String title = sc.nextLine();
		System.out.println("저자명 : ");
		String author = sc.nextLine();
		System.out.println("장르번호 (1.인문/2.자연과학/3.의료/4.기타) : ");
		int category = sc.nextInt();
		sc.nextLine();
		System.out.println("가격 : ");
		String price = sc.nextLine();
		
		bc.insertBook(title,author,category,price);
		
		System.out.println("성공적으로 추가되었습니다.");
		
		
	}
	public void selectList() {
		List<Book> list = bc.selectList();

		if(list.isEmpty()) {
			System.out.println("존재하는 도서가 없습니다");
		}else {
			for(Book b :list) {
				System.out.println(b);
			}
		}
	}
	public void searchBook() {
		while(true) {
			System.out.println("1.도서명으로 검색");
			System.out.println("2.저자명으로 검색");
			System.out.println("3.도서명+저자명으로 검색");
			System.out.println("0.뒤로가기");
			
			int num =sc.nextInt();
			sc.nextLine();
			if(num ==0) {
				break;
			}else {
				System.out.println("검색할 키워드 : ");
				String keyword = sc.nextLine();
				List<Book> list = bc.searchBook(num,keyword);
				
				if(list.isEmpty()) {
					System.out.println("값이 존재하지않습니다");
				}else {
					for(Book b : list) {
						System.out.println(b);
					}
					
				}
			}
		}
		
	}
	public void deleteBook() {
		System.out.println("삭제 도서명 : ");
		String title = sc.nextLine();
		System.out.println("삭제 저자명 : ");
		String author = sc.nextLine();
		
		int result= bc.deleteBook(title, author);
		
		if(result == 0) {
			System.out.println("해당도서는 존재하지않습니다");
		}else {
			System.out.println("삭제완료되었습니다.");
		}
		
		
		
		
		
		
		
	}
	
}
