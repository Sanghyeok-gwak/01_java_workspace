package com.br.collection.view;

import java.util.List;
import java.util.Scanner;

import com.br.collection.controller.MusicController;
import com.br.collection.model.vo.Music;

//화면을 담당하는 클래스 (출력문,입력문)
public class MusicView {
	
	private MusicController mc = new MusicController();
	private Scanner scan = new Scanner(System.in);
	
	//각 화면별 메소드 
	
	//메인화면 : 프로그램 실행시 처음 보여지는 화면
	public void mainMenu() {
		
		while(true) {
			System.out.println("\n=== 음악관리프로그램 ===");
			System.out.println("1. 새로운 곡 추가");
			System.out.println("2. 곡 전체 조회");
			System.out.println("3. 특정 곡 삭제");
			System.out.println("4. 특정 곡 검색");
			System.out.println("5. 특정 곡 수정");
			System.out.println("6. 특정 가수 검색");
			System.out.println("7. 특정 곡 갯수 검색");
			System.out.println("0. 프로그램 종료");
			
			System.out.println(">> 메뉴 선택 : ");
			int num = scan.nextInt();
			
			scan.nextLine();
			
			switch(num) {
			case 1:inputMusic();break;
			case 2:selectMusic();break;
			case 3:removeMusic();break;
			case 4:searchMusic();break;
			case 5:modifyMusic();break;
			case 6:searchArtist();break;
			case 7:countMusic();break;
			case 0:System.out.println("프로그램을 종료합니다.");return;
			default : System.out.println("값을 다시입력해주세요.");
			}
			
		}
		
	}
	public void inputMusic() {
		
		System.out.println("\n=== 신규 곡 추가 화면 ===");
		
		System.out.println("곡명 입력 : ");
		String title = scan.nextLine();
		
		System.out.println("가수 입력 : ");
		String artist = scan.nextLine();
		
		//곡 추가 요청 처리 
		mc.insertMusic(title,artist);
		System.out.println(artist+"님의 "+title+" 곡이 성공적으로 추가되었습니다. ");
	}
	
	public void selectMusic() {
		
		System.out.println("\n=== 전체 곡 리스트 ===");
		List<Music> list = mc.selectMusicList();
		
		if(list.isEmpty()) {
			System.out.println("리스트가 비어있습니다.");
		}else {
			for(int i =0; i<list.size(); i++) {
				System.out.println(list.get(i));
			}
		}
		
	}
	public void removeMusic() {
		System.out.println("\n=== 특정 곡 삭제 화면 ===");
		
		System.out.println("삭제할 곡명 : ");
		String title = scan.nextLine();
		
		int result = mc.removeMusicList(title);
	
		if (result ==0) {
			System.out.println("삭제되었습니다.");
		}else {
			System.out.println("해당 곡은 존재하지 않습니다.");
		}
	}
	public void searchMusic() {
		System.out.println("\n=== 특정 곡 검색 화면 ===");
		
		System.out.println("검색할 곡명 : ");
		String title =scan.nextLine();
		List<Music> searchList = mc.searchMusicList(title);
		
		if(mc.searchMusicList(title).isEmpty()) {
			System.out.println("해당 곡은 존재하지 않습니다.");
		}else {
			for(int i =0; i<searchList.size(); i++) {
				
				System.out.println(searchList.get(i));
			}
		}
		
		
	}
	
	
	
	
	public void modifyMusic() {
		System.out.println("\n=== 특정 곡 수정 화면 ===");
		
		System.out.println("수정할 곡명 : ");
		String title = scan.nextLine();
		
		System.out.println("수정 내용(곡명) : ");
		String uptitle = scan.nextLine();
		
		
		System.out.println("수정 내용(가수명) : ");
		String upartist = scan.nextLine();
		
		
		
		int result = mc.modifyMusicList(title,uptitle,upartist);
		
		if(result ==0) {
			System.out.println("수정할수 없습니다.");
		}else {
			System.out.println("수정이 완료되었습니다.");
		}
	}
	
	public void searchArtist() {
		System.out.println("\n=== 특정 가수 검색 ===");
		String artist=scan.nextLine();
		
		List<String> searchList = mc.searchArtistList(artist);
		if(searchList.isEmpty()) {
			System.out.println("특정 가수는 존재 하지않습니다.");
		}else {
			for(int i=0; i<searchList.size(); i++) {
				System.out.println(searchList.get(i));
				
			}
		}
		
	}
	public void countMusic() {
		System.out.println("\n=== 특정 곡명 갯수 확인 ===");
		
		System.out.println("\n 특정 곡명 입력 : ");
		String title =scan.nextLine();
		
		int result=mc.countMusicList(title);
	
		System.out.println("해당 곡은 "+result+"개 입니다.");
		
		
		
	}
}
