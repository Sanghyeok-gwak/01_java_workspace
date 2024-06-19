package com.br.variable;

public class Casting {
	
	/*
	 * < 컴퓨터에서의 값 처리 규칙 > 
	 * 
	 * 1. 대입연산자를 기준으로 왼쪽, 오른쪽은 동일한 type이여야됨
	 * 	  즉, 같은 자료형의 값만 대입 가능함
	 *    다른 자료형의 값을 대입하고자 할 경우 자료형을 바꿔줘야됨
	 * 
	 * 	  [표현법] 자료형 변수명 = (자료형)값;
	 * 
	 * 2. 같은 type끼리만 연산 가능 (연산 결과 값도 같은 자료형으로 나옴)
	 * 
	 *    [표현법] 값 + (자료형) 값
	 *    
	 * < 형변환 >
	 * 값의 자료형을 바꾸는 것
	 * 
	 * 1.자동형변환(묵시적형변환) : 자동으로 자료형이 변경됨
	 * 2.강제형변환(명시적형변환) : 형변환 연산자를 통해서 자료형을 변경해야됨
	 * 3.주의사항 : boolean은 형변환이 불가 (true/false만 가질수있음)
	 * 
	 * 
	 * 
	 */
	
	public void autoCasting() {
		
		/*
		 * <자동형변환>
		 * 자료형이 다른 두 값 간의 연산(대입,계산 등)시
		 * 자동으로 값의 범위가 작은 자료형이 큰 범위의 자료형으로 변환되서 처리됨
		 * 
		 * byte -> short -> int -> long -> float -> double
		 */
		
		//1. int(4byte) => double(8byte)
		int i1 = 12;
		double d1 = i1;
		
		System.out.println(d1);
		
		int i2 = 12;
		double d2 = 3.3;
		System.out.println(i2+d2);
		
		//2. int (4byte) = > long(8byte)
		int i3 = 1000;
		long l3= i3;
		
		
		long i4 = 10000000000000000L; 
		
		
		
		//3.float(4byte) => double(8byte)
		float f5 = 1.0f; 
		
	//	double d5 = d5	;	
		
		
	//---특수 케이스 ---
	//	4. long -> float(4byt)
		
	//6. byte 또는 short간의 연산
		byte b1 = 1;
		byte b2 = 10;
		
		//byte b3 = b1+b2;
		
		//에러발생 : byte나 short는 연산시 무조건 int형으로 처리
		
		byte b3 = (byte)(b1+b2);// "강제형변환" 하면 저장 가능
		
		
		
		
	}
	
	
	public void forceCasting() {
		// 강제형변환 : 큰 범위의 자료형을 작은 범위의 자료형으로 바꾸는 과정
		
		//1.double(8byte) => float(4byte)
		double d1=4.0;
		float f1 = (float)d1;
		
		float f2 = 4.0f;//f도 강제형변환 중 하나
		
		//2. double(8byte) => int(4byte)
		int iNum = 10;
		double dNum = 5.89;
		
		//int iSum = iNum+dNum;//10.0 + 5.89 => 15.89 (duble 결과)
									//연산결과인 double형이 int형 변수에 대입 불가=>에러발생
		
		
		// 해결방안 1. 연산결과를 최종적으로 int형으로 강제형변환
		int iSum1 =(int)(iNum + dNum);
		
		System.out.println(iSum1);
		
		// 해결방안 2. double형 값만을 int형으로 강제형변환
		int iSum2 = iNum+(int)dNum;
		
		System.out.println(iSum2);
		// 해결방안 3. 아싸리 그냥 double형 변수에 담는 방법
		double dSum = iNum+dNum;
		System.out.println(dSum);
		
		
		// 방법 1,2는 정수형으로 강제형변환했기 때문에 소수점 아래부분은 버림처림
		// =>데이터 손실 발생생
		
		
		// --데이터 손실 테스트 --
		
		int i = 290;
		byte b = (byte)i;
		
		
		
	}
	
}
