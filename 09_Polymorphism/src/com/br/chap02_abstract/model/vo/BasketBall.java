package com.br.chap02_abstract.model.vo;

public class BasketBall extends Sports {

	public BasketBall(int people) {
		super(people);
	}

	@Override
	public void rule() {
		System.out.println("공을 항상 손으로만 쳐야된다.");
	}


}
