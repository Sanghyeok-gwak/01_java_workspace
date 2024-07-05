package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {
	public static void main(String[] args) {
		
		Student s []= new  Student[3];
		
		s[0]= new Student("홍길동",20,178.2,70.0,1,"정보시스템공학과");
		s[1]= new Student("김말똥",21,187.3,80.0,2,"경영학과");
		s[2]= new Student("강개순",23,167.0,45.0,4,"정보통신공학과");
		
		for(int i =0; i<s.length; i++) {
			System.out.println(s[i].toString());
		}
		
		
		Employee emp[] = new Employee[10];	
		int count = 0;
		Scanner scan =new Scanner(System.in);
	while(true) {
		System.out.println("==등록==");
		System.out.println("이름 : ");
		String n = scan.nextLine();
		System.out.println("나이 : " );
		int a = scan.nextInt();
		System.out.println("신장 : ");
		double he = scan.nextDouble();
		System.out.println("몸무게 : ");
		double we = scan.nextDouble();
		System.out.println("급여 : ");
		int sa = scan.nextInt();
		scan.nextLine();
		System.out.println("부서 : ");
		String d = scan.nextLine();
		
		emp[count]= new Employee(n,a,he,we,sa,d);
		count ++;
		
		System.out.println("더 입력 하시겠습니까?(y/n)");
		char sel= scan.nextLine().charAt(0);
		
		if(sel == 'n') {
			System.out.println("종료");
			break;
		}
		
	}
	for(int i =0; i<count ; i++) {
		System.out.println(emp[i].toString());
	}
	
	
	}
	
}
