package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {
	public static void main(String[] args) {
		Employee e []= new Employee[3];
		
		e[0]= new Employee( 
				
				);
		e[1]= new Employee(1,"홍길동",19,'M',"01022223333","서울 잠실");
		e[2]= new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01011112222","서울 마곡");
		
		for(Employee ep: e) {
			System.out.println(ep.information());
		}
		
		e[0]= new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055559999","전라도 광주");
		e[1]= new Employee(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");
		
		System.out.println("=========================================================");
		System.out.println(e[0].information());
		System.out.println(e[1].information());
		System.out.println("=========================================================");
		
		for(int i =0; i<e.length; i++) {
			System.out.println(e[i].getEmpName()+"의 연봉 : "+(int)((e[i].getSalary()+(e[i].getSalary()*e[i].getBonusPoint()))*12)+"원");
		}
		System.out.println("=========================================================");
		
	
		int total = 0;
		for(Employee ep:e) {
			total += (int)((ep.getSalary()+(ep.getSalary()*ep.getBonusPoint()))*12);
		}
		System.out.println("직원들의 연봉의 평균 : "+(total/3)+"원");
	}
}
