package com.javaex.ex14;

public class ShapeApp {

	public static void main(String[] args) {
		
		/*
		Shape s01 = new Shape("빨강","빨강");
		System.out.println(s01.toString());
		*/
		
		//사각형을 관리할 배열을 만든다.
		Rectangle[] rArray = new Rectangle[3];
		
		//사각형을 만든다.
		Rectangle r01 = new Rectangle("빨강","빨강",5,5);
		Rectangle r02 = new Rectangle("노랑","노랑",7,7);
		Rectangle r03 = new Rectangle("파랑","파랑",10,10);
		
		//사각형을 배열에 집어넣는다.
		rArray[0]= r01;
		rArray[1]= r02;
		rArray[2]= r03;
		
		//System.out.println(r01.toString()); //자식 클래스에서 재정의된 메소드를 사용
		
		//배열을 순회하면서 출력한다.
		for(int i=0;i<rArray.length;i++) {
			rArray[i].draw();
		}
		
		System.out.println("");
		
		Circle[] cArray = new Circle[3];
		
		Circle c01=new Circle("초록색","노란색",6);
		Circle c02=new Circle("주황색","청록색",8);
		Circle c03=new Circle("감색","하얀색",3);
		
		cArray[0]=c01;
		cArray[1]=c02;
		cArray[2]=c03;
		
		for(int i=0;i<cArray.length;i++) {
			cArray[i].draw();
		}
		
		System.out.println("");
		
		Triangle[] tArray = new Triangle[3];
		
		Triangle t01=new Triangle("보라","노랑",18,9);
		Triangle t02=new Triangle("검정","마젠타",12,4);
		Triangle t03=new Triangle("크림색","민트색",14,6);
		
		tArray[0]=t01;
		tArray[1]=t02;
		tArray[2]=t03;
		
		for(int i=0;i<tArray.length;i++) {
			tArray[i].draw();
		}
	}

}
