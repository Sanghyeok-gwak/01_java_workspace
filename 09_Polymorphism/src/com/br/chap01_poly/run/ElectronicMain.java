package com.br.chap01_poly.run;

import com.br.chap01_poly.model.vo.Desktop;
import com.br.chap01_poly.model.vo.NoteBook;
import com.br.chap01_poly.model.vo.Tablet;

public class ElectronicMain {
	public static void main(String[] args) {
		
		//해당 가게에 제품 납품하는 업체
		
		//----ElectronicShop1----
		
		
//		ElectronicShop1 es1 = new ElectronicShop1();
//		
//		es1.insert(new Desktop("삼성","데탑",1200000,"Geforce1080"));
//		es1.insert(new NoteBook("LG","gram",200000,4));
//		es1.insert(new Tablet("apple","Ipad",800000,false));
//		
//		// 제품 조회
//		
//		Desktop d =es1.selectDesktop();
//		NoteBook n =es1.selectNoteBook();
//		Tablet t = es1.selectTablet();
//		
//		System.out.println(d);
//		System.out.println(n);
//		System.out.println(t);
//		
		
		//----ElectronicShop2----
		
		ElectronicShop2 es2 = new ElectronicShop2();
		es2.insert (new Desktop("삼성","데탑",1200000,"Geforce1080"));
		es2.insert (new NoteBook("LG","gram",200000,4));
		es2.insert (new Tablet("apple","Ipad",800000,false));
		
		// 제품 조회
		Desktop d =(Desktop)es2.select(0);
		NoteBook n =(NoteBook)es2.select(1);
		Tablet t =(Tablet)es2.select(2);
		
		System.out.println(d);
		System.out.println(n);
		System.out.println(t);
	}
}
