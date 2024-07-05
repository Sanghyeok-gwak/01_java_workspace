package com.hw2.run;

import com.hw2.model.vo.GalaxNote9;
import com.hw2.model.vo.SmartPhone;
import com.hw2.model.vo.V40;

public class Run {
	
	public static void main(String[] args) {
		SmartPhone s []=new SmartPhone[2];
	
	
		s[0]= new GalaxNote9();
		s[1]= new V40();
		
		
		for(SmartPhone sp : s) {
			 
				sp.printMaker();
				sp.makeacall();
				sp.takeaCall();
				sp.touch();
				sp.charge();
				sp.picture();
		
			System.out.println();
		}
	
	
	
	}
	
}
