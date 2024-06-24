package com.br.chap01.practice.example;

import java.util.Scanner;

public class ConditionPractice {
	public void practice1() {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("9. 종료");
		
		
		System.out.print("번호를 입력해주세요 : ");
		int num1= scan.nextInt();
		String result = " ";
		
		
		if (num1==1) {
			result="입력";
		}
		else if (num1==2) {
			result="수정";
		}
		else if (num1==3) {
			result="조회";
		}
		else if (num1==4) {
			result="삭제";
		}
		else if (num1==9) {
			result="종료";
		}
		System.out.println(result+"메뉴입니다");
	}
	
	public void practice2() {
		Scanner scan= new Scanner(System.in);
		
		int num= scan.nextInt();
		
		if (num>0) {
			if (num%2==0) {
				System.out.println("짝수");
			}
			else {
				System.out.println("홀수");
				
			}
			
		}
		else {
			System.out.println("양수만 입력하세요");
		}
		
	}
	public void practice3() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int kor = scan.nextInt();
		System.out.println("영어 : ");
		int eng = scan.nextInt();
		System.out.println("수학 : "); 
		int math = scan.nextInt();
		
		int total = kor + eng + math;
		
		double avg = total /3;
		
		if ((kor >=40 && eng>=40 &&math >=40) ) {
			if (avg>=60) {
				System.out.println("국어 : "+kor);
				System.out.println("영어 : "+eng);
				System.out.println("수학 : "+math);
				System.out.println("합계 : "+total);
				System.out.println("평균 : "+avg);
				System.out.println("합격입니다.");
			}
			else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
	}
	public void practice4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int num = scan.nextInt();
		
		
		switch (num) {
		case 1 : case 2 : case 12 :
			System.out.println(num+"월은 여름입니다.");break;
		case 3 : case 4 : case 5 :
			System.out.println(num+"월은 봄입니다.");break;
		case 6 : case 7 : case 8 : 
			System.out.println(num+"월은 여름입니다");break;
		case 9 : case 10 : case 11 :
			System.out.println(num+"월은 가을");break;
		default : 
			System.out.println(num + "월은 잘못 입력된 달입니다.");
		}
	}
	public void practice5() {
		Scanner scan = new Scanner(System.in);
		
		String id = "boram";
		String password = "1234";
		
		System.out.print("아이디 : ");
		String resultid = scan.nextLine();
		
		System.out.print("비밀번호 : ");
		String resultpassword = scan.nextLine();
		
		if(id.equals(resultid)&&password.equals(resultpassword)) {
			System.out.println("로그인성공");
		}else {
			if (id.equals(resultid) && !password.equals(resultpassword)) {
				System.out.println("비밀번호가 틀렸습니다.");
			}
			else {
				System.out.println("아이디가 틀렸습니다.");
			}
		}
	}
	public void practice6() {
		Scanner scan= new Scanner(System.in);
		
		System.out.print("권한을 확인하고자 하는 회원 등급 : ");
		String str= scan.nextLine();
		
		if (str.equals("관리자")) {
			System.out.println("회원관리,게시글 관리,게시글작성,댓글 작성,게시글조회");
		}
		else if (str.equals("회원")) {
			System.out.println("게시글 작성 , 게시글 조회, 댓글작성");
		}
		else if (str.equals("비회원")) {
			System.out.println("게시글 조회");
		}
		else {
			System.out.println("값을 잘못입력했습니다.");
		}
		
	}
	public void practice7() {
		Scanner scan = new Scanner(System.in);
		System.out.print("키(m)를 입력해주세요 : ");
		double x=scan.nextDouble();
		System.out.println("몸무게(kg)를 입력해주세요 : ");
		double y= scan.nextDouble();
		
		double bmi = y/(x*x);
		String result= "";
		if (bmi<18.5) {
			result="저체중";
		}
		else if (bmi>=18.5 && bmi<23) {
			result="정상체중";
		}
		else if (bmi>=23 && bmi<25) {
			result="과체중";
		}
		else if (bmi>=25 && bmi<30) {
			result="비만";
		}
		else {
			result="고도 비만";
		}
		System.out.println("BMI 지수 : "+bmi);
		System.out.println(result);
	}
	public void practice8() {
		Scanner scan = new Scanner(System.in);
		System.out.print("피연산자1 입력 : ");
		int num1= scan.nextInt();
		System.out.print("피연산자2 입력 : ");
		int num2= scan.nextInt();
		System.out.print("연산자를 입력 (+,-,*,/,%) : ");
		String result = scan.next();
		
		
		if (result.equals("+")) {
			System.out.println(num1+" "+result+" "+num2+" = "+(num1+num2));
		}
		else if (result.equals("-")) {
			System.out.println(num1+" "+result+" "+num2+" = "+(num1-num2));
		}
		else if (result.equals("*")) {
			System.out.println(num1+" "+result+" "+num2+" = "+(num1*num2));
		}
		else if (result.equals("/")) {
			System.out.println(num1+" "+result+" "+num2+" = "+(num1/num2));
		}
		else if (result.equals("%")) {
			System.out.println(num1+" "+result+" "+num2+" = "+(num1%num2));
		}
		else {
			System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
		}
		
	}
	public void practice9() {
		Scanner scan = new Scanner(System.in);
		ConditionPractice cp =new ConditionPractice();
		System.out.println("1. 메뉴 출력");
		System.out.println("2. 짝수/홀수");
		System.out.println("3. 합격/불합격");
		System.out.println("4. 계절");
		System.out.println("5. 로그인");
		System.out.println("6. 권한 확인");
		System.out.println("7. BMI");
		System.out.println("8. 계산기");
		
		System.out.print("선택 : ");
		int num = scan.nextInt();
		
		switch(num) {
		case 1 : cp.practice1();break;
		case 2 : cp.practice2();break;
		case 3 : cp.practice3();break;
		case 4 : cp.practice4();break;
		case 5 : cp.practice5();break;
		case 6 : cp.practice6();break;
		case 7 : cp.practice7();break;
		case 8 : cp.practice8();break;
		default : System.out.println("잘못입력했습니다.");
		}
		
	}
							
	public void practice10() {
		Scanner scan = new Scanner(System.in);
		System.out.print("중간고사 : ");
		int x= scan.nextInt();
		System.out.print("기말고사 : ");
		int y= scan.nextInt();
		System.out.print("과제 : ");
		int z= scan.nextInt();
		System.out.print("출결 : ");
		int s= scan.nextInt();
		double total =(x*0.30)+(y*0.30)+(z*0.20)+(((s/20.0)*100)*0.20);
		System.out.println("====결과====");
		System.out.println("중간고사 점수 (30) : "+(x*0.30));
		System.out.println("기말고사 점수 (30) : "+(y*0.30));
		System.out.println("과제 점수 (20) : "+(z*0.20));
		System.out.println("출석 횟수 (20) : "+((s/20.0)*100)*0.20);
		
		
		String result = "";
		String result2 = "" ;
		String result3 = "" ;
		
		
		
		if (total<80 && ((s/20.0)*100)<80) {
			result="Fail";
			if(((s/20.0)*100)<80) {
				result2="출석 횟수 부족";
				System.out.println(result+"["+result2+"]"+" ("+s+"/20)");
			}
			else if (total<80) {
				result3="점수 미달";
				System.out.println(result+"["+result3+"]"+" (총점 "+total+")");
			}
		}
		else {
			result="Pass";
			System.out.println(result);
		}
		
		
		
	}
}
