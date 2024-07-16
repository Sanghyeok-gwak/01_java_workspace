package com.hw2.view;

import java.util.List;
import java.util.Scanner;

import com.hw2.controller.LibrayManager;
import com.hw2.model.vo.Book;
import com.hw2.model.vo.Member;

public class LibrayMenu {
	
	private LibrayManager lm = new LibrayManager();
	private Scanner scan = new Scanner(System.in);
	
	public void myPage() {
		Member me = lm.getMem();
		System.out.println(me.toString());
		
		System.out.println("수정하시겠습니까 ? (y/n)");
		char ch = scan.next().charAt(0);
		
		if(ch == 'y' || ch == 'Y') {
			scan.nextLine();
			System.out.println("수정 할 이름 : ");
			String name = scan.nextLine();
			System.out.println("수정 할 나이 : ");
			int age = scan.nextInt();
			scan.nextLine();
			System.out.println("수정 할 성별 : ");
			char gender = scan.nextLine().charAt(0);
			
			lm.updateMember(name, age, gender);
			System.out.println("성공적으로 수정되었습니다.");
		}
	}
	public void mainMenu() {
		System.out.println("\n=== 초기 회원 가입 ===");
		System.out.println("이름 : ");
		String name =scan.nextLine();
		System.out.println("나이 : ");
		int age =scan.nextInt();
		scan.nextLine();
		System.out.println("성별");
		char gender= scan.nextLine().charAt(0);
		
		lm.insertMember(name, age, gender);
		
		while(true){
			System.out.println("\n=== 메뉴 ===");
			System.out.println("1. 마이페이지");
			System.out.println("2. 도서 전체 조회");
			System.out.println("3. 도서 검색");
			System.out.println("4. 도서 대여하기");
			System.out.println("0. 프로그램 종료하기");
			System.out.println("메뉴 선택 : ");
			int num =scan.nextInt();
			scan.nextLine();
			
			switch(num) {
			case 1: myPage();break;
			case 2: selectAll();break;
			case 3: searchBook();break;
			case 4: rentBook();break;
			case 0: System.out.println("프로그램을 종료합니다.");return;
			default : System.out.println("값을 다시 입력 하세요.");
			}
			
		}
	}
	
	public void selectAll() {
		List<Book> bList=lm.selectAll();
		
		
		for(int i =0; i<bList.size(); i++) {
			System.out.println(i+"번도서 : "+bList.get(i).toString());
		}
		
	}
	public void searchBook() {
		System.out.println("검색 제목명 : ");
		String title = scan.nextLine();
		List<Book> list = lm.searchBook(title);
		
		
		if(list.isEmpty()) {
			System.out.println("검색한 제목은 존재하지 않습니다.");
		}else {
			for(Book b : list) {
				System.out.println(b);
			}
		}
		
	}
	public void rentBook() {
		System.out.println("\n=== 전체 도서 ===");
		selectAll();
		
		System.out.println("대여할 도서 번호 선택 : ");
		int index= scan.nextInt();
		
		int result =lm.rentBook(index);
		
		
		if(result ==1) {
			System.out.println("나이제한으로 불가");
		}
		else if(result ==2) {
			System.out.println("성공적으로 대여 완료 쿠폰이발급되었습니다.");
		}
		
		
	}
	
	
	
	
}
