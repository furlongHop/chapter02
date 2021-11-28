package com.javaex.ex11;

public class Student extends Person {

	//필드
	private String schoolName;

	
	//생성자
	public Student() {
		System.out.println("Student(0)");
	}
	
	public Student(String schoolName) {
		this.schoolName = schoolName;
		System.out.println("Student(1)");
	}
	
	
	public Student(String name, int age, String schoolName) {
		/*
		super.setName(name);
		super.setAge(age);
		*/
		
		super(name,age); //부모 생성자 호출
		this.schoolName=schoolName;
		
		//어떤 생성자가 어떤 순서로 사용되었을지 확인해보자!
		System.out.println("Student(3)");
	}

	
	//메소드 g/s
	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	
	//메소드 일반
	@Override
	public String toString() {
		return "Student [schoolName=" + schoolName + "]";
	}
	
	public void showInfo() {
		System.out.println("-------------------------");
		System.out.println("이름:"+getName());
		System.out.println("나이:"+getAge());
		System.out.println("학교:"+schoolName);
		System.out.println("-------------------------");
		System.out.println("");
	}
	

	
}
