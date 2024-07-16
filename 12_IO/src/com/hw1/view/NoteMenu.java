package com.hw1.view;

import java.util.Scanner;

import com.hw1.model.dao.FileDao;

public class NoteMenu {
	Scanner scan = new Scanner(System.in);
	FileDao fdao =new FileDao();
	
	
	public void mainMenu() {
		while(true) {
			System.out.println("===== MyNote =====");
			System.out.println("1. 노트 새로 만들기");
			System.out.println("2. 노트 열기");
			System.out.println("3. 노트 열어서 수정하기");
			System.out.println("4. 끝내기");
			
			System.out.print("번호를 입력하세요 : ");
			int selnum=scan.nextInt();
			scan.nextLine();
			switch(selnum){
			case 1 :createNote();break;
			case 2 :openNote();break;
			case 3 :editNote();break;
			case 4 :System.out.println("프로그램을 종료합니다");return;
			default : System.out.println("다시입력해주세요.");break;
			}
		}
	}
	public void createNote() {
		StringBuilder sb = new StringBuilder();
		String content = "";
		String fileName = "";
		while (true) {
			System.out.println("파일 저장할 내용을 입력하시오");
			String str = scan.nextLine();
			if(str.equals("exit")) 
			{
				System.out.println("저장하시겠습니까?(y/n)");
				char ch = scan.nextLine().charAt(0);
				if((ch == 'y' || ch =='Y') ) {
					System.out.println("파일명 (확장자 제외) 입력 : ");
					String fn = scan.nextLine();
					fileName=fn;
					System.out.println(fileName+".txt 파일에 성공적으로 저장하셨습니다.");
					break;
				}else {
					System.out.println("다시메뉴로 돌아갑니다.");
					return;
				}
			}
			else {
				sb.append(str);
			}
		}
		content=sb.toString();
		
		fdao.fileSave(content, fileName);
	}
	public void openNote() {
		System.out.println("열기 할 파일명 : ");
		String fileName= scan.nextLine();
		
		System.out.println(fdao.fileOpen(fileName));
		
	}
	public void editNote() {
		System.out.println("수정 할 파일명 : ");
		String fileName=scan.nextLine();
		
		fdao.fileOpen(fileName);
		StringBuilder sb = new StringBuilder();
		String content = "";
		String filName = "";
		while (true) {
			System.out.println("파일 저장할 내용을 입력하시오");
			String str = scan.nextLine();
			if(str.equals("exit")) 
			{
				System.out.println("저장하시겠습니까?(y/n)");
				char ch = scan.nextLine().charAt(0);
				if((ch == 'y' || ch =='Y') ) {
					System.out.println("파일명 (확장자 제외) 입력 : ");
					String fn = scan.nextLine();
					filName=fn;
					System.out.println(filName+".txt 파일에 성공적으로 저장하셨습니다.");
					break;
				}else {
					System.out.println("다시메뉴로 돌아갑니다.");
					return;
				}
			}
			else {
				sb.append(str);
			}
		}
		content=sb.toString();
		
		fdao.fileSave(content, fileName);
		
	}
}
