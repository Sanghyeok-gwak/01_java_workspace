package com.br.practice.example;


import java.util.Scanner;

public class VariablePractice {
	public void method1() {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요 : ");
		String name = sc.nextLine();
		System.out.println("나이를 입력해주세요 : ");
		int age = sc.nextInt();
		sc.nextLine();
		System.out.println("성별을 입력하세요 : (1.남자/2.여자)");
		//char S = sc.nextLine().charAt(0);
		int S=sc.nextInt();
		System.out.println("키를 입력하세요 : ");
		double T =sc.nextDouble();
		
		if (S==1) {
			
			System.out.printf("키 %.1f인 %d살 남자 %s님 반갑습니다",T,age,S,name);
		}
		else if(S==2) {
			System.out.printf("키 %.1f인 %d살 여자 %s님 반갑습니다",T,age,S,name);
			
		}
		else {
			System.out.println("성별을 잘못 입력하여 다시 실행해주세요");
		}
		//System.out.print("키 "+T+"인"+age+"살"+S+" "+name+" 님 반갑습니다.");
		
		
		
	}
	public void method2() {
		
		Scanner scan = new Scanner(System.in);
		int max =5;
		int count =0;
		for(int i =0; i<max; i++) {
			
			
			if (count ==0) {
				System.out.println("----첫번째 게임----");
				
			}
			if (count ==1) {
				System.out.println("----두번째 게임----");
			}
			else if (count ==2) {
				System.out.println("----셋번째 게임----");
			}
			else if (count==3) {
				System.out.println("----넷번째 게임----");
			}
			else if (count==4) {
				System.out.println("----다섯번째 게임----");
			}
			System.out.println("첫번재 숫자를 입력해주세요 : ");
			int a1= scan.nextInt();
			System.out.println("두번재 숫자를 입력해주세요 : ");
			int a2= scan.nextInt();
			
			System.out.println("더하기 결과 : "+(a1+a2));
			System.out.println("빼기 결과 : " +(a1-a2));
			System.out.println("곱하기 결과 : "+(a1*a2));
			System.out.println("나누기 몫 결과 : "+(a1/a2));
			
			count ++;
			if (count ==5){
				System.out.println("게임이종료 되었습니다");
				break;
				
			}
		}
		
		
	
	}
	public void method3() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("가로 : ");
		double a1 = scan.nextDouble();
		System.out.println("세로 : ");
		double a2 = scan.nextDouble();
		
		
		
		System.out.println("면적의 결과는 : "+(a1*a2));
		System.out.println("둘레의 결과는 : "+((a1+a2)*2) );
		
	}
	public void method4() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("문자열을 입력하세요 : ");
		String exmple = scan.nextLine();
		
		
		
//		System.out.println("첫 번째 문자 : "+exmple.charAt(0));
//		System.out.println("두 번째 문자 : "+exmple.charAt(1));
//		System.out.println("셋 번째 문자 : "+exmple.charAt(2));
	
		
				char ch1 = scan.nextLine().charAt(0);
				char ch2 = scan.nextLine().charAt(1);
				char ch3 = scan.nextLine().charAt(2);
		
		
		
		
		
	}
	
	
	// 추가 문제 -----------------------------------------------------------------------
	   public void method5() {
	      
	      /*
	       * 키보드로 문자 하나를 입력 받아 그 문자와 그 문자의 고유숫자 값을 출력하시오. 
	       * 
	       * ex) 
	       * 
	       * 문자 : A       (=> 사용자가 입력한 값)
	       * 
	       * A 숫자값 : 65 (결과 출력)
	       */
	      
	      Scanner scan = new Scanner(System.in);
	      System.out.print("문자 : ");
	      char A = scan.next().charAt(0);
	      
	      System.out.println(A+"숫자 값 : "+(int)A );
	      
	      
	   }
	   
	   public void method6() {
	      /*
	       * 정수형으로 국어, 영어, 수학 세 과목의 점수를 입력받아 총점과 평균을 출력하시오.
	       * 단, 평균은 실수형으로 출력되도록 하시오. 
	       * 
	       * ex) 
	       * 국어 : 90 (=> 사용자가 입력한 값)
	       * 영어 : 91 (=> 사용자가 입력한 값)
	       * 수학 : 85 (=> 사용자가 입력한 값)
	       * 
	       * 총점 : 266       (결과 출력)
	       * 평균 : 88.67   (결과 출력, 반드시 소수점아래 둘째짜리까지 출력되도록)
	       */
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.println("국어 점수 : ");
	      int A1=scan.nextInt();
	      System.out.println("영어 점수 : ");
	      int A2=scan.nextInt();
	      System.out.println("수학 점수 : ");
	      int A3=scan.nextInt();
	      
	      int total= A1+A2+A3;
	      double average = (double)total/3;
	      
	     
	      System.out.println("총점 : "+(A1+A2+A3));
	      System.out.println("총점 : "+total);
	      System.out.printf("평균 : %.2f",(double)(A1+A2+A3)/3);
	      System.out.printf("평균 : %.2f",average);
	      
	      
	   }
	   
	   public void method7() {
	      /*
	       * 아래의 코드에 선언된 5개의 변수를 가지고 
	       * 산술연산(+,-,*,/)과 형변환을 적절히 활용하여
	       * 주석에 적힌 값과 같은 값이 나올 수 있도록
	       * 출력문 안의 구문을 수정하시오. 
	       * (출력문 안에 이미 쓰여져있는 변수를 활용할 것)
	       */
	      
	      int iNum1 = 10;
	      int iNum2 = 4;
	        
	      float fNum = 3.0f;
	      double dNum = 2.5;
	        
	      char ch = 'A';
	        
	      System.out.println( iNum1 /iNum2 ); // 2
	      System.out.println( (int)dNum ); // 2
	        
	      System.out.println( iNum2 * dNum ); // 10.0
	      System.out.println( (double)iNum1 ); // 10.0
	        
	      System.out.println( (double)iNum1/ iNum2 ); // 2.5
	        
	      System.out.println( (int)fNum ); // 3
	      System.out.println( iNum1 /(int)fNum); // 3
	        
	        

	      System.out.println( iNum1 /fNum );// 3.3333333
	      System.out.println( iNum1/ (double)fNum ); // 3.333333333333335
	        
	      System.out.println( (int)ch ); // 65
	      System.out.println( (int)ch + iNum1 ); // 75
	      System.out.println( (char)(ch + iNum1)  ); // 'K'

	   }
	
}

