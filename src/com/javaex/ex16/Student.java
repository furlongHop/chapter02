package com.javaex.ex16;

public class Student extends Person {

	//필드
	private String schoolName;

	
	//생성자
	public Student() {
		
	}
	
	public Student(String name, int age, String schoolName) {
		super(name,age);
		this.schoolName = schoolName;
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
		return "Student [schoolName=" + schoolName + ", getName()=" + getName() + ", getAge()=" + getAge() + "]";
	}
	
	
	public void showInfo() {
		System.out.println("**********************");
		System.out.println("이름:"+super.name+" 나이:"+super.age+" 학교:"+schoolName);
		System.out.println("**********************");
	}
	
	
	
}
