package com.javaex.ex06;

public class MathApp {

	public static void main(String[] args) {
		
		Math math=new Math();
		System.out.println(math.plus(3, 2));
		System.out.println(math.plus(1.108, 2.4));
		System.out.println(math.plus(3.2, 2));
		System.out.println(math.plus(3, 2.4));
		
		/*
		int형과 double형 구별할 경우
		Math math=new Math();
		System.out.println(math.plusInt(3, 2));
		
		System.out.println(math.plusDouble(1.108, 2.4));
		*/
		
	}

}
