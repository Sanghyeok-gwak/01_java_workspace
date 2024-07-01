package com.br.objectArray.model.vo;

public class Book {
	private String title;
	private String author;
	private int price;
	private String publisher;
	
	
	public Book() {}
	public Book(String title,String author,int price,String publisher) {
		this.title = title;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getAuthor() {
		return author;
	} 
	
	public void setPrice(int price) {
		this.price = price;
	}
	public int getPrice() {
		return price;
	}
	
	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	public String getPublisher() {
		return publisher;
	}
	
	public String information() {
		return "도서명 : "+title+ " \n도서저자 : "+author+" \n가격 : "+price+" \n출판사 : "+publisher;
	}
	
}
