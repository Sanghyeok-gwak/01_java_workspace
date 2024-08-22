package com.sh.atm.view;

import java.util.List;
import java.util.Scanner;

import com.sh.atm.controller.AtmManager;
import com.sh.atm.model.vo.Receipt;
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
	public void userMenu() {
	int first= am.firstCheck();
	
	if(first == 1) {
		
	while(true) {
		//2,3,4,5번 메뉴는 로그인 하지않으면 접근 불가
		//1 로그인 한사람은 접근 불가 
		System.out.println("\n===ATM===");
		if(id !=null) {
			System.out.println(id+"님 환영합니다.");
		}
		System.out.println("0.로그인");
		System.out.println("1.회원가입");
		System.out.println("2.회원수정");
		System.out.println("3.회원탈퇴");
		System.out.println("4.로그아웃");
		System.out.println("5.ATM");
		System.out.println("6.프로그램 종료");
		System.out.println("입력 : ");
		int sel1 = scan.nextInt();
		scan.nextLine();
		
		switch (sel1) {
		case 0: login();break;
		case 1: creatUser();break;
		case 2: updateUser();break;
		case 3: removeUser();break;
		case 4: if(id ==null) {
					System.out.println("로그인 후 사용가능합니다.");break;
				}else {
					
					log=-1;id=null; System.out.println("로그아웃 되었습니다.");break;
				}
		case 5: atmMenu();break;
		case 6: System.out.println("프로그램을 종료합니다");return;
		}
		
		
	}
	}
	else {
		System.out.println("AtmManager firstcheck를 먼저 만드신후 실행 가능합니다.");
	}
	
	}
	public void atmMenu() {
		if(id == null) {
			System.out.println("로그인 후 사용 가능합니다");
		}else {
			while(true) {
				System.out.println(id+"님 환영합니다.");
				System.out.println("==========ATM============");
				System.out.println("1. 입금");
				System.out.println("2. 송금");
				System.out.println("3. 통장 정리");
				//System.out.println("4. 통장 내역 출력");
				System.out.println("0. 프로그램 종료");
				System.out.println("입력 : ");
				int sel2 = scan.nextInt();
				scan.nextLine();
				
				switch(sel2) {
				case 1: deposit();break;
				case 2: toTransfer();break;
				case 3: bankAccount();break;
				//case 4: bankAccountPrint();break; 
				case 0: System.out.println("프로그램을 종료합니다.");return;
				}
				
			}
		}
	}

	public void login() {
		// 로그인 되어있을시 실행 불가 작성 
		// log == 1 일 경우 : 상단 id = userId 
		// log == 2 일 경우 : 비밀번호를 확인해주세요
		// log == 3 일 경우 : 아이디를 확인해주세요
		if(id == null) {
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
		}else {
			System.out.println("로그아웃 후 사용 가능합니다.");
		}
		
	}
	public void creatUser() {
		int result =0;
		boolean checkId = true;
		boolean checkAct = true;
		// 계좌번호 추가
		// 회원가입시 입력한money + 5000 
		// 아이디가 중복 인지 확인
		// 최대 금액 50000이하
		// 비밀번호 입력 하나 더만들어 입력한 비밀번호 두개 모두 일치 시 가입 
		// checkId = true : 비밀번호 입력 
		// checkId = false : 아이디가 중복됩니다 출력
		// result = 1 : 회원가입 성공 출력
		// result = 2 : 비밀번호 불일치 출력
		// result = 3 : 초기금액은 50000이하입니다. 출력
		
		if(id == null) {
		
		System.out.println("\n====회원가입====");
		System.out.println("회원 가입할 아이디 : ");
		String userId = scan.nextLine();
		checkId = am.checkId(userId);
		
		if(checkId ==false ) {
			System.out.println("아이디가 중복됩니다.");
		}else {
			System.out.println("회원 가입할 계좌 (4자리 숫자 입력): ");
			int act = scan.nextInt();
			checkAct=am.checkAct(act);
			scan.nextLine();
			
			if(checkAct == false) {
				System.out.println("계좌번호가 중복됩니다.");				
			}
			else {
				
				System.out.println("회원 가입할 비밀번호 : ");
				String userPwd = scan.nextLine();
				System.out.println("비밀번호 확인 : ");
				String userPwdCk=scan.nextLine();
				System.out.println("금액 : ");
				int money = scan.nextInt();
				result = am.creatUser(userId,userPwd, userPwdCk, money,act);
				
				System.out.println(result);
				
				if(result ==1) {
					System.out.println("회원가입 성공");
				}
				else if (result ==2) {
					System.out.println("비밀번호가 일치하지않습니다.");
				}
				else if (result ==3) {
					System.out.println("초기금액은 50000이하입니다.");
				}
			}
		}
		}
		else {
			System.out.println("로그아웃 후 회원가입 할 수 있습니다.");
		}
		
	}
	public void updateUser() {
		//로그인 하지않으면 실행 불가
		//로그인 후 실행 가능
		if(id == null) {
			System.out.println("로그인 후 사용 가능합니다");
		}else {
			System.out.println(id +"님 반갑습니다. 가입하신 비밀번호를 입력해주세요.");
			System.out.println("비밀번호 : ");
			String userPwd =scan.nextLine();
			
			int index = am.passwordCheck(id,userPwd);
			
			
			if(index != -1) {
				String userId=null;
				// result = 1 : 아이디가 변경되었습니다.
				// result = 2 : 비밀번호가 변경되었습니다.
				// result = 3 : 비밀번호가 일치하지 않습니다.
				System.out.println("본인인증이 확인되었습니다 .");
				System.out.println("1. 아이디 ");
				System.out.println("2. 비밀번호 ");
	
				int sel =scan.nextInt();
				
				int result = 0;
				scan.nextLine();
				
				if(sel == 1) {
					System.out.println("아이디 입력 : ");
					userId = scan.nextLine();
					result = am.updateUser(index, sel, userId, null, null);
				}
				else if(sel == 2) {
					System.out.println("비밀번호 : ");
					String userChPwd = scan.nextLine();
					System.out.println("비밀번호 : ");
					String userCoPwd = scan.nextLine();
					result = am.updateUser(index, sel, null, userChPwd, userCoPwd);
				}
				
				
				if(result== 1) {
					// id = 값을 입력 받은 userId로 변경 
					System.out.println("아이디가 변경되었습니다.");
					id = userId;
				}
				else if(result ==2) {
					System.out.println("비밀번호가 변경되었습니다.");
				}
				else if(result ==3) {
					System.out.println("비밀번호가 일치하지 않습니다.");
				}
				
				
			}else {
				System.out.println("비밀번호를 확인해주세요 .");
			}
			
		}
	}
	public void removeUser() {
		if(id == null) {
			System.out.println("로그인 후 사용 가능합니다");
		}else {
			System.out.println(id +"님 반갑습니다. 가입하신 비밀번호를 입력해주세요.");
			System.out.println("비밀번호 : ");
			String userPwd =scan.nextLine();
			
			int index = am.passwordCheck(id,userPwd);
			
			
			if(index != -1) {
				boolean check=false;
				// userid 를 삭제하시겠습니까 ? 출력
				System.out.println(id +"를 삭제하시겠습니까 ? " );
				System.out.println("1. 삭제 " );
				System.out.println("2. 뒤로가기 ");
				int num = scan.nextInt();
				int result = -1;
				if(num == 1) {
					check =true;
					result=am.removeUser(index, check);
				}
				else if (num == 2) {
					System.out.println("뒤로 이동합니다.");
				}
				
				if(result ==1) {
					System.out.println("계정이 삭제되어 로그아웃 처리됩니다.");
					log=-1;
					id=null;
				}
				
				
				
			}
			else {
				System.out.println("비밀번호를 확인해주세요 .");
			}
			
		}
	}
	
	
	
