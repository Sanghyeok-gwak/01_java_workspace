package com.br.chap03_interface_practice.model.vo;

public abstract class Animal {
	private String name;
	private String kinds;
	
	
	public Animal() {}

	
	@Override
	public String toString() {
		return "Animal [ name=" + name + ", kinds=" + kinds + " ]";
	}


	public Animal(String name, String kinds) {
		super();
		this.name = name;
		this.kinds = kinds;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getKinds() {
		return kinds;
	}


	public void setKinds(String kinds) {
		this.kinds = kinds;
	};
	
	
	public abstract String bark() ;
	
}
