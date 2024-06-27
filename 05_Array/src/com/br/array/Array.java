package com.br.array;

import java.util.Random;
import java.util.Scanner;

public class Array {
	
	/*
	 * > 변수 : 하나의 공간에 하나의 값을 담을 수 있음
	 * 
	 * < 배열 >
	 * 
	 * 1. 여러개의 값들을 하나로 관리할 수 있는 자료구조
	 * 	 (즉 , 다수의 값들을 한 공간에 담을 수 있음)
	 * 2. 단, "같은 자료형의 값" 들로만 담을 수 있음)
	 * 3. 각 값들을 구분하기 위해 인덱스를 활용함
	 * 4. 배열을 이용하면 반복문을 활용할 수 있따는 장점이 있음
	 * 
	 */
	
	public void method1() {
		// 변수를 활용해서 다수의 데이터 관리
		/*
		int num1 =0;
		int num2 =1;
		int num3 =2;
		int num4 =3;
		int num5 =4;
		
		
		// 일괄 출력 => 반복문 활용 불가
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		System.out.println(num5); 
		*/
		
		
		/*
		 * < 배열 선언 및 생성(할당) >
		 * 
		 * 여러개의 값들을 보관할 공간을 메모리상에 할당받는 과정
		 * 어떤 "자료형"의 값들을 "몇개 " 담을건지 고려해서 만들어야됨
		 * 
		 * 1.배열 선언
		 *  
		 *   [표현법] 자료형 배열
		 * 			자료형[] 배열명; -추천
		 * 
		 * 2. 배열 생성(할당)
		 *	  몇개의 값을 담을건지 그 크기만큼의 배열을 만들어야됨
		 *
		 *	  [표현법] 배열명 = new 자료형[배열크기]
		 *	  
		 * 3. 배열 선언과 동시에 생성(1+2)
		 * 	  [표현법] 자료형[]배열명 = new 자료형[배열크기];
		 * 
		 * 4. 배열 내에 값 대입
		 * 	  배열이라는 공간 내에 특정위치(인덱스)에 값을 대입
		 * 
		 * 	  [표현법] 배열명[인덱스형] = 값;
		 *  
		 */
			
		int a [] = new int [5];
		a[1]=1;
		a[2]=2;
		a[3]=3;
		a[4]=4;
		int total =0;
		
		for(int i =0; i<a.length; i++) {
			System.out.print(a[i]);
			total+= a[i];
		}
		System.out.println(total);
	}
	public void method2() {
		int i = 10;
		int iArr[] = new int [3];
		double dArr[] = new double [3];
		
		System.out.println(i);
		System.out.println(iArr);
		System.out.println(dArr);
		
		/*
		 * 실제 데이터값을 곧바로 담을 수 있는 변수를 일반 변수라고 함
		 * 주소값을 담고 있는 변수는 참조 변수(레퍼런스 변수) 라고 함
		 * 
		 * 기본자료형(boolean , char , byte , int , long , float , double)으로 선언된 변수
		 * ==일반 변수 == 실제 데이터값을 바로 담기 가능
		 * 
		 * 그 외 자료형(int[],double[],char[],String[],Scanner , Variable,...)으로 선언된 변수
		 * ==참조 변수== 주소값을 담는 변수 
		 */
	}
	public void method3() {
//		1,heap에 생성된 공간(객체)마다 고유한 주소값을 부여해줌
//			ㄴ중복되지 않음 == 다른 객체들과 구별됨
//		2. 절대 빈공간이 존재하할 수없음
//			즉, 초기화를 진행해야됨
//			이때 초기화를 하지 않을 경우 jvm이 알아서 초기화해줌  (각 자료형에 맞는 기본값으로)
		
		
		
		
		
		
		int iArr[] = new int [3]; // 0 , 1 , 2
		double dArr[] = new double [2]; // 0 , 1 
		
		
		for(int i = 0 ; i < iArr.length; i++) {
			
			System.out.print(iArr[i]+" ");
		}
		for(int i=0; i<dArr.length; i++) {
			
			System.out.print(dArr[i]+" ");
		}
		System.out.println();
		
		
	}
	public void method4() {
		int arr []=new int [5];//0 , 1 , 2 , 3 , 4
//		
//		arr[0]=1;
//		arr[1]=2;
//		arr[2]=3;
//		arr[3]=4;
//		arr[4]=5;
				
		for(int i = 0 ; i < arr.length; i++) {
			arr[i]= i+1;
			System.out.println(arr[i]);
		}
		System.out.println(arr.hashCode());//숫자로 주소 확인 
		
		
	}
	public void method5() {
		
		int result1= 0;
//		논리형의 기본값 : false
//		문자형의 기본값 : ' '
//		정수형의 기본값 : 0
//		실수형의 기본값 : 0.0
//		참조자료형의 기본값 : null (아무것도 참조하고 있지 않음)
		
		String result2 = null;
		int arr[]=null;
//		NullPointerException : null가지고 특정인덱스에 접근하거나 메소드 호출하거나 할때 발생되는 오류
//					해결방법 : null 이아니면된다 객체생성을 해야됨 
//		System.out.println(arr);
//		System.out.println(arr[0]);
				
		
	}
	public void method6() {
		
		int[] arr = new int [5];
		
		int z = 2;
		
		for(int i =0; i<arr.length; i++) {
			arr[i]=z*(i+1);
		}
		
		
		for(int i =0; i<arr.length; i++) {
			
			System.out.println(arr[i]);
		}
		arr=new int[7];
		
		/*
		 * 연결이 끊겨진 기존 배열은 heap영역에 둥둥떠다님 == 불필요한 존재가됨 ==지워줘야함
		 * =>일정 시간이 지나면 "가비지컬렉터(GC)"가 알아서 지워줌 (자바의특징)
		 * 	 자바에서의 "자동메모리관리"특징 == 개발자는 그냥 코드작성에만 신경쓰면됨
		 */
		
		// 배열을 강제로 삭제시키고자 할 경우 == 연결고리를 끊으면 
		arr= null;
		
		
	}
	public void method7() {
		//1. 크기 10짜리 정수 배열 생성
		//2. 반복문 활용해서 0~마지막 인덱스까지 순차적으로 접근하면서 값 대입
		//		매번 1~100사이의 랜덤값을 발생시켜서 대입
		
		
		int arr[] =new int [10];
		Random ran = new Random();
		int count =0;
		int total =0;
		for(int i =0; i<arr.length; i++) {
//			arr[i]=ran.nextInt(100)+1;
			arr[i]=(int)(Math.random()*100+1);
		}
		for(int i =0; i<arr.length; i++) {
			if(arr[i]%2!=0) {
				
				System.out.println("홀수 : arr["+i+"] = "+arr[i]);
			}else {
				System.out.println("짝수 : arr["+i+"] = "+arr[i]);
				count ++;
				total +=arr[i];
			}
		}
		System.out.println(total);
		System.out.println(count);
	}
	
	
	
