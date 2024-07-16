package com.br.collection.controller;

import java.util.ArrayList;
import java.util.List;

import com.br.collection.model.vo.Music;

//사용자의 특정 요청을 처리해주는 클래스
public class MusicController {
	private List<Music> list = new ArrayList<>();
	{//초기화 블럭 (샘플데이터 작성담을때)
		list.add(new Music("Good bye","박효신"));
		list.add(new Music("술이 달다","에픽하이"));
		list.add(new Music("밥이 달다","강보람"));
		list.add(new Music("우산","에픽하이"));
	}
	
	// 각 요청별 실행될 메소드
	public void insertMusic(String title,String artist){
		// 전달받은 곡명과 가수명을 가지고
		// Music 객체 생성해서 list에 추가
		list.add(new Music(title,artist));
		
	}
	
	public List<Music> selectMusicList(){
		return list;
	}
	
	public int removeMusicList(String title) {
		int result =0;
		for(int i=0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.remove(i);
				result=1;
				break;// 리소스를 줄이기 위한 break;
			}
		}
		return result;
	}
	public List<Music> searchMusicList(String title) {
		List<Music> searlist = new ArrayList<>();
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().contains(title)) {
				searlist.add(list.get(i));
			}
		}
		return searlist;
	}
	
	
	
	public int modifyMusicList(String title,String uptitle,String upartist){
		int result=0;
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().equals(title)) {
				list.get(i).setTitle(uptitle);
				list.get(i).setArtist(upartist);
			}else {
				result =1;
			}
		}
		return result;
		
	}
	public List<String> searchArtistList(String artist){
		List<String> searArtist = new ArrayList<String>();
		
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getArtist().equals(artist)) {
				searArtist.add(list.get(i).getTitle());
			}
		}
		
		return searArtist;
	}
	
	
	public int countMusicList(String title) {
		int count =0;
		for(int i =0; i<list.size(); i++) {
			if(list.get(i).getTitle().replace(" ","").contains(title.replace(" ",""))) {
				count++;
			}
		}
		
		
		
		return count;
	}
	
	
}
			