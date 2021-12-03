package com.javaex.ex19;

public class ArrayException {

	public static void main(String[] args) {
		
		int[] intArray = new int[] {3,6,9};
	
		try {
			System.out.println(intArray[3]);
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println(e.toString());
		}catch(ArithmeticException e) { //e 변수 이름이 같아도 되는 이유: 그 안에서 사용되고 사라지기 때문이다.
			System.out.println(e.toString());
		}finally {
			System.out.println("finally 영역");
		}
	}

}
