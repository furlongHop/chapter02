package com.javaex.ex08;

public class Goods {

	//필드
	private String name;
	private int price;
	private static int totalCount;
	
	//생성자
	public Goods() {
		//int는 초기값을 정해주지 않으면 0으로 세팅된다.
		this.totalCount++;
	}
	
	public Goods(String name, int price) {
		this.name=name;
		this.price=price;
		this.totalCount++;
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
	
	public int getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(int totalCount) {
		this.totalCount = totalCount;
	}
	
	
	//메소드 일반
	public void showInfo() {
		System.out.println("상품명: "+name);
		System.out.println("가격: "+price);
	}
	@Override
	public String toString() {
		return "Goods [name=" + name + ", price=" + price + ", totalCount=" + totalCount + "]";
	}
	
}
