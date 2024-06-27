package test.controller;

public class Test6 {
	public static void main(String[] args) {
		int[] array = {1,4,71,23,6,8,19,201,12,11};
		
		int count =0;
		double d = 0;
		int total =0;
		
		
		for(int i =0; i<array.length; i++) {
			if(array[i]%2 != 0) {
				System.out.println(array[i]);
				count ++;
				total +=array[i];
			}else {
				continue;
			}
			
		}
		
		d = (double)total /count;
		System.out.println("더해진 갯수 : "+count);
		System.out.println("합계 : "+total);
		System.out.printf("평균 : %.1f",d);
		
		
	}
}
