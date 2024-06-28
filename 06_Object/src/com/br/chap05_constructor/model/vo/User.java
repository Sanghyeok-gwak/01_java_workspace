package com.br.chap05_constructor.model.vo;

public class User {
	
	// 필드부
	// 멤버변수들 작성
	
	private String userId;
	private String userPwd;
	private String userName;
	private int age;
	private char gender;
	
	// 생성자부
	/*
	 * < 생성자 >
	 * 객체를 생성할 때 동작되는 메소드같은 존재
	 * new 연산자와 함께 호출됨
	 * 
	 * [표현법]
	 * public 클래스명([매개변수,매개변수, ..]){
	 * 		객체생성시 실행시킬 내용 작성
	 * }
	 * 
	 * < 생성자의 작성 목적 >
	 * 1. 객체를 생성해주기 위한 목적 				=> 기본생성자 작성
	 * 2. 객체 생성과 동시에 각 필드에 초기화할 목적	=> 매개변수생성자 작성
	 * 
	 * < 생성자 작성시 주의사항 >
	 * 1. 반드시 생성자명은 클래스명과 동일하게 작성
	 * 2. 반환의 개념이 없기때문에 반환형을 기술하면 안됨
	 * 		=> 반환형 기술하는 순간 메소드로 인식되버림
	 * 3. 
	 * 
	 */
	
	public User() {//기본생성자
		//기본생성자 (매개변수가 없는 생성자)
		//단지 객체 생성만을 목적으로 할 때 사용
		//new User(); 하는 순간 실행되는 생성자
		//기본생성자 작성을 생략했을 경우 => JVM이 자동으로 기본생성자를 만들어줌  
//		System.out.prin
//		tln("기본생성자 실행됨");
	}
	public User(String userId,String userPwd,String userName) {
		
	}
	
//	public User(String userId,String userPwd,String userName) {
		//반드시 첫줄에 작성
//		this(userId,userPwd,userName);
//		this.userId = userId;
//		this.userPwd = userPwd;
//		this.userName = userName;
		
//	}
	public User(String userId,String userPwd,String userName,int age,char gender) {
		this.userId = userId;
		this.userPwd = userPwd;
		this.userName = userName;
		this.age = age;
		this.gender = gender;
		
	}
	
	
	// 메소드부
	// setter,getter, information
	
	public void setUserId(String userId) {
		this.userId=userId;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	
	
	public String getUserId() {
		return userId;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public String getUserName() {
		return userName;
	}
	
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	
	
//	public void information() {
//		System.out.println("userId : "+userId+"\nuserPwd : "+userPwd+"\nuserName : "+userName+"\nAge : "+age+"\ngender : " +gender);
//	}
	
	public String information() {
		return "userId : "+userId+"\nuserPwd : "+userPwd
				+"\nuserName : "+userName+"\nAge : "+age
				+"\ngender : " +gender;
	}
	
	
	
	
	
		
}
