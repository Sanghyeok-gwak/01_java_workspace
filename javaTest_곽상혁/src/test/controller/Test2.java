package test.controller;

public class Test2 {
	public static void main(String[] args) {
		
		for(int i =2; i<=5; i++) {
			for(int j =1; j<=9; j++) {
				if(i%2 != 0 && j%2 != 0) {
					System.out.println(i+"x"+j+"="+(i*j));
				}
			}
		}
		
		
	}
}
