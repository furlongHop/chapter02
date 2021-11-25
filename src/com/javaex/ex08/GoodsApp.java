package com.javaex.ex08;

public class GoodsApp {
	
	//필드(생략 가능)
	
	//생성자(default 생성자 사용 중)
	
	//메소드 g/s(필드가 없으므로 쓸 필요x)

	//↓static에 올라가는 일반 메소드(main:자바가 지어준, 가장 먼저 실행되는 친구 이름)
	public static void main(String[] args) {
		
		Goods camera=new Goods("니콘",400000);
		System.out.println(camera.toString());
		
		Goods cup=new Goods();
		cup.setName("머그컵");
		cup.setPrice(2000);
		System.out.println(cup.toString());
		
		Goods computer=new Goods();
		computer.setName("LG그램");
		computer.setPrice(900000);
		System.out.println(computer.toString());


	}

}
