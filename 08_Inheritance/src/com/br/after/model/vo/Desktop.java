package com.br.after.model.vo;

			// 자식 ---------> 부모
			// 후손 ---------> 조상
			// 하위 ---------> 상위
			// 서브 ---------> 슈퍼
			// this -------> super
public class Desktop extends Product {
	
	private boolean allInOne;
	
	
	public Desktop () {
		/*
		 *  super ();//항상 부모객체가 먼저 생성됨
		 *  		 //생략시 JVM이 자동으로 호출해줌 
		 *  		 //따라서 부모클래스에 기본생성자 존재해야 됨
		 *  		 //기본생성자 작성하는 습관 꼭 들이기!
		 */
		
	}
	public Desktop (String brand, String pCode,String pName, int price,boolean allInOne) {
		
		//brand~price 네개의 값들은 부모클래스 (product)의필드에 대입
		//자식클래스에서 부모클래스꺼에 접근할때 super. 으로 접근가능 (단 private 접근 불가)
		
		//1 해결방안 부모클래스의 필드를 protected 로 변경
//		super.brand = brand;
//		super.pCode = pCode;
//		super.pName = pName;
//		super.price = price;
		//2.해결방안 부모클래스에 있는 setter메소드 이용(public 이기 때문에 사용가능)
//		super.setBrand(brand);
//		super.setpCode(pCode);
//		super.setpName(pName);
//		super.setPrice(price);
//		
		//3.해결방안 부모클래스에 정의도어있는 부모생성자 호출하기
		super (brand,pCode,pName,price);
		this.allInOne = allInOne;
	}
	
	public String information () {
		return super.information()+" allInOne : "+allInOne;
	}
	
	public boolean isAllInOne() {
		return allInOne;
	}
	
	public void setAllInOne(boolean allInOne) {
		this.allInOne = allInOne;
	}

}
