package com.hw2.run;

import java.util.Scanner;

import com.hw2.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		
		int count = 0;
		Student s[] = new Student[10];
		while(true) {
		
			System.out.println("==학생입력==");
			System.out.print("학년 : ");
			int gd =scan.nextInt();
			System.out.print("반 : ");
			int cr =scan.nextInt();
			scan.nextLine();
			System.out.print("이름 : ");
			String n= scan.nextLine();
			System.out.print("국어점수 : ");
			int k=scan.nextInt();
			System.out.print("영어점수 : ");
			int e=scan.nextInt();
			System.out.print("수학점수 : ");
			int m=scan.nextInt();
			s[count] = new Student(gd,cr,n,k,e,m);
			count ++;
			scan.nextLine();
			System.out.println("계속 추가 하시나요 ? (y/n)");
			char ch = scan.nextLine().charAt(0);
			if(ch == 'n') {
				System.out.println("종료");
				break;
			}
			
		}
	
		System.out.println(count);
		for(int i =0; i<count; i++) {
			System.out.println(s[i].information());
		}
		
		
		
	}

}
