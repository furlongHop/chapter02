package com.javaex.ex10;

public class GoodsApp {

	public static void main(String[] args) {
		
		//공간 만들어주기
		Goods[] goodsArray = new Goods[3];
		
		Goods camera = new Goods("니콘",400000);
		//공간에 주소 넣어주기
		goodsArray[0] = camera;
		
		Goods cup = new Goods("머그컵",2000);
		goodsArray[1] = cup;
		
		Goods computer = new Goods("LG그램",900000);
		goodsArray[2] = computer;

		/*
		camera=goodsArray[0] //공간에 주소 넣었음!
		camera.showInfo();
		goodsArray[0].showInfo();
		*/
		
		//각각의 이름도 모르고 총 개수도 모를 때 쓰는 for문
		int count=0;
		for(int i=0;i<goodsArray.length;i++) {
			//null: 존재하지 않는다. 비어 있다.
			if(goodsArray[i] != null) {//주소가 없지 않다=주소가 있다
			System.out.println(goodsArray[i].toString());
			count++;
			}
		}
		
		System.out.println(count);
		
		//이름만 출력하기
		for(int i=0; i<goodsArray.length; i++) {
			System.out.println(goodsArray[i].getName());
		}
		
		//showInfo 사용하기
		for(int i=0; i<goodsArray.length; i++) {
			goodsArray[i].showInfo();
		}


		
		
	}

}
