package com.javaex.ex11;

public class PersonApp {
	//필드
	
	//생성자
	
	//메소드 g/s
	
	//메소드 일반
	public static void main(String[] args) {
		Person p01 = new Person("정우성",46);
		
		Person p02 = new Person();
		p02.setName("이정재");
		p02.setAge(-45);
		
//		System.out.println(p01.toString());
//		System.out.println(p02.toString());

		p01.showInfo();
		p02.showInfo();
		
		
		//Student 상속 테스트
		Student s01 = new Student();
		s01.setName("독고루미");
		s01.setAge(20);
		s01.setSchoolName("YJK 대학교");
		s01.showInfo();
		
		Student s02 = new Student("김반희",24,"YJK 대학교");
		s02.showInfo();
		
		Student s03 = new Student("우정리 대학교");
		s03.showInfo();
		
		/*
		<실험 결과>
		2개짜리 부모 생성자(Person(2))가 먼저 사용된 뒤
		3개짜리 자식 생성자(Student(3))가 사용되었음을 알 수 있다.
		*/
		
	}

}
