package com.javaex.ex13;

public class ShapeApp {

	public static void main(String[] args) {
		
		//메모리가 움직이는 스토리
		
		//사각형 3개를 만든다(메모리 로딩)
		Rectangle r01  = new Rectangle("검정","빨강",11,8);
		Rectangle r02 = new Rectangle("보라","노랑",18,9);
		Rectangle r03 = new Rectangle("빨강","빨강",55,77);
		
		//사각형 관리를 위한 배열 생성
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 배열에 삽입(주소 입력)
		rArray[0]=r01;
		rArray[1]=r02;
		rArray[2]=r03;
		
		//모두 그리시오
		for(int i=0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		
		/*
		//모든 사각형의 선색만 출력
		for(int i=0;i<rArray.length;i++) {
			System.out.println(rArray[i].getLineColor());
		}
		*/
		
		
		System.out.println("--------------------------------------------");
		
		//원을 관리할 배열
		Circle[] cArray = new Circle[3];
		
		//원을 3개 만듦
		Circle c01 = new Circle("보라","감색",8);
		Circle c02 = new Circle("녹색","하얀색",4);
		Circle c03 = new Circle("분홍색","백금색",6);

		//원을 배열에 집어넣기
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		/*
		for(int i =0;i<cArray.length;i++) {
			System.out.println(cArray[i].toString());
		}
		*/

		for(int i=0;i<cArray.length;i++) {
			cArray[i].draw();
		}
		
		System.out.println("--------------------------------------------");
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01 = new Triangle("회색","초록색",8,4);
		Triangle t02 = new Triangle("노란색","밤색",12,5);
		Triangle t03 = new Triangle("주황색","분홍색",7,6);
		
		tArray[0]=t01;
		tArray[1]=t02;
		tArray[2]=t03;
		
		for(int i=0;i<tArray.length;i++) {
			tArray[i].draw();
		}

	}

}
