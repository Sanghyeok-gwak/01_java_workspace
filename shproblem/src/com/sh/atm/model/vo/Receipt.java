package com.sh.atm.model.vo;

import java.text.SimpleDateFormat;
import java.util.List;

public class Receipt {
	private List<User> user; // 유저 값 
	private SimpleDateFormat sdf;// 사용한 시간 
	
	@Override
	public String toString() {
		return "Receipt [user=" + user + ", sdf=" + sdf + "]";
	}
	public Receipt(List<User> user, SimpleDateFormat sdf) {
		super();
		this.user = user;
		this.sdf = sdf;
	}
	public List<User> getUser() {
		return user;
	}
	public void setUser(List<User> user) {
		this.user = user;
	}
	public SimpleDateFormat getSdf() {
		return sdf;
	}
	public void setSdf(SimpleDateFormat sdf) {
		this.sdf = sdf;
	}



}
