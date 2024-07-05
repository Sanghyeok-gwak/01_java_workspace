package com.br.chap03_interface;

import com.br.chap03_interface.model.vo.Baby;
import com.br.chap03_interface.model.vo.Behavior;
import com.br.chap03_interface.model.vo.Mother;
import com.br.chap03_interface.model.vo.Person;

public class InterfaceMain {
	public static void main(String[] args) {
		
//	Person mom = new Mother("김엄마",50,70,"출산");
//	Person baby = new Baby("강아기",3.5,80);
	
//	System.out.println(mom);
//	System.out.println(baby);
//		
//	mom.eat();
//	mom.sleep();
//	
//	
//	System.out.println(mom);
//	System.out.println(baby);
	
	
	
	Behavior b ;
	Behavior mom = new Mother("김",50,70,"출산");
	Behavior baby = new Baby("강",3.5,80);
	
	System.out.println(mom);
	System.out.println(baby);
	
	mom.eat();
	baby.eat();
	mom.sleep();
	baby.sleep();
	
	System.out.println(mom);
	System.out.println(baby);
	
	}
}
