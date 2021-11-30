package com.javaex.ex14;

public class Rectangle extends Shape {

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
		/*private로 부모의 필드가 보호되어 있는 경우 필드 자체가 아닌,
		값을 받아주는 역할을 하는 setter 메소드를 대신 사용하는 것도 방법이다.
		ex)super.setLinrColor();*/
		
		/*
		 부모에 있는 필드 직접 호출(private로 보호되지 않았을 경우)
		super.lineColor=lineColor;
		super.fillColor=fillColor;
		*/
		
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
	
	public void draw() {
		System.out.println("선색:"+super.lineColor+" 면색:"+super.fillColor+" 가로:"+width+" 세로:"+height+" 사각형을 그렸습니다.");
	}
	
}
