package com.br.chap02_abstract.model.vo;

public class FootBall extends Sports{

	public FootBall(int people) {
		super(people);
	}

	@Override
	public void rule() {
		System.out.println("공을 발로만 차야된다.");
	}

}
