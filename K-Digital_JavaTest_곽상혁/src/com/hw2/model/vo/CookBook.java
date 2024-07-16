package com.hw2.model.vo;

public class CookBook extends Book{
	private boolean coupon;

	
	public CookBook() {};
	
	

	public CookBook(String title, String author, String publisher, boolean coupon) {
		super(title, author, publisher);
		this.coupon = coupon;
	}



	@Override
	public String toString() {
		return super.getTitle()+"/"+super.getAuthor()+"/"+super.getPublisher()+"/"+coupon;
	}

	public boolean getCoupon() {
		return coupon;
	}

	public void setCoupon(boolean coupon) {
		this.coupon = coupon;
	}
	
}
