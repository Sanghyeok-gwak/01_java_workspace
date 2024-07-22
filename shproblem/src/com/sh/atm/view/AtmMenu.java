package com.sh.atm.view;

import java.util.List;
import java.util.Scanner;

import com.sh.atm.controller.AtmManager;
import com.sh.atm.model.vo.User;

public class AtmMenu {
	Scanner scan= new Scanner(System.in);
	AtmManager am = new AtmManager();
	int log = -1;
	String id = null;
//	0. 로그인
//	1. 회원가입
//	2. 회원수정
//	3. 회원탈퇴
//	4. 로그아웃
//	5. 프로그램 종료
	
	
//	---------------------------------
//	1. 입금
//	2. 송금
//	3. 통장 정리
//	4. 통장 내역 출력
//	0. 프로그램 종료
	public void mianMenu() {
	int first= am.firstCheck();
	
	if(first == 1) {
		
	while(true) {
		List<User> a = am.c();
		for(int i =0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		System.out.println("\n===ATM===");
		System.out.println("0.로그인");
		System.out.println("1.회원가입");
		System.out.println("2.회원수정");
		System.out.println("3.회원탈퇴");
		System.out.println("4.로그아웃");
		System.out.println("5.프로그램 종료");
		System.out.println("입력 : ");
		int sel1 = scan.nextInt();
		scan.nextLine();
		
		switch (sel1) {
		case 0: login();break;
		case 1: creatUser();break;
		case 2: updateUser();break;
		case 3: removeUser();break;
		case 4: log=-1; System.out.println("로그아웃 되었습니다.");break;
		case 5: System.out.println("프로그램을 종료합니다");return;
		}
		if(log==1) {
			while(true) {
				System.out.println(id+"님 환영합니다.");
				System.out.println("==========ATM============");
				System.out.println("1. 입금");
				System.out.println("2. 송금");
				System.out.println("3. 통장 정리");
				System.out.println("4. 통장 내역 출력");
				System.out.println("0. 프로그램 종료");
				System.out.println("입력 : ");
				int sel2 = scan.nextInt();
				scan.nextLine();
				
				switch(sel2) {
				case 1: deposit();break;
				case 2: toTransfer();break;
				case 3: bankAccount();break;
				case 4: bankAccountPrint();break; 
				case 0: System.out.println("프로그램을 종료합니다.");return;
				}
				
			}
		}
		
	}
	}
	else {
		System.out.println("AtmManager firstcheck를 먼저 만드신후 실행 가능합니다.");
	}
	
	}
	public void login() {
		// log == 1 일 경우 : 상단 id = userId 
		// log == 2 일 경우 : 비밀번호를 확인해주세요
		// log == 3 일 경우 : 아이디를 확인해주세요
		System.out.println("\n======로그인======");
		System.out.println("아이디 : ");
		String userId=scan.nextLine();
		System.out.println("비밀번호 : ");
		String userPwd=scan.nextLine();
		
		log =am.login(userId, userPwd);
		System.out.println(log);
		if(log == 1) {
			id = userId;
			System.out.println("로그인 성공 했습니다.");
		}
		else if(log == 2) {
			System.out.println("비밀번호를 확인해주세요.");
		}
		else if(log == 3) {
			System.out.println("아이디를 확인해주세요.");
		}
		
		
	}
	public void creatUser() {
		int result =0;
		// 회원가입시 입력한money + 5000 
		// 아이디가 중복 인지 확인
		// 최대 금액 50000이하
		// 비밀번호 입력 하나 더만들어 입력한 비밀번호 두개 모두 일치 시 가입 
		// 1 : 회원가입 성공
		// 2 : 아이디 중복
		// 3 : 비밀번호 불일치
		// 4 : 50000이상일 경우
		System.out.println("\n====회원가입====");
		System.out.println("회원 가입할 아이디 : ");
		String userId = scan.nextLine();
		System.out.println("회원 가입할 비밀번호 : ");
		String userPwd = scan.nextLine();
		System.out.println("비밀번호 확인 : ");
		String userPwdCk=scan.nextLine();
		System.out.println("금액 : ");
		int money = scan.nextInt();
		
		result = am.creatUser(userId, userPwd, userPwdCk, money);
		System.out.println(result);
		
		if(result ==1) {
			System.out.println("회원가입 성공");
		}
		else if (result ==2) {
			System.out.println("아이디가 중복됩니다.");
		}
		else if (result ==3) {
			System.out.println("비밀번호가 일치하지않습니다.");
		}
		else if (result ==4) {
			System.out.println("초기금액은 50000이하입니다.");
		}
		
	}
	public void updateUser() {
		
	}
	public void removeUser() {
		
	}
	
	
	
//	=======================ATM============================
	public void deposit() {
		
	}
	public void toTransfer() {
		
	}
	public void bankAccount() {
		
	}
	public void bankAccountPrint() {
		
	}
	
}
