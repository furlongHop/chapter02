package com.javaex.ex19;

import java.util.Scanner;

public class ArithException2 {

	
	public static void main(String[] args) {
		
		double result;
		int num;
		
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		
		try {
			result = 100/num; //ArithmeticException 발생
			System.out.println(result);
		}catch(ArithmeticException e) { //예외상황일 때 처리할 로직
			System.out.println(e.toString()); //자바에 설정된 기본 메소드
		}finally {
			System.out.println("finally 영역");//예외 상황 유무와 관계없이 처리된다.
		}
		
	
		
		
		sc.close();
		

	}

}
