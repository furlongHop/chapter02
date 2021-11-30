package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		Person p01 = new Person("최한",17);
		p01.showInfo();
		
		Student s01 = new Student("온",9,"로운 아카데미");
		s01.showInfo();
		
		Person ps01 = new Student("홍",8,"로운 아카데미");
		ps01.showInfo();
		System.out.println(ps01.toString());
	}

}
