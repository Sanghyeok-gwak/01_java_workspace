package com.sh.view;

import java.util.List;
import java.util.Scanner;

import com.sh.controller.CoffeeManager;
import com.sh.model.vo.Bread;
import com.sh.model.vo.Coffee;
import com.sh.model.vo.CoffeeShop;

public class CoffeeMenu {
	Scanner scan = new Scanner(System.in);
	CoffeeManager cm= new CoffeeManager();
	
	
	
	
	public void mainMenu() {
		while(true) {
			
			System.out.println("\n=== 로그인 ===");
			System.out.println("아이디 : ");
			String userId =scan.nextLine();
			System.out.println("비밀번호 : ");
			String userpwd = scan.nextLine();
			int log =cm.checkingAdmin(userId, userpwd);
		
		
		if(log == 1) {
			while(true) {
			System.out.println("\n=== 관리자 메뉴 ===");
			System.out.println("0. 가게 전체 조회");
			System.out.println("1. 가게 관리 ");
			System.out.println("2. 커피 메뉴 관리");
			System.out.println("3. 빵 메뉴 관리");
			System.out.println("4. 프로그램종료");
			System.out.println("입력 : ");
			int num = scan.nextInt();
			switch(num) {
			case 0: selectAll();break; 
			case 1: storeManagement();break; 
			case 2: managingCoffeeMenu(); break;
			case 3: breadMenuManagement(); break;
			case 4: System.out.println("프로그램 종료");return;
			default : System.out.println("값을 다시 입력해주세요.");
			}
			
			}
		}else if(log == -1){
			System.out.println("관리자 로그인 실패하여 유저 화면으로 이동합니다.");
			System.out.println();
			
			System.out.println("이름 : ");
			String userName = scan.nextLine();
			System.out.println("잔액을 입력하세요 : ");
			int money = scan.nextInt();
			cm.checkingUser(userName,money);
			while(true) {
			
			System.out.println("\n"+userName+"님 환영합니다.");
			System.out.println("=== 메뉴 ===");
			System.out.println("1. 전체 메뉴 조회");
			System.out.println("2. 메뉴 검색 ");
			System.out.println("3. 장바구니 ");
			System.out.println("4. 주문 하기 ");
			System.out.println("0. 프로그램종료 ");
			System.out.println("입력 : ");
			int num = scan.nextInt();
			switch(num) {
			case 1: selectAll();break; 
			case 2: searchCafe();break;
			case 3: myBasket();break;
			case 4: oredrCafe();break;
			case 0: System.out.println("프로그램 종료");return;
			default : System.out.println("값을 다시 입력해주세요.");
			}
			
			}
		}
		
		}
	}

	public void storeManagement() {
		System.out.println("\n=== 가게 관리 ===");
        System.out.println("1. 가게명 변경 ");
		System.out.println("2. 가게주소 변경 ");
		
		System.out.println("입력 : ");
		int num =scan.nextInt();
		scan.nextLine();
		if(num == 1) {
			System.out.println("변경할 가게명을 입력해주세요 : ");
			String chName=scan.nextLine();
			CoffeeShop cs = cm.management(num, chName);
			System.out.println("가게명이 변경되었습니다.");
		}
		else {
			System.out.println("변경할 가게주소를 입력해주세요 : ");
			String chName=scan.nextLine();
			CoffeeShop cs = cm.management(num, chName);
			System.out.println("가게 주소가 변경되었습니다.");
		}
	}
	public void managingCoffeeMenu() {
		while(true) {
		System.out.println("== 커피 수정 ==");
		System.out.println("--------------------------");
		System.out.println("== 커피 메뉴 ==");
		List<Coffee> coffeelist = cm.coffeeInquiry();
		for(int i =0; i< coffeelist.size();i++) {
			System.out.println("["+i+"]"+coffeelist.get(i));
		}
		System.out.println("1. 커피 메뉴 삭제 ");
		System.out.println("2. 커피 메뉴 추가 ");
		System.out.println("3. 뒤로가기");
		int num = scan.nextInt();
		
		
		if(num == 1) {
			System.out.println("삭제할 번호를 선택하세요");
			cm.deleteCoffee(scan.nextInt());
			
			System.out.println("삭제완료.");
		}
		else if(num ==2) {
			scan.nextLine();
			System.out.println("추가 할 커피 명 : ");
			String cName = scan.nextLine();
			System.out.println("추가 할 커피 가격 : ");
			int price = scan.nextInt();
			System.out.println("커피 판매 수량 : ");
			int count = scan.nextInt();
			cm.insertCoffee(cName, price,count);
			
			System.out.println("추가완료");
		}
		else if(num==3) {
			return;
		}
		
		}
		
		
	}
	public void breadMenuManagement() {
		while(true) {
		System.out.println("== 빵 수정 ==");
		System.out.println("--------------------------");
		System.out.println("== 커피 메뉴 ==");
		List<Bread> breadlist = cm.breadInquiry();
		for(int i =0; i< breadlist.size();i++) {
			System.out.println("["+i+"]"+breadlist.get(i));
		}
		System.out.println("1. 빵 메뉴 삭제 ");
		System.out.println("2. 빵 메뉴 추가 ");
		System.out.println("3. 뒤로가기");
		int num = scan.nextInt();
		
		
		if(num == 1) {
			System.out.println("삭제할 번호를 선택하세요");
			cm.deleteCoffee(scan.nextInt());
			
			System.out.println("삭제완료.");
		}
		else if(num ==2) {
			scan.nextLine();
			System.out.println("추가 할 커피 명 : ");
			String cName = scan.nextLine();
			System.out.println("추가 할 커피 가격 : ");
			int price = scan.nextInt();
			System.out.println("커피 판매 수량 : ");
			int count = scan.nextInt();
			cm.insertCoffee(cName, price,count);
			
			System.out.println("추가완료");
		}
		else if(num==3) {
			return;
		}
		}
		
	}
	