//	=======================ATM============================
	public void deposit() {
		// 전달 받은 리스트를 활용해서 아래와 같이 출력문 작성
		// xx계정 XX 계좌에서 YY원이 입금이 완료되었습니다 
		System.out.println("\n=== 입금 ===");
		System.out.println("비밀번호 : ");
		String userPwd = scan.nextLine();
		
		int index = am.passwordCheck(id, userPwd);
		if(index == -1) {
			System.out.println("비밀번호를 확인 후 이용해주세요.");
		}
		else {
			System.out.println("입금 할 금액 : ");
			int money = scan.nextInt();
			List<Receipt> list=am.depositCode(index, money);
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i).getUserId()
									+"계정 "+list.get(i).getAccount()+"계좌에서 "+money+"원이 입금이 완료되었습니다");
			}
			
		
		
		}
		
		
	}
	public void toTransfer() {
		// XX 계좌에서 YY계좌로 MM원이 송금이  완료되었습니다.
		System.out.println("\n=== 송금 ===");
		System.out.println("비밀번호 : ");
		String userPwd = scan.nextLine();
		
		int index = am.passwordCheck(id, userPwd);
		if(index == -1) {
			System.out.println("비밀번호를 확인 후 이용해주세요.");
		}
		else {
			System.out.println("계좌 번호를 입력 해주세요");
			System.out.println("계좌 : ");
			int act= scan.nextInt();
			// checkAct 를 활용하여 해당계좌 확인 후 시작하세요 
			boolean result = am.checkAct(act);
			scan.nextLine();
			if(result == true ) {
				System.out.println("입력 하신 계좌는 존재하지 않습니다.");
			}
			else {
				System.out.println("송금 금액 : ");
				String money = scan.nextLine();
				int result1= am.moneyCheckde(id,money);
				if(result1 != 1) {
					System.out.println(id+"님의 잔여 금액이 부족합니다.");
				}else {
					List<User> list =am.toTransferAccount(act,money);
					
					for(int i=0; i<list.size(); i++) {
						System.out.println(id+"계좌에서 "
								+ act +"계좌로 "+money+"원이 송금이 완료되었습니다.");
					}
					
				}
				
				
			}
		}
	}
	public void bankAccount() {
		List<Receipt> list = am.bankAccountSearch();
		
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		
	}
	
	/*
	public void bankAccountPrint() {
		
	}
	*/
	
}
