package com.javaex.ex17;

//추상 클래스: 혼자서는 절대 메모리에 로딩될 수 없다.
public abstract class Shape {

	//필드
	protected String lineColor;
	protected String fillColor;

	
	//생성자
	public Shape() {
		
	}
	
	public Shape(String lineColor, String fillColor) {
		this.lineColor = lineColor;
		this.fillColor = fillColor;
	}


	
	//메소드 g/s
	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Shape [lineColor=" + lineColor + ", fillColor=" + fillColor + "]";
	}
	
	//자식 클래에서 반드시 재정의될 필요는 없다. 추상 메소드가 아니기 때문이다.(area()와 비교)
	public void draw() {
		System.out.println("선색:"+lineColor+" 면색:"+fillColor+" 도형을 그렸습니다.");
	}
	
	/*
	//오버라이드를 사용하기 위해 자식 클래스에서 재정의될 부모 메소드를 정의한다. 형식은 자식 메소드와 맞춘다.
	public double area() {
		return 0.0; //재정의될 예정이기 때문에 값 자체에는 의미가 없다. 자료형에 맞춰주었을 뿐이다. 억지로 만든 값.
	}
	*/
	
	//추상 메소드 ppt.62p
	public abstract double area();//<내부 코드를 짤 수 없는 상황이다. 자식 클래스에서는 반드시 내부 코드를 구현해야 한다.
	
}
