package com.javaex.ex02;

public class PointApp {
	public static void main(String[] args) {
		
		Point xy1 = new Point(5,5);
//		xy.setX(5);
//		xy.setY(5);
		
		xy1.draw();
		
		Point xy2 = new Point();
		xy2.setX(10);
		xy2.setY(23);
		
		xy2.draw();
		
		Point xy3 = new Point(55,65);
		
		xy3.draw(true);
		xy3.draw(false);
		
		//생성자는 한 번 쓰면 제 역할을 다하고 사라져 버리지만 메소드는 여러 번 계속해서 사용할 수 있다.
		xy1.draw(false);

	} 

}
