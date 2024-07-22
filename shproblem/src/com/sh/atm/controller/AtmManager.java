package com.sh.atm.controller;

import java.util.ArrayList;
import java.util.List;

import com.sh.atm.model.vo.Receipt;
import com.sh.atm.model.vo.User;

public class AtmManager {
	List<User> userList = new ArrayList<>(); 
	
	
	List<Receipt> receiotList = new ArrayList<>();
	// 가장먼저User 값에 먼저 넣어주세요 
	String str = "aaa1,bbb1,35000\n"
				+"aaa2,bbb2,25000\n"
				+"aaa3,bbb3,15000\n"
				+"aaa4,bbb4,5000\n"
				+"aaa5,bbb5,45000\n"
				+"aaa6,bbb6,31000\n"
				+"aaa7,bbb7,35600\n"
				+"aaa8,bbb8,31200\n"
				+"aaa9,bbb9,33000\n";
	
	public List<User> c(){
		
		return userList;
	}
	
	public int firstCheck() {
		int result =0;
		String arr[] =str.split("\n");
		
		
		
		for(int i =0; i<arr.length; i++) {
			String temp[]=arr[i].split(",");
			userList.add(new User(temp[0],temp[1],Integer.parseInt(temp[2])));		
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

	public int creatUser(String userId,String userPwd,String userPwdCk,int money) {
		int result = 0;
		
		for(int i =0; i<userList.size(); i++) {
			if(userId.equals(userList.get(i).getUserId())) {
				result =2;
			}
			else if (!userId.equals(userList.get(i).getUserId()) 
					&& userPwd.equals(userPwdCk) && money<50000) {
				userList.add(new User (userId,userPwd,money));
				result = 1;
				break;
			}
		}
//		for(int i =0; i<userList.size(); i++) {
//		}
		if(!userPwd.equals(userPwdCk)) {
			result=3;
		}
		if(money>50000){
			result =4;
		}
		
		
		
		
		
		
		return result;
	}
	
	public void updateUser() {
		
	}
	
	public void removeUser() {
		
	}
	
}
