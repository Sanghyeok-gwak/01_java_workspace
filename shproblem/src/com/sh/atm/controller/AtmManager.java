package com.sh.atm.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.sh.atm.model.vo.Receipt;
import com.sh.atm.model.vo.User;

public class AtmManager {
	List<User> userList = new ArrayList<>(); 
	
	List<Receipt> rList = new ArrayList<>(); 
	
	// 가장먼저User 값에 먼저 넣어주세요 
	String str = "aaa1,bbb1,35000,1111\n"
				+"aaa2,bbb2,25000,2222\n"
				+"aaa3,bbb3,15000,3333\n"
				+"aaa4,bbb4,5000,4444\n"
				+"aaa5,bbb5,45000,5555\n"
				+"aaa6,bbb6,31000,6666\n"
				+"aaa7,bbb7,35600,7777\n"
				+"aaa8,bbb8,31200,8888\n"
				+"aaa9,bbb9,33000,9999\n";
	
	public List<User> c(){
		return userList;
	}
	
	public int firstCheck() {
		int result =0;
		String arr[] =str.split("\n");
		
		
		
		for(int i =0; i<arr.length; i++) {
			String temp[]=arr[i].split(",");
			userList.add(new User(temp[0],temp[1],Integer.parseInt(temp[3]),Integer.parseInt(temp[2])));		
		}
		
		if(userList.isEmpty()) {
			result =0;
		}else {
			result = 1;
		}
		return result;
	}
	
	public int login(String userId, String userPwd) {
		int result =0;
		
		for(int i =0; i<userList.size(); i++) {
			if(!userList.get(i).getUserId().equals(userId)) {
				result=3;
			}
		}
		for(int i =0; i<userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId) && !userList.get(i).getUserPwd().equals(userPwd)) {
				result=2;
			}
		}
		for(int i =0; i<userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId) && userList.get(i).getUserPwd().equals(userPwd)) {
				result=1;
			}
		}
		
		
		
		return result;
	}
	
	
	
	
	public boolean checkId (String userId) {
		boolean check = false;
		for(int i =0; i<userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				check= false ;
				break;
			}else {
				check = true;
			}
		}
		
		
		return check;
	}
	
	public boolean checkAct(int act) {
		boolean check = false;
		for (int i =0; i<userList.size(); i++) {
			if(userList.get(i).getAccount()== act) {
				check= false ;
				break;
			}else {
				check = true;
			}
		}
		
		return check;
	}
	
	public int creatUser(String userId,String userPwd,String userPwdCk,int money, int act) {
		int result = 0;
		
		if(userPwd.equals(userPwdCk) && money<50000) {
			result =1 ;
			userList.add(new User(userId,userPwd,money,act));
		}
		
		if(!userPwd.equals(userPwdCk)) {
			result=2;
		}
		if(money>50000){
			result =3;
		}
		
		
		
		
		return result;
		
		
		
	}
	
	
	public int passwordCheck(String userId,String userPwd) {
		int index =-1;
		
		
		for(int i =0; i<userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				if(userList.get(i).getUserPwd().equals(userPwd)) {
					index =i;
				}else {
					index =-1;
				}
			}
		}
		
		return index;
	}
	
	
	
	
	public int updateUser(int index,int sel ,String userId,String userPwd,String checkPwd) {
		
		int result = -1;
		if(sel == 1) {
			userList.get(index).setUserId(userId);
			result = 1;
		}
		else if (sel == 2) {
			if(userPwd.equals(checkPwd)) {
				userList.get(index).setUserPwd(userPwd);
				result = 2;
			}else {
				result = 3;
			}
		}
		
		return result;
	}
	
	public int removeUser(int index,boolean check) {
		
		int result =-1;
		
		if(check == true) {
			userList.remove(index);
			result = 1;
		}
		
		return  result;
	}
	public List<Receipt> depositCode(int index,int money){
		// 입금 내역이 항상 저장될수 있도록 Receipt에 저장
		// SimpleDateFormat 데이터를 활용하여 xxxx년 xx월 xx 일 xx시 xx분 
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		String date = sdf.format(new Date());
		
		userList.get(index).setMoney(userList.get(index).getMoney()+money);
		
		List<Receipt> rTemp = new ArrayList<>();
		
		rList.add(new Receipt(userList.get(index).getAccount(),"입금",money,userList.get(index).getMoney(),date));
		rTemp.add(new Receipt(userList.get(index).getAccount(),"입금",money,userList.get(index).getMoney(),date));
		
		
		return rTemp;
	}
	
	
	public int moneyCheckde(String userId,String money) {
		
		int result =-1;
		
		for(int i =0; i<userList.size(); i++) {
			if(userList.get(i).getUserId().equals(userId)) {
				if(userList.get(i).getMoney()>=Integer.parseInt(money)) {
					
					result = 1;
					userList.get(i).setMoney(userList.get(i).getMoney()-Integer.parseInt(money));
				}
			}
		}
		
		
		return result;
	}
	
	
	public List<User> toTransferAccount (int act,String money) {
		// 함정을 잘 파 보세요  
		List<User> list = new ArrayList();
		
		for(int j =0; j<userList.size(); j++) {
			if(userList.get(j).getAccount() == act) {
				userList.get(j).setMoney(userList.get(j).getMoney()+Integer.parseInt(money));
				list.add(userList.get(j));
			}
		}
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 hh시 mm분");
		String date = sdf.format(new Date());
		
		receiotList.add(new Receipt(list,date));
		
		
		
		
		return list;
	}
	
	public List<Receipt> bankAccountSearch(){
		
		
		return receiotList;
	}
}
