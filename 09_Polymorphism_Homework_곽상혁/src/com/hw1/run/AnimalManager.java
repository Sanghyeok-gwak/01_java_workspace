package com.hw1.run;

import com.hw1.model.vo.Animal;
import com.hw1.model.vo.Cat;
import com.hw1.model.vo.Dog;

public class AnimalManager {
	public static void main(String[] args) {
		
		
		
		
		Animal a []= new Animal[5];
		Dog d = new Dog("똘똘이","말티푸",5);
		Cat c = new Cat("구디","스핑크스","가산","삼색");
		
		
		
		
		for(int i =0; i<a.length; i++) {
			if(i%2==0) {
				a[i] = d;
			}else {
				a[i] = c;
			}
		}
		for(int i =0; i<a.length; i++) {
			a[i].speak();
		}
		
		
	}
}
