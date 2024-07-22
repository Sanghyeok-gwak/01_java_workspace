package com.sh.atm.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.sh.atm.model.vo.User;

public class test {
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		List<User> userList = new ArrayList<>(); 
		String str = "aaa1,bbb1,35000\n"
				+"aaa2,bbb2,25000\n"
				+"aaa3,bbb3,15000\n"
				+"aaa4,bbb4,5000\n"
				+"aaa5,bbb5,45000\n"
				+"aaa6,bbb6,31000\n"
				+"aaa7,bbb7,35600\n"
				+"aaa8,bbb8,31200\n"
				+"aaa9,bbb9,33000\n";


		int result =0;
		String arr[] =str.split("\n");
		
		
		
		for(int i =0; i<arr.length; i++) {
			String temp[]=arr[i].split(",");
			userList.add(new User(temp[0],temp[1],Integer.parseInt(temp[2])));		
		}
		String userId=scan.nextLine();
		String userPwd=scan.nextLine();
		for(int i =0; i<userList.size(); i++) {
			if(!userId.equals(userList.get(i).getUserId())) {
				result=3;
			}
			if(userId.equals(userList.get(i).getUserId()) && !userPwd.equals(userList.get(i).getUserPwd())) {
				result=2;
			}
			if(userId.equals(userList.get(i).getUserId()) && userPwd.equals(userList.get(i).getUserPwd())) {
				result=1;
			}
		}
		System.out.println(result);
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
		System.out.println(result);
	}
}
