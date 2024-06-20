package com.br.practice.example;

import java.util.Scanner;

public class OperatorPractice {
	
	public void practice1() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num =scan.nextInt();
		
		
		String result = num>0 ? "양수다":"양수가아니다";
		
		System.out.println(result);
		
		
		
	}
	
	
	public void practice3() {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num = scan.nextInt();
		
		String result = num%2==0 ? "짝수":"홀수";
		
				
		System.out.println(result);
		
		
	}
	
	public void practice4() {
		Scanner scan =new Scanner(System.in);
		System.out.println("인원수 : ");
		int pnum = scan.nextInt();
		System.out.println("사탕수 : ");
		int cnum = scan.nextInt();
		
		
		
		System.out.println("1인당 사탕 개수 : "+cnum/pnum);
		System.out.println("남는사탕 개수 : "+cnum%pnum);
		
		
	}
	public void practice5() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("이름을 입력하세요 : ");
		String name = scan.nextLine();
		System.out.println("학년을 입력하세요 : ");
		int num1 = scan.nextInt();
		System.out.println("반을 입력하세요 : ");
		int num2 = scan.nextInt();
		System.out.println("번호를 입력하세요 : ");
		int num3 = scan.nextInt();
		scan.nextLine();
		System.out.println("성별을 입력하세요 (M/F)");
		char S = scan.nextLine().charAt(0);
		System.out.println("성적을 입력하세요 (소수점 아래 둘째 자리까지) : ");
		double num4 = scan.nextDouble();
		
		if (S=='F') {
			System.out.println(num1+"학년 "+num2+"반 "+num3+"번 "+name+" 여학생의 성적은 "+num4+"이다");
			//System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %f이다",num1,num2,num3,name,S,num4);
		}
		else if (S=='M') {
			
			System.out.println(num1+"학년 "+num2+"반 "+num3+"번 "+name+" 남학생의 성적은 "+num4+"이다");
			//System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %f이다",num1,num2,num3,name,S,num4);
		}
		
		
		
		
	}
	public void practice6() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("나이 : ");
		int age = scan.nextInt();
		
		//String result = (age>=13) || (age>13 && age<=19) ||(age>19) ? "어린이" : "청소년" : "성인";
		
		if (age<=13) {
			System.out.println("어린이");
		}
		else if (age>13 && age<=19){
			System.out.println("청소년");
		}else if (age>19) {
			System.out.println("성인");
		}
		
		
		
	}
	public void practice7() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("국어 : ");
		int a = scan.nextInt();
		System.out.println("영어 : ");
		int b = scan.nextInt();
		System.out.println("수학 : ");
		int c = scan.nextInt();
		
		int total = a+b+c;
		
		
		double ttotal=(double)total/3;
		
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.2f",ttotal);
		
		String result=(a>=40&&ttotal>=60)||(b>=40&&ttotal>=60)||(c>=40&&ttotal>=60)? "합격":"불합격";
		System.out.println(result);
		
		
	}
	public void practice8() {
		Scanner scan =new Scanner(System.in);
		System.out.println("주민번호를 입력하세요");
		
		String num = scan.nextLine();
		
		String result = (num.charAt(8)=='1') || (num.charAt(8)=='3') ? "남자" : "여자";
		System.out.println(num.charAt(7));
		System.out.println(result);
		
		
		
		
	}
	
}
