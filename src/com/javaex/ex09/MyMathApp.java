package com.javaex.ex09;

public class MyMathApp {

	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public static void main(String[] args) {
		
		//↓static에 올린 메소드를 사용한 것이다.
		int sum01=MyMath.plus(3, 2);
		System.out.println(sum01);
		
		double sum02=MyMath.plus(4.3, 6.8);
		System.out.println(sum02);
		
		double sum03=MyMath.plus(11.8, 1004);
		System.out.println(sum03);
		
		double sum04=MyMath.plus(55, 4.9);
		System.out.println(sum04);
		
		double sum05=MyMath.circleArea(5);
		System.out.println(sum05);
		
		double sum06=MyMath.circleRound(5);
		System.out.println(sum06);
		
		
		
		/*
		//static에 올린 메소드를 쓸 예정이기 때문에 heap에 복사해서 쓰지 않을 것이다.
		//↓ 아래에 있는 코드들은 heap에 틀을 복사해서 쓰는 코드이므로 주석처리한다.
		MyMath myMath = new MyMath();//생성자 호출
		
		int sum01=myMath.plus(3, 6);
		System.out.println(sum01);
		
		double sum02=myMath.plus(4.3, 5.5);
		System.out.println(sum02);
		
		double sum03=myMath.plus(5.5, 9);
		System.out.println(sum03);
		
		double sum04=myMath.plus(20, 99.9);
		System.out.println(sum04);
		*/
	}
	
}
