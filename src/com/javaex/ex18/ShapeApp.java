package com.javaex.ex18;

public class ShapeApp {

	public static void main(String[] args) {

		/*
		Point p01 = new Point(5,5);
		p01.draw();
		System.out.println(p01.getX());
		
		Drawable p02 = new Point(1108,17);
		p02.draw(); // Drawable의 draw 메소드 사용.
		//System.out.println(p02.getX()); > Point의 메소드는 사용할 수 없다. 사용하고 싶다면 형변환을 사용해야 한다.(다운 캐스팅)
		*/
		
		
		Drawable[] dArray = new Drawable[4];
		
		Drawable p01 = new Point(1,1);
		Drawable r01 = new Rectangle("검정","빨강",11,8);
		Drawable c01 = new Circle("파랑","파랑",12);
		Drawable t01 = new Triangle("노랑","노랑",22,25);
		
		dArray[0]=r01;
		dArray[1]=c01;
		dArray[2]=t01;
		dArray[3]=p01;
		
		//draw()
		for(int i=0;i<dArray.length;i++) {
			dArray[i].draw();
		}
		
		//area>다운캐스팅으로 반복문을 돌릴 경우 area가 없는 Point에서 오류가 난다. 
		//그러므로 area가 있는 클래스인지 아닌지(Shape를 상속받은 클래스인지 아닌지) if문으로 구별할 필요가 있다.
		for(int i=0;i<dArray.length;i++) {
			if(dArray[i] instanceof Shape) {//dArray[i] 안에 든 아이가 Shape에서 태어난 클래스가 맞니?
				System.out.println(((Shape)dArray[i]).area());
			}
		}
		
	
	
	
	}

}
