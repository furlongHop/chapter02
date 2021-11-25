package com.javaex.ex09;

public class MyMath {

	//필드
	//static에 올리는 변수 이름은 대부분 대문자를 사용한다.
	private static double PI = 3.14159;
	
	//생성자(기본 생성자 사용)
	
	//메소드 g/s(필드 없으므로 필요 없음)
	
	//메소드 일반
	public static int plus(int a, int b) {
		return a+b;
	}
	
	public static double plus(double a, double b) {
		return a+b;
	}
	
	public static double plus(double a, int b) {
		double sum=a+b;
		return sum;
	}
	
	public static double plus(int a, double b) {
		return a+b;
	}
	
	public static double circleArea(int radius) {
		return radius*radius*PI;
	}
	
	public static double circleRound(int radius) {
		return(radius+radius)*PI;
	}
	
}
