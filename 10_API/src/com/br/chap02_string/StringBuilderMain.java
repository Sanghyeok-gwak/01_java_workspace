package com.br.chap02_string;

public class StringBuilderMain {
	/*
	 * 
	 * < String >
	 * 
	 * - 클래스지만 기본자료형처럼 쓸 수 있는 것 => "" (리터럴)로 제시 가능
	 * - 불변클래스 (수정이 불가능함)
	 * 	ㄴ그 자리에서 변경이 불가능함 => 매번 새로운 주소값을 참조
	 * 	 * 		=>변경이 적고, 한번 값을 담아두고 단지 조회만 할 때 용이
	 * 
	 * <StringBuilder,StringBuffer >
	 * -객체 생성을 통해서 사용해야됨 => new 로 생성한 후 사용
	 * -가변클래스 (수정이 가능함)
	 * 	ㄴ그 자리에서 변경이 진행됨 => 매번 동일한 주소값
	 * 		=>변경이 빈번할경우
	 * -StringBuilder와 StringBuffer는 생성자,메소드 모두 다 동일
	 * 	다만 차이점 속도 차이있음
	 * 	ㄴ StringBuilder = 동기화 제공 x
	 * 	ㄴ StringBuffer = 동기화 제공 o => 속도가 느림 (데이터 안정성 확보)
	 * 
	 *
	 */
	public static void main(String[] args) {
		String str = "반가워!";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
		
		str+="난 String 이야";
		System.out.println(str);
		System.out.println(System.identityHashCode(str));
	
//	
//		int a = 10;
//		System.out.println(a);
//		System.out.println(System.identityHashCode(a));
//		
//		a+=10;
//		System.out.println(a);
//		System.out.println(System.identityHashCode(a));
//	
//	
		System.out.println("================================");
		
		// StringBuilder 객체 생성시 기본적으로 16개의 문자를 담을 수 있는 버퍼가 생성
		StringBuilder sb= new StringBuilder("하이루!");
	
		System.out.println("sb : "+sb);
		System.out.println("수용량 : "+sb.capacity());
		System.out.println("문자열 : "+sb.length());
		System.out.println("주소값 : "+System.identityHashCode(sb));
		System.out.println("================================");
		
		sb.append("adsf");//문자열을 추가할수있다 
		System.out.println("sb : "+sb);
		System.out.println("수용량 : "+sb.capacity());
		System.out.println("문자열 : "+sb.length());
		System.out.println("주소값 : "+System.identityHashCode(sb));

	
		System.out.println("-------------------------------");
		
		sb.delete(4, 8);//시작과 끝을정하면 그안에 값을 제거해준다.
		System.out.println("sb : "+sb);
		System.out.println("수용량 : "+sb.capacity());
		System.out.println("문자열 : "+sb.length());
		System.out.println("주소값 : "+System.identityHashCode(sb));
	
	
		System.out.println("-------------------------------");
		
		sb.insert(4, "eeee");// 원하는 위치에서부터 추가할 수 있다 .
		System.out.println("sb : "+sb);
		System.out.println("수용량 : "+sb.capacity());
		System.out.println("문자열 : "+sb.length());
		System.out.println("주소값 : "+System.identityHashCode(sb));
		
		sb.reverse();//역순으로 변경
		System.out.println("sb : "+sb);
		System.out.println("수용량 : "+sb.capacity());
		System.out.println("문자열 : "+sb.length());
		System.out.println("주소값 : "+System.identityHashCode(sb));
		
		///변경용 메소드 실행시 해당 StringBuilder 객체를 다시금 반환해줌
		// 따라서 메소드를 연속적으로 호출할 수 있음 == 메소드 체이닝
		
		sb.append("ㅋㅋㅋ")
		  .delete(0,3)
		  .reverse()
		  .insert(0, "!!!!!!!!!!");
		System.out.println("sb : "+sb);
		System.out.println("수용량 : "+sb.capacity());
		System.out.println("문자열 : "+sb.length());
		System.out.println("주소값 : "+System.identityHashCode(sb));
		
		//최종적으로 String 타입에 담고자 할경우
		String result = sb.toString();
		System.out.println(result);
	
		
		
		
		
	}
	
}
