package com.hw4.view;

import java.util.Scanner;

import com.hw4.model.vo.Employee;

public class EmpMenu {
	Scanner scan= new Scanner(System.in);
	
	public EmpMenu() {}
	
	
	public void mainMenu() {
		Employee emp = null;
		while(true) {
			System.out.println("사원 정보관리메뉴");
			System.out.println("1.새 사원 정보 입력 ");
			System.out.println("2.사원 정보 수정");
			System.out.println("3.사원 정보 삭제");
			System.out.println("4.사원 정보 출력");
			System.out.println("9.프로그램 종료");
			int num = scan.nextInt();
			
			switch(num) {
			case 1: emp = inputEmployee();break;
			case 2:	modifyEmployee(emp);break;
			case 3: emp = null;break;
			case 4: System.out.println(emp.information());break;
			case 9: System.out.println("프로그램을 종료합니다.");return;
			default : System.out.println("다시입력해주세요"); 
			}
		}
	}
	public Employee inputEmployee() {
		Scanner scan = new Scanner(System.in);
		System.out.println("사원 명 : ");
		String eN= scan.nextLine();
		System.out.println("부서 명 : ");
		String dt=scan.nextLine();
		System.out.println("직급 : ");
		String jp=scan.nextLine();
		System.out.println("나이 : ");
		int ae = scan.nextInt();
		scan.nextLine();
		System.out.println("성별 : ");
		char gd = scan.nextLine().charAt(0); 
		System.out.println("급여 : ");
		int sy = scan.nextInt();
		scan.nextLine();
		System.out.println("보너스포인트 : ");
		double bp = scan.nextDouble();
		scan.nextLine();
		System.out.println("전화번호 : ");
		String ph= scan.nextLine();
		System.out.println("주소 : ");
		String ars = scan.nextLine();
		
		
		return new Employee(eN,dt,jp,ae,gd,sy,bp,ph,ars);
	}
	public void modifyEmployee(Employee emp) {
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("사원 정보 수정 메뉴");
			System.out.println("1.이름 변경");
			System.out.println("2.급여 변경");
			System.out.println("3.부서 변경");
			System.out.println("4.직급 변경");
			System.out.println("9.이전 메뉴로");
			int selnum=scan.nextInt();
		
			switch(selnum) {
			case 1: System.out.println("변경 할 이름 입력 : "); 
			String en=scan.nextLine();
			emp.setEmpName(en);
			case 2: System.out.println("급여 변경 : ");
			int cS = scan.nextInt();
			emp.setSalary(cS);
			case 3: System.out.println("부서 변경 : ");
			String cD = scan.nextLine();
			emp.setDept(cD);
			case 4: System.out.println("직급 변경 : ");
			String cJ = scan.nextLine();
			emp.setJob(cJ);
			case 9: System.out.println("이전메뉴로");
			mainMenu();
			}
			
			
		}
	}
}
