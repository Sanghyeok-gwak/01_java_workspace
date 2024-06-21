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
	public void practice2() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("정수 : ");
		int num =scan.nextInt();
		
//		String result = num>0 ? "양수다":(num == 0 ? "0이다" : "음수다");
		String result = num>0 ? "양수다":(num == 0 ? "0이다" : "음수다");
		
		
		System.out.println(result);
		
		
	}
	
	public void practice3() {
		Scanner scan= new Scanner(System.in);
		
		/*
		 * 사용자가 입력한 정수값이 0보다 작거나 같을경우 " 잘못입력하였습니다" 출력
		 * 그게 아닐경우 짝수면 "짝수다" ,홀수면 "홀수다"
		 */
		
		
		System.out.println("정수 : ");
		int num = scan.nextInt();
		
		String result = 0>=num ? "잘못입력하였습니다." : (num%2==0 ? "짝수":"홀수");
		
		
		
				
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
		
		
		
		String result = (S == 'm' || S=='M' ? "남학생": "여학생");
		System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %f이다",num1,num2,num3,name,S,result,num4);
		
		/*
		if (S=='F') {
			System.out.println(num1+"학년 "+num2+"반 "+num3+"번 "+name+" 여학생의 성적은 "+num4+"이다");
			//System.out.printf("%d학년 %d반 %d번 %s 여학생의 성적은 %f이다",num1,num2,num3,name,S,num4);
		}
		else if (S=='M') {
			
			System.out.println(num1+"학년 "+num2+"반 "+num3+"번 "+name+" 남학생의 성적은 "+num4+"이다");
			//System.out.printf("%d학년 %d반 %d번 %s 남학생의 성적은 %f이다",num1,num2,num3,name,S,num4);
		}
		
		*/
		
		
		
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
		String result = age<=13 ? "어린이" : (age>13 && age<=19 ? "청소년":"성인"); 
		
		System.out.println(result);
		
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
		
		String result = num.charAt(7)=='1' || num.charAt(7)=='3' ? "남자" : "여자";
		System.out.println(result);
		
		
	}
	public void practice() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("1.정수 : ");
		int x= scan.nextInt();
		System.out.print("2.정수 : ");
		int y= scan.nextInt();
		System.out.println("연산자 입력(+ , -) : ");
		char z= scan.next().charAt(0);
		int xresult=x+y;
		int yresult=x-y;
		String result = z == '+' ? (x+y+"") : z == '-' ? (x-y+"") : "잘못입력했습니다";
//		String result = (z !='-')||(z !='+') ? "잘못입력하였습니다":
//								z =='-' ? xresult : yresult;
		