	public void selectAll() {
		
		CoffeeShop cs = cm.selectAll();
		System.out.println(cs.toString());
		
		
		
	}
	public void searchCafe() {
		System.out.println("=== 검색 ===");
		System.out.println("1. 빵 검색 ");
		System.out.println("2. 커피 검색");
		int num = scan.nextInt(); 
		
		scan.nextLine();
		if(num == 1) {
			System.out.println("빵 이름 : ");
			String keyword = scan.nextLine();
			List <Object> list = cm.searchCafe(num, keyword);
			if(list.isEmpty()) {
				System.out.println("검색한 빵은 존재하지않습니다.");
			}else {
				for(int i=0;i<list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
		}
		else if(num ==2 ) {
			System.out.println("커피 이름 : ");
			String keyword = scan.nextLine();
			List <Object> list = cm.searchCafe(num, keyword);
			if(list.isEmpty()) {
				System.out.println("검색한 커피는 존재하지않습니다.");
			}else {
				for(int i=0;i<list.size(); i++) {
					System.out.println(list.get(i));
				}
			}
		}
	}
	public void myBasket() {
		List <Object> basket =cm.myBasketcheck();
		if(basket.isEmpty()) {
			System.out.println("장바구니가 비어있습니다");
		}
		else {
			for(int i =0; i<basket.size(); i++) {
				System.out.println(basket.get(i).toString());
			}
			scan.nextLine();
			
			System.out.println("주문 하시겠습니까 ?(y/n)");
			char ch =scan.nextLine().charAt(0);
			if(ch== 'y'||ch== 'Y') {
				int result =0;
				
				if(result == 1) {
					System.out.println("정상적으로 주문이 완료되었습니다.");
					return;
				}
				else {
					System.out.println("잔액이 부족합니다.");
				}
				
			}else {
				System.out.println("주문 화면으로 돌아갑니다.");
				oredrCafe();
			}
		}
	}
	public void oredrCafe() {
		List<Bread> bList = cm.breadInquiry();
		List<Coffee> cList = cm.coffeeInquiry();
		System.out.println("== 커피 ==");
		for(int i =0; i<cList.size(); i++) {
			System.out.println("["+i+"]"+cList.get(i));
		}
		System.out.println();
		System.out.println("== 빵 ==");
		for(int i =0; i<bList.size(); i++) {
			System.out.println("["+i+"]"+bList.get(i));
		}
		System.out.println("1. 커피 주문");
		System.out.println("2. 빵주문");
		System.out.println("입력 : ");
		int num =scan.nextInt(); 
		int index =0;
		
		if(num == 1) {
			System.out.println(" 번호를 입력해주세요 . ");
			index = scan.nextInt();
		}
		else if(num == 2) {
			System.out.println(" 번호를 입력해주세요 . ");
			index = scan.nextInt();
		}
		cm.oreder(num,index);
		
		
		
		
	}
	
	
	
}
