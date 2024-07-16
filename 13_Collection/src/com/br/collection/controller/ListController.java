package com.br.collection.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.br.collection.model.vo.Music;

public class ListController {
	
	/*
	 * < java.util.Collection > List > ArrayList >
	 * 
	 * 1. 선형자료구조의 컬렉션으로 배열을 가지고 있어
	 * 	  데이터가 순차적으로 보관되어 관리됨
	 * 2. 특징
	 * 	  ㄴ 순서대로 데이터(value)가 저장
	 * 	  ㄴ 인덱스로 각 데이터가 관리
	 * 	  ㄴ 중복 데이터 보관 가능
	 */
	
	
	public void arrayListTest1() {
	
//		List<E> list = new List();
		
		//제네릭 타입을 지정하지 않을 경우 = > Object타입으로 E 타입이
		List list = new ArrayList();
		
		list.add(10);
		list.add("ㅎㅇ");
		list.add(3.123);
		
		System.out.println(list);
		list.add(2,"안녕");
		System.out.println("====================================");
		System.out.println(list);
		System.out.println("====================================");
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		System.out.println(list.get(2));
		System.out.println(list.get(3));
		System.out.println(list.size());
		
	}
	public void arrayListTest2() {
		//정수값만 저장 가능한 list 생성
		List<Integer> numList = new ArrayList<Integer>();
		
		numList.add(11);
		numList.add(22);
		numList.add(33);
		
		System.out.println(numList);
		
		System.out.println("요소 갯수(리스트의 사이즈) : "+numList.size());
		System.out.println("리스트의 마지막 인덱스수 : "+(numList.size()-1));
	
		for(int i =0; i<numList.size(); i++) {
			System.out.println(numList.get(i));
		}
	}
	public void arrayListTest3() {
		//문자열만 저장가능한 list 생성
		List<String> strList = new ArrayList<>();
//		
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
//		strList.add("안녕");
		
		for(int i =0; i<9; i++) {
			if(i%2==0) {
				
				strList.add("안녕");
			}
			else {
				strList.add("방가");
			}
		}
		
		
		System.out.println(strList);
		for(int i =0; i<strList.size(); i++) {
			System.out.println(strList.get(i));
		}
		System.out.println("-=----=-=-");
		for(String s :strList) {
			System.out.println(s);
		}
		
	}
	
	public void arrayListTest4() {
		
		String [] seasonArr = {"봄","여름","가을","겨울"};
		
		// 현재 배열을 List로 변경하고자 할 경우
		
		//* Arrays.asList(배열) : 전달된 배열을 List로 바꿔서 반환
		List<String> seasonList =Arrays.asList(seasonArr);
		System.out.println(seasonList);
		//Arrays.asList 메소드를 이용해서 리스트 생성시 유의사항
		//해당 메소드 호출시 fixed-size list 반환함 (길이 변경이 불가한 리스트)
		//새로운 요소 추가 및 요소 삭제 불가능 / 기존의 요소를 새로운 요소로 변경은 가능
//		seasonList.remove(1);// 추가불가느ㅡㅡㅡㅡ
//		seasonList.add("계절");
		
		seasonList.set(0, "spring");
		
	
	}
	public void arrayListTest5() {
		 List<String> hobbyList = List.of("운동","산책","게임","영화");
	
		 System.out.println(hobbyList);
		 //List.of 이용해서 리스트 생성시 유의사항
		 //해당 메소드 호출시 unmodifiable list 반환함 (수정 자체가 불가능한 리스트)
		 //새로운 요소 추가 , 삭제 변경 ㅁ두 안됨 
		 hobbyList.set(1, "요리");
	
	}
	public void arrayListTest6() {
		
		// Music 객체들만 저장되는 List 생성
		
		List<Music> list = new ArrayList<>();
		
		System.out.println("초기 list : "+list);
		
		// * add(E e) : 리스트 공간 끝에 전달된 요소를 추가시켜줌
		list.add(new Music("Good bye","박효신"));
		list.add(new Music("이 밤","양다일"));
		list.add(new Music("잊혀지다","정키"));
		
		System.out.println("추가후 list : "+list);
		
		//* add(int index, E e)
		list.add(2,new Music("이별하러가는길","임한별"));

		System.out.println("인덱스 추가후 list : "+list);
		
		list.remove(1);
		System.out.println("제거후 : "+list);
		
		//* add (int index , E e ): 리스트 내에 특정 인덱스 위치의 요소를 새로이 전달한 요소를 수정
		list.set(0,new Music("술이 달다","에픽하이") );
		System.out.println("수정후 : "+list);
	
		// * size() : 리스트내의 요소 갯수 반환(즉,리스트의 사이즈)
		System.out.println("list의 사이즈 : "+list.size());
		System.out.println("list의 마지막인덱스수 : "+(list.size()-1));
		// * get(int index) : 리스트 내의 특정 인덱스 위치의 요소를 E 타입으로 반환

		System.out.println("0번인덱스 Music객체 : "+list.get(0));
		
		Music m = list.get(1);
		System.out.println("1번인덱스 Music객체 : "+m);
		
		System.out.println("제목만 출력 : "+m.getTitle());
		System.out.println("가수만 출력 : "+m.getArtist());
	
		System.out.println("2번인덱스 Music객체의 제목만 : "+ list.get(2).getTitle());
		
		//특정 인덱스의 Music객체 내의 정보 변경
		//ex) 1번 인덱스 Music 객체의 제목을 "저 밤" 으로 수정
		list.get(1).setTitle("저 밤");
		System.out.println(list.get(1));
		
		for(Music mc : list) {
			System.out.println(mc);
		}
		
		System.out.println("============================");

		//* subList(int fromIndex,int toIndex) : 리스트의 fromIndex 부터 toIndex "이전"까지 새로운 List 담아서 반환
		List<Music> sub = list .subList(0, 2);
		System.out.println("추출한 list : "+sub);
		
		// * addAll(Collection c) : 기존 리스트에 전달된 컬렉션의 전체 데이터들을 통채로 추가시켜줌
		list.addAll(sub);
		System.out.println(list);
	
		// * clear() : 리스트 내의 요소들을 다 제거시켜줌 (초기화)
		list.clear();
		System.out.println(list);
	
		// * isEmpty() : 리스트가 비어있을 경우 true 반환
		String s = "";
		if (list.isEmpty()) {
			s="네";
		}else {
			s="아니요";
		}
		System.out.println("비어있나요 ? : "+s);
			
		
		
	}
	public void arrayListTest7() {
		List list = Arrays.asList(new Music("술이달다","에픽하이"),new Music("이 밤","양다일"),"끝");
		
		System.out.println(list);
		
		String str = (String)list.get(2);
		Music m1 = (Music)list.get(0);//객체를 꺼내 특정 변수에 담을때 매번 형변환 해야됨
		System.out.println(m1);

		//1번 인덱스 Music객체 정보 변경
		((Music)list.get(1)).setTitle("저 밤");
		((Music)list.get(1)).setArtist("다일");// 객체에 접근해서 setter수행시에도 매번 형변환 해야됨
		
		/*
		 * < 컬렉션 사용시 타입을 지정해두는걸 권장 >
		 * 1. 명시된 타입의 객체만 저장가능하도록 제한을 둘 수 있어 데이터의 안정성 확보
		 * 2. 컬렉션에 저장된 객체에 접근시 매번 형변환하는 절차를 없앨 수 있음
		 * 
		 */
		
		
	}
	
	
	
}
