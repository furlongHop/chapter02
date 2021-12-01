package com.javaex.ex18;

public class Rectangle extends Shape implements Drawable {

	//필드
	//private String lineColor;
	//private String fillColor;
	
	private int width;
	private int height;
	
	//생성자
	public Rectangle() {
		super(); //부모 클래스의 생성자 사용>Shape 기본 생성자 Shape();
	}

	/*부모를 고려해서 생성자를 만든다.*/
	public Rectangle(String lineColor, String fillColor, int width, int height) {
		
		super(lineColor,fillColor); // 부모 생성자 사용(2개짜리 생성자로 특정)
		
		this.width = width;
		this.height = height;
	}

	
	//메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}



	//부모 클래스에도 같은 메소드가 존재한다.
	//부모 클래스의 메소드가 사용되지 않도록 같은 이름으로 재정의해주었다.
	
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getLineColor()=" + getLineColor()
				+ ", getFillColor()=" + getFillColor() + "]";
	}
	
	public void draw() {//interface의 메소드 구현
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 가로:"+width+" 세로:"+height+" 사각형을 그렸습니다.");
	}
	
	//shape 클래스를 상속받았다.>미완성인 클래스를 완성하는 역할
	public double area() { //shape를 상속받기 위해서는 미완성인 부분의 코드를 완성해야한다.
		double result = width*height;
		return result;
	}
	
}
