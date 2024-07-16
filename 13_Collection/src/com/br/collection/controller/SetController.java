package com.br.collection.controller;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import com.br.collection.model.vo.Student;

public class SetController {
	/*
	 * < java.util.Collection > jav.util.Set > HashSet >
	 * 
	 * 
	 * 1. 집합 형태로 데이터를 관리하는 컬렉션
	 * 2. 특징
	 * 	  ㄴ 순서가 유지되지 않은채로 데이터(value)가 저장됨
	 * 	  ㄴ 인덱스로 데이터를 관리 할 수 없음 (즉,특정 요소 하나만 추출할 수 없음)
	 * 	  ㄴ 중복 데이터(동일객체) 보관 불가 
	 * 
	 * 
	 */
	
	
	public void hashSetTest1() {
//		Set set = new Set();
		//결과 값은 toString ? 
		// 중복 이면 가장 마지막에 작성한것만 출력됨 ? 
		
		Set set = new HashSet();
		
		set.add("ㅎㅇ");
		set.add(1);
		set.add(10.2);
		set.add("ㅎㅇ");
		
		//삽임 순서 유지 안됨 , 중복 데이터 보관 안됨
		
		System.out.println(set);
	}
	public void hashSetTest2() {
		Set<Integer> set = new HashSet();
		
		set.add(3);
		set.add(5);
		set.add(10);
		set.add(5);
		set.add(10);
		
		System.out.println(set);
		System.out.println(set.size());
		
		
	}
	public void hashSetTest3() {
		
		Set<Integer> lotto = new HashSet();
		
//		for(int i =0; i<6; i++) {
//			lotto.add((int)(Math.random()*45+1));
//		}
		int count =0;
		while(lotto.size()<6) {
			lotto.add((int)(Math.random()*45+1));
			count++;
		}
		
		System.out.println(count+":"+lotto);
			
		Object[] lottoArr = lotto.toArray();//Object[]로 반환되도록 정의
		
		for(int i =0; i<lottoArr.length; i++) {
			System.out.println(lottoArr[i]);
		}
		
	}
	public void hashSetTest4() {
		
		Set set = new HashSet();
		
		
		set.add("홍길동");
		set.add(10);
		set.add(new Student("홍길동",15,70));
		set.add(5.2);
		
		
		System.out.println(set);//특정 요소 하나만 뽑기 불가능(인덱스 x )
		System.out.println("========================================");
		//순회(순차탐색)하는 용도로는 사용 가능
		
		for(Object o : set) {
			System.out.println(o);
			
		}
		System.out.println("========================================");
		//순회방법2. Set을 List로 변환 후 이용
		
//		List list = new ArrayList();//생성 후 
//		list.addAll(set);			//set 데이터 통채로 추가
		
		
		List list = new ArrayList(set);// 생성과 동시에 추가
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		
		System.out.println("========================================");
		
		//순회방법3. Iterator(반복자) 이용
		Iterator iterator = set.iterator();//set 내의 요소들이 Iterator 공간에 차곡 담김
		
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		/*
		 * 
		 * [참고]
		 * Iterator는 Collection를 상속받고있는 List, Set과 함께 사용됨
		 * 
		 * Set컬렉션객체.iterator() => Iterator 객체
		 *
		 * 
		 */
		
		
	}
	public void hashSetTest5() {

		// Studemt 타입의 객체만 저장하도록 타입 지정(E == Studet)
		Set<Student> set = new HashSet<>();
		System.out.println("초기값 : "+set);
		
		
		//add(E e) : Set 내에 전달된 요소를 추가시켜줌(단 , )
		
		set.add(new Student("홀길동",45 ,100));
		set.add(new Student("김말똥",26 ,40));
		set.add(new Student("공유",45 ,100));
		set.add(new Student("홀길동",45 ,100));
		
		System.out.println(set);
		//오버라이딩전 : 공유 학생 객체 2개 존재 (동일객체로 판별이 안됨)
		//오버라이딩후 : 공유 학생 객체 1개 존재 (모든 필드값이 일치하면 동일객체로 판별)
		
		System.out.println(set.size());
		System.err.println(set.contains(new Student("홀길동",45,100)));
		
		System.out.println("============================================");
		//순회 방법1. 향상된 for문
		for(Object o : set) {
			System.out.println(o);
		}
		System.out.println("============================================");
		//순회 방법2. List 담아서 순회
		List<Object>  list = new ArrayList<>();
		list .add(set);
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("============================================");
		//순회 방법3. Iterator에 담아서 순회
		Iterator<Student> iterator = set.iterator();
		//HashMap$KeyIterator@816f27d
		//135721597
		while(iterator.hasNext()) {
			
			System.out.println(iterator.next());
		}
	}
	
}
