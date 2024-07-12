package com.sh.view;

import java.util.Scanner;

import com.sh.controller.CafeManager;

public class CofeMenu {
	Scanner scan = new Scanner(System.in);
	CafeManager cm = new CafeManager();
	
	
	
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("아이디 : ");
			String userId=scan.nextLine();
			System.out.println("비밀번호 :");
			String userPwd=scan.nextLine();
			
			cm.checkid(userId, userPwd);
			
			
		}
	}
	public void myBasket() {
		
	}
	public void selectAll() {
		
	}
	public void searchCafe() {
		
	}
	public void oredrCafe() {
		
	}
	
	
	
}