	public void method8() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("배열 길이 입력 : "); 
		int id=scan.nextInt();
		
		String arr [] =new String[id];
		scan.nextLine();
		for(int i =0; i<id; i++) {
			System.out.println("arr["+(i+1)+"]번째");
			System.out.println("과일 : ");
			String str = scan.nextLine();
			if(str.equals("exit")) {
				break;
			}
			arr[i]=str;
		}
		
		for(int i =0; i<id; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	
	
	
	public void method9() {
		Scanner scan = new Scanner(System.in);
		
		double darr[] =new double[3];
		double total = 0;
		for(int i =0; i<darr.length; i++) {
			System.out.println((i+1)+"번 입력 : ");
			double key = scan.nextDouble();
			darr[i]=key;
			total +=key;
		}
		for(int i =0; i<darr.length; i++) {
			System.out.printf("%s 번째 키 %.1fcm 입니다. \n",(i+1),darr[i]);
		}

		System.out.println(total);
	}
	public void method10() {
		Scanner scan = new Scanner(System.in);
		
		
		System.out.println("문자열 : ");
		String str = scan.nextLine();
		
		char c []= new char [str.length()] ;
		
		
		for(int i =0; i<c.length; i++) {
			c[i]=str.charAt(i);
		}
		for(int i =0; i<c.length; i++) {
			System.out.print(c[i]+" ");
		}
		
		
	}
	public void method11() {
		Scanner scan = new Scanner(System.in); 
		
		
		System.out.println("문자열 : ");
		String str = scan.nextLine();
		
		char []ch = new char [str.length()];
		
		for(int i=0; i<str.length(); i++) {
			
			ch[i]=str.charAt(i);
			ch[i]+=1;
		}
		//String.valueOf : 전달된 값을 가지고 문자열로 만들어 반환해주는 메소드
		String result = String.valueOf(ch);
		
		/*
		 * 
		String result ="";
		for(int i =0; i<str.length(); i++) {
			result +=ch[i];
		}
		System.out.println(result);
		 */
		
	}
	public void method12() {
		/*
		 * < 배열 선언과 동시에 초기화 >
		 * 
		 * 배열 생성과 동시에 각 인덱스에 초기값 대입하는 과정
		 * 
		 * [표현법] 
		 * 자료형[] 배열명 = new 자료형 [size]{};
		 * 자료형[] 배열명 = {1,2,3,4};
		 *
		 */
		int arr1 [] = new int [] {1,2,3};
		int arr2  [] = {1,2,3,4,5};
		
		int [] arr;
		arr = new int [] {1,2,3,4,5};
		
		System.out.println(arr1 == arr);
		
	}
	public void advancedFor() {
		
		int arr [] = {1,2,3,4,5};
		
		for(int i =0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
		
		System.out.println("---------------");
		//advanced for 문 ()
		/*
		 * for(: 순회하고자하는배열 | 컬렉션){
		 * 
		 * }
		 * 반복문이 돌때 마다 매번 앞쪽 변수에는
		 * 각 인덱스에 담겨있는 실제 데이터값이 매번 담김
		 * 
		 */
		int index =0;
		for(int value:arr){// 변수 = arr[0]; => 변수 = arr[1]; ....=> 변수 = arr[마지막]
			System.out.println(value);
			System.out.println(index++);
		}
		//모든 인덱스에 순차적으로 접근하고자할 때 사용
		/*
		 * for(int:int[])
		 * for(char:char[])
		 * for(String:String)
		 */
	}
	
}
