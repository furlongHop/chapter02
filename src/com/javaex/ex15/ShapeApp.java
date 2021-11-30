package com.javaex.ex15;

public class ShapeApp {

	public static void main(String[] args) {
		
		//도형(Shape, 모든 도형)을 관리하는 배열을 만든다.
		Shape[] sArray = new Shape[3];
		
		
		Shape r01 = new Rectangle("검정","빨강",11,8);
//		r01.draw();
		
		Shape c01 = new Circle("회색","붉은색",5);
//		c01.draw();
		
		Shape t01 = new Triangle("검은색","푸른색",8,4);
//		t01.draw();
		
		sArray[0]=r01;
		sArray[1]=c01;
		sArray[2]=t01;
		
		for(int i=0;i<sArray.length;i++) {
			sArray[i].draw();
		}
		
		System.out.println(((Circle)c01).getRadius()); //덮어놓은 것을 다시 강제로 열어봄>형변환 개념 : 다운 캐스팅
	}

}