//		String result = z!='-' || z !='+' ? "잘못입력했습니다": z =='-' ? (String)yresult: (String)xresult;
		
		if (z == '-' ) {
			System.out.println(yresult);
		}
		else if (z == '+' ) {
			System.out.println(xresult);
		}
		else {
			System.out.println("잘못입력했습니다.");
		}
		
		 
		
		
	}
	
	// 추가문제  -------------------------------------------------------------
		public void practice9() {
			/*
			 * 키보드로 두개의 정수를 입력 받아 각각 num1, num2 변수에 기록한 후
			 * 다시 또 다른 정수를 입력받아 
			 * 해당 그 수가 num1 이하이거나 num2 초과일 경우 true, 그게 아닐경우 false가 출력될수 있도록 
			 * 
			 * 
			 * ex)
			 * 정수1 : 4	(=> 사용자가 입력한값) === false ?
			 * 정수2 : 11 	(=> 사용자가 입력한값) ===== true ?
			 * 입력 : 13	(=> 사용자가 입력한값)
			 * 
			 * true		(결과출력)  ==== true ??????????????? 
			 */
			Scanner scan = new Scanner(System.in);
			
			System.out.println("정수 : ");
			int num1 = scan.nextInt();
			
			System.out.println("정수 : ");
			int num2 = scan.nextInt();
			
			System.out.println("입력 : ");
			int num3 = scan.nextInt();
			
			
			boolean result= num1<=num3 &&num3>num2 ? true : false; 
			
			System.out.println(result);
					
					
			
			
		}
		
		public void practice10() {
			/*
			 * 3개의 정수를 입력받은 후 입력받은 수가 모두 같으면 true, 그게 아닐경우 false가 출력될 수 있도록
			 * 
			 * 
			 * ex)
			 * 입력1 : 5	(=> 사용자가 입력한값)
			 * 입력2 : -8	(=> 사용자가 입력한값)
			 * 입력3 : 5	(=> 사용자가 입력한값)
			 * 
			 * false	(결과출력)
			 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("입력 1: ");
			int x=scan.nextInt();
			System.out.println("입력 2: ");
			int y=scan.nextInt();
			System.out.println("입력 3: ");
			int z=scan.nextInt();
			
			
			boolean check = x!=y ? false: y==z;
			
			System.out.println(check);
			
			
		}
		
		public void practice11() {
			
			/*
			 * 사용자에게 점수값을 정수로 입력받아 
			 * 해당 점수가 90점대일 경우 "축하합니다." 
			 * 			  그게 아닐 경우 "분발하세요." 출력
			 * 
			 * ex) 
			 * 점수 : 95 	(=> 사용자가 입력한값)
			 * 
			 * 축하합니다.	(결과출력)
			 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("점수 : ");
			int num = scan.nextInt();
			
			String result = num>=90 ? "축하합니다" : "분발하세요";
			
			System.out.println(result);
			
			
			
			
		}
		
		
		public void practice12() {
			/*
			 * A,B,C 세명의 사원의 연봉을 정수형으로 입력받고 
			 * 각 사원의 인센티브를 포함한 연봉을 계산하여 출력하고 
			 * 이때 인센티브 포함한 연봉이 3000만원 이상일 경우 "3000만원 이상", 
			 * 										미만일 경우 "3000만원 미만"을 같이출력하시오.
			 * (A 사원의 인센티브는 0.4, B 사원의 인센티브는 없으며, C 사원의 인센티브는 0.15이다.)
			 * 
			 * 
			 * 
			 * ex) 
			 * A 사원의 연봉 : 2500		(=> 사용자가 입력한값)
			 * B 사원의 연봉 : 2900		(=> 사용자가 입력한값)
			 * C 사원의 연봉 : 2600		(=> 사용자가 입력한값)
			 * 
			 * A 사원의 인센티브 포함 연봉이 3500.0만원 이며 3000만원 이상입니다.  (결과출력)
			 * B 사원의 인센티브 포함 연봉이 2900.0만원 이며 3000만원 미만입니다.  (결과출력)
			 * C 사원의 인센티브 포함 연봉이 2990.0만원 이며 3000만원 미만입니다.  (결과출력)
			 */
			
			Scanner scan = new Scanner(System.in);
			
			System.out.println("a 사원 연봉 : ");
			int a = scan.nextInt();
			System.out.println("b 사원 연봉 : ");
			int b = scan.nextInt();
			System.out.println("c 사원 연봉 : ");
			int c = scan.nextInt();
			
			
			String aresult= (a+a*0.4)>=3000 ? "3000만원 이상입니다.":"3000만원 미만입니다.";
			String bresult= b>=3000 ? "3000만원 이상입니다.":"3000만원 미만입니다.";
			String cresult= (c+c*0.15)>=3000 ? "3000만원 이상입니다.":"3000만원 미만입니다.";

			
			
			System.out.println("A 사원의 인센티브 포함 연봉이  "+(a+a*0.4)+"만원 이며 "+aresult);
			System.out.println("B 사원의 인센티브 포함 연봉이  "+b+"만원 이며"+bresult);
			System.out.println("C 사원의 인센티브 포함 연봉이  "+(c+c*0.15)+"만원 이며"+cresult);
			
		}
	
}
