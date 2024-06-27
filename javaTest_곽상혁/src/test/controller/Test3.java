package test.controller;

public class Test3 {
	public static void main(String[] args) {
		
		int total = 0;
		double d = 0;
		
		int i =1;
		while (i<=100) {
			total +=i;
			i++;
		}
		System.out.println("합계 : "+total);
		d= total/100;
		System.out.printf("평균 : "+"%.1f",d);
		
	}
}
