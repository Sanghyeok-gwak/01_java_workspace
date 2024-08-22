package com.sh.atm.model.vo;

public class User {
	private String userId; // 유저아이디
	private String userPwd;// 유저 비밀번호
	private int account;//계좌 
	private int money; // 유저 금액
	
	
	public User() {}


	@Override
	public String toString() {
		return "User [userId=" + userId + ", userPwd=" + userPwd + ", account=" + account + ", money=" + money + "]";
	}


	public User(String userId, String userPwd, int account, int money) {
		super();
		this.userId = userId;
		this.userPwd = userPwd;
		this.account = account;
		this.money = money;
	}


	public String getUserId() {
		return userId;
	}


	public void setUserId(String userId) {
		this.userId = userId;
	}


	public String getUserPwd() {
		return userPwd;
	}


	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}


	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	

	
	
	
}
