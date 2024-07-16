package com.sh.controller;

import java.util.ArrayList;
import java.util.List;

import com.sh.model.vo.Bread;
import com.sh.model.vo.Coffee;
import com.sh.model.vo.CoffeeShop;
import com.sh.model.vo.UserName;

public class CoffeeManager {
	List<Coffee> coffeeList = new ArrayList<>();
	{
		coffeeList.add(new Coffee("아메리카노",5000,10));
		coffeeList.add(new Coffee("카페라떼",6000,5));
		coffeeList.add(new Coffee("돌체라떼",6000,3));
		coffeeList.add(new Coffee("라떼는말야",7000,2));
		
	}
	
	List<Bread> breadList = new ArrayList<>();
	{
		breadList.add(new Bread("소보로빵",3000,4));
		breadList.add(new Bread("곰보빵빵",1500,3));
		breadList.add(new Bread("빵빵이",1000,2));
	}
	List <Object> baske = new ArrayList<>();
	CoffeeShop cs= new CoffeeShop(coffeeList,breadList,"qqqq","1111","상혁이네","안산");	
	UserName un = new UserName();
	public int checkingAdmin(String userId, String userPwd) {
		int log = -1;
		if(cs.getUserid().equals(userId)&&cs.getUserpwd().equals(userPwd)) {
			log=1;
		}
		return log;
	}
	public void checkingUser(String userName ,int money) {
		un = new UserName(baske,userName,money);
		
	}
	public CoffeeShop management(int num , String chName) {
		
		if(num==1) {
			cs.setCafetitle(chName);
		}
		else {
			cs.setCafeaddres(chName);
		}
		return cs ;
		
	}
	public List<Coffee> coffeeInquiry(){
		return coffeeList;
	}
	public void insertCoffee(String cName,int price,int count) {
		coffeeList.add(new Coffee(cName,price,count));
	}
	public void deleteCoffee(int index){
		for(int i=0; i<coffeeList.size(); i++) {
			if(i==index ) {
				coffeeList.remove(i);
			}
		}
	}
	public List<Bread> breadInquiry(){
		return breadList;
	}
	public void insertBread(String bName , int price , int count) {
		breadList.add(new Bread(bName,price,count));
	}
	public void deleteBread(int index) {
		for(int i=0; i<breadList.size(); i++) {
			if(i==index ) {
				breadList.remove(i);
			}
		}
	}
	
	
	
	
	
	public CoffeeShop selectAll() {
		return cs;
	}
	public List<Object> searchCafe(int num ,String keyword) {
		List<Object> list = new ArrayList<>();
		
		if(num ==1) {
			for(int i=0; i<breadList.size(); i++) {
				if(breadList.get(i).getBreadName().contains(keyword)) {
					list.add(breadList.get(i));
				}
			}
		}
		else if (num==2) {
			for(int i=0; i<coffeeList.size(); i++) {
				if(coffeeList.get(i).getCoffeeName().contains(keyword)) {
					list.add(coffeeList.get(i));
				}
			}
		}
		
		
		return list;
	}
	public List <Object> myBasketcheck() {
		
		return baske;
	}
	public void oreder(int num , int index) {
		if (num==1) {
			baske.add(coffeeList.get(index));
			coffeeList.get(index).setCount(coffeeList.get(index).getCount()-1);
			
		}
		else if (num ==2){
			baske.add(breadList.get(index));
			breadList.get(index).setCount(breadList.get(index).getCount()-1);
		}
	}
	public int last () {
		int result=0;
		int total =0;
		for(int i =0; i<baske.size(); i++) {
			total+=((Coffee)baske.get(i)).getPrice()+((Bread)baske.get(i)).getPrice();
		}
		
		
		if(total >un.getMoney()) {
			result =1;
		}
	
		
		
		
		return result;
				
	}
	
	
}
