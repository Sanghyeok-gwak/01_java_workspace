package com.br.variable;

import java.util.Scanner;

public class Keyboardinput {
/*
	public static void main(String[] args) {
		
		
	}
*/
	public void inputTest1() {//사용자에게 인적사항을 입력받아 출력해보기
		/*
		 * < 사용자로부터 키보드로 값 입력 받기 > 
		 * 자바에서 제공하는 Scanner 클래스의 메소드를 이용해서 값을 입력받을 수 있음
		 * 1. scanner 클래스 생성
		 * 2. scanner 클래스 내의 nextXXX() 메소드 실행
		 * 	  next()			: 사용자가 입력한 값 중에 공백 이전까지의 값 읽어들이기
		 * 	  nextLine()		: 사용자가 입력한 값 중에 엔터 이전까지의 값 전체 읽어들이기
		 * 	  nextInt()			: 사용자가 입력한 값 중에 정수값을 읽어들이기 
		 * 	  nextDouble()		: 사용자가 입력한 값 중에 실수값을 읽어들이기
		 * 3. 읽어들인 값을 보관해두고자 한다면 변수에 대입해두기
		 * 
		 */
		Scanner sc = new Scanner(System.in); //system.in : 입력받은 값을 바이트단위로 읽어들이겠다 라는걸 의미
		
		System.out.print("당신의 이름은 무엇입니까 : ");
		
//		String name = sc.next();
		String name = sc.nextLine();
		
		System.out.print("당신의 나이는 몇살입니까 : ");
		
		int age = sc.nextInt();
		
		System.out.print("당신의 키는 몇입니까(소수점포함해서 입력) : ");
	
		double height = sc.nextDouble();
		
		// 출력형식 : xxx님은 xx살이며, 키는 xxx.xxcm입니다.
		
		
		System.out.printf(name+" 님은 "+ age +" 살이며, 키는 "+height+" cm입니다.");
		
		
		
		
		
	}
	public void practice2() {
		
	Scanner sc = new Scanner(System.in);
	//Scanner sc2 = new Scanner(System.in);
	
	/*
	 * 키보드로 값을 입력 (엔터)  --->버퍼에 값 들어옴
	 * 				     --->sc.nextLine() 메소드 동작
	 *						버퍼에 들어온 값을 읽어들이기 --> 변수에 기록 
	 * 
	 * sc.nextLine() : 버퍼에서 "엔터" 이전까지의 모든 값을 읽어들인 후 "엔터"를 비워주는 역할 
	 * 그 외의 메소드 	 : 버퍼에서 "엔터" 이전까지의 값을 읽어들인 후 "엔터"를 비워주지 않음  
	 * 
	 * sc.nextXXX() 후 sc.nextLine이 오게될 경우
	 * 버퍼에 남아있는 "엔터" 때문에 사용자가 값을 입력했다고 인지해서
	 * 곧바로 값을 읽어들임 (sc.nextLine() 바로 실행되버림)
	 * 
	 * 
	 * 해결방법 : sc.nextXX() 후에 sc.nextLine이 와야될 경우
	 * 		   sc.nexLine() 수행 되기전에 버퍼에 남아있는 엔터를 비워주는 과정 추가
	 * 			=>강제로 sc.next.Line() 한번 더 수행시켜주기
	 * 
	 */
	
	
	
	
	System.out.println("이름 : ");
	String naem = sc.nextLine();
	
	System.out.println("나이 : ");
	int age = sc.nextInt(); // 숫자값만 읽어들여지고 버퍼에는 엔터가 그대로 남아있는 상태
	
	//버퍼에 남아있는 엔터를 비워주는 과정
	sc.nextLine();
	System.out.println("주소 : ");
	
	String address = sc.nextLine();// 버퍼에 남아있는 엔터를 사용자가 입력했다고 인식해서 곧바로 읽어들여짐 => "" 문자열이 읽어들여짐
	
	System.out.println("키 : ");
	double height = sc.nextDouble();
	
	
	sc.nextLine();
	System.out.println("학원 : ");
	String academy = sc.nextLine();
	
	
	//xx 님은 xx살이며, 사는곳 xxx이고, 
	//키는 xxx.xxcm입니다. 그리고 학원은 xxx에 다닙니다.
	System.out.printf("%s님은, %d살이며, 사는곳은 %s이고, 키는 %.2fcm입니다.그리고 학원은 %s에다닙니다.",naem,age,address,height,academy);
	
	
	
	//System.out.println(naem+" 님은 "+age+" 살이며, 사는곳은 "+address+" 이고, 키는 "+height+" cm입니다."
	//		+ "				그리고 학원은 "+academy+" 다닙니다.");
	
	
		
		
		
		
	}
	public void inputTest3() {
		//문자열을 입력받을 때 --> sc.nextLine()
		//정수값을 입력받을 때 --> sc.nextint()
		//실수값을 입력받을 때 --> sc.nextdouble()
		Scanner scn = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = scn.nextLine();
		
		
		System.out.println("성별(M/F) : ");
		char gender = scn.nextLine().charAt(0);
		
		System.out.println("나이 : ");
		int age = scn.nextInt();
		
		System.out.println("==="+ name+ " 님의 개인정보 ===" );
		System.out.println("성별 : "+gender);
		System.out.println("나이 : "+age);
	
	}

	public void charAtTest() {
		//문자열.charAt(추출하고자하는인덱스수); -->문자열로부터 해당 인덱스의 문자값 뽑아서 돌려줌
		
		System.out.println("apple".charAt(0));
		
		
		String fruit = "kiwi";
		
		System.out.println(fruit.charAt(0));
		//System.out.println(fruit.charAt(10));// 문자열의 부적절한 인덱스 접근시 ==>StringIndexOutOfBoundsException
		
		Scanner scn = new Scanner(System.in);
		
		System.out.print("과일 : ");
		System.out.println(scn.nextLine().charAt(3));
		
	} 
	
	public void practice3() {
		/*
		 * 상품을 등록하는 페이지라는 가정하에
		 * 
		 * 사용자에게 등록하고자 하는 상품의
		 * 상품명String, 브랜드명String , 가격int , 제조국가String,할인율doble , 등급(A~D) 순으로 입력받으후
		 * 출력해보기 (출력형식은 자유)
		 * 
		 *
		 */
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("상품명 : ");
		String Name = sc.nextLine();

		System.out.println("브랜드명 : ");
		String BN = sc.nextLine();
		
		System.out.println("가격 : ");


		sc.nextLine();
		
		System.out.println("제조국가 : ");
		String AD =sc.nextLine();
		
		System.out.println("할인율 : ");
		Double PP = sc.nextDouble();
		
		sc.nextLine();
		
		System.out.println("등급(A~D) : ");
		//String D= sc.nextLine();
		char D = sc.nextLine().charAt(0);
		
		
		
		System.out.println("상품명 : "+Name+"브랜드명 : "
		+BN+"가격 : "+PP+"제조국가 : "+AD+"할인율 : "+(int)(PP*100)+"%"+"등급 : "+D);
		
		
		
		
		
		
	}
}
