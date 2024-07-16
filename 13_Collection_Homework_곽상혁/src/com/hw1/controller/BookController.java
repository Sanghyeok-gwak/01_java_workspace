package com.hw1.controller;

import java.util.ArrayList;
import java.util.List;

import com.hw1.model.vo.Book;

public class BookController {
	List<Book> bc = new ArrayList<>();
	
	public void insertBook(String title,String author,int category,String price) {
		switch(category) {
		case 1:bc.add(new Book(title,author,"인문",Integer.parseInt(price)));break;
		case 2:bc.add(new Book(title,author,"자연과학",Integer.parseInt(price)));break;
		case 3:bc.add(new Book(title,author,"의료",Integer.parseInt(price)));break;
		case 4:bc.add(new Book(title,author,"기타",Integer.parseInt(price)));break;
		}
		
		
		
	}
	public List<Book> selectList(){
		List<Book> list = new ArrayList<>();
		
		for(int i =0; i<bc.size(); i++) {
			list.add(bc.get(i));
		}
		
		return list;
	}
	public List<Book> searchBook(int menu,String keyword){
		List<Book> list = new ArrayList<>();
		if(menu ==1) {
			for(int i =0; i<bc.size(); i++) {
				if(bc.get(i).getTitle().contains(keyword)) {
					list.add(bc.get(i));
				}
			}
		}
		else if (menu ==2) {
			for(int i =0; i<bc.size(); i++) {
				if(bc.get(i).getAuthor().contains(keyword)) {
					list.add(bc.get(i));
				}
			}
		}
		else if(menu==3) {
			for(int i =0; i<bc.size(); i++) {
				if(bc.get(i).getTitle().contains(keyword)
						|| bc.get(i).getAuthor().contains(keyword)) {
					list.add(bc.get(i));
				}
			}
		}
		return list;
	}
	public int deleteBook(String title,String author) {
		int result=0;
		for(int i =0 ; i<bc.size(); i++) {
			if (bc.get(i).getTitle().equals(title)&&bc.get(i).getAuthor().equals(author)) {
				bc.remove(i);
				result = 1;
			}
		}
		
		
		
		return result;
	}
	
}
