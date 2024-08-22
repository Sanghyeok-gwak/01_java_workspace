package com.sh.atm.model.vo;


public class Receipt {
	// 계좌 입금/출금 입출금액 잔액 입출금일시
	
	
	private int account; // 계좌
	private String check; // 입금 / 출금 확인
	private int sendMoney; // 입출금액 
	private int money; // 잔여 금액
	private String date;// 사용한 시간 
	

	public Receipt() {}


	@Override
	public String toString() {
		return "영수증 계좌 : " + account + "," + check + "금액 : " + sendMoney + ", 잔여금액 : " + money
				+check+"일시=" + date;
	}


	public Receipt(int account, String check, int sendMoney, int money, String date) {
		super();
		this.account = account;
		this.check = check;
		this.sendMoney = sendMoney;
		this.money = money;
		this.date = date;
	}


	public int getAccount() {
		return account;
	}


	public void setAccount(int account) {
		this.account = account;
	}


	public String getCheck() {
		return check;
	}


	public void setCheck(String check) {
		this.check = check;
	}


	public int getSendMoney() {
		return sendMoney;
	}


	public void setSendMoney(int sendMoney) {
		this.sendMoney = sendMoney;
	}


	public int getMoney() {
		return money;
	}


	public void setMoney(int money) {
		this.money = money;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}

	
	

}
