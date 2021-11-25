package com.javaex.ex04;

public class Goods {
	
	//필드
	private String name;
	private int price;
	
	//생성자
	public Goods() {
		System.out.println("Goods()");
	}
	
	public Goods(String name, int price) {
		this.name = name;
		this.price = price;
		System.out.println("Goods(String name, int price)");
	}
	
	//메소드 g/s
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
	//메소드 일반
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + "]";
	}


}
