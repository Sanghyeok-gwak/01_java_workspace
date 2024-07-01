package com.br.chap05_constructor.run;

import com.br.chap05_constructor.model.vo.Bakery;
import com.br.chap05_constructor.model.vo.Bread;

public class RemindMain {

	public static void main(String[] args) {
		
		Bread b1 = new Bread();
		b1.setName("튀김소보로");
		b1.setPrice(2500);
		
		System.out.println(b1.information());
		System.out.println("==================");
		
		Bakery b2 = new Bakery();
		
		b2.setBakeryName("뚜레주르");
		b2.setBakeryAddr("경기도 안산시");
		
		System.out.println(b2.information());
		System.out.println("==================");
		
		
		Bakery b3 = new Bakery();
		b3.setBakeryName("파리바게뜨");
		b3.setBakeryAddr("경기도 시흥시");
		b3.setBread(b1 );

		Bakery b4 = new Bakery("성심당","대전시",new Bread("튀김소보로",5000));
		
		System.out.println(b4.information());
		
		System.out.println(b4.getBread(b1));
		
		
//		System.out.println(b4.);
		
		
	}

}
