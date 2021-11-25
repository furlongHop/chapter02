package com.javaex.ex02;

public class Point {

	//필드
	private int x;
	private int y;
	
	
	//생성자
	/*
	public Point() {//<보이지 않을 뿐 그릇 생성시 저절로 생긴다.
		//목적: 해당 클래스를 메모리에 올리는 일
		System.out.println("Point()실행");
	}
	*/
	
	//↑위에 있는 default 생성자는 새로운 생성자를 만들 경우 사라진다.
	//↓새로운 생성자
	public Point(int x,int y) {
		//해당 클래스를 메모리에 올리는 일
		this.x=x;
		this.y=y;
		System.out.println("Point()");
	}
	
	
	public Point(int x) {
		//해당 클래스를 메모리에 올리는 일
		this.x=x;
		System.out.println("Point(1)");
	}
	
	/*
	public Point(int y) {
		이 생성자는 위에 있는 public Point(int x)와 함께 사용할 수 없다.
		Point라는 같은 이름을 가진, int를 하나 가진 동일한 생성자로 인식하기 때문이다.
		안에 들어있는 자료형의 개수가 다르거나 자료형의 종류가 다르거나 서로 다른 자료형의
		순서가 다를 경우에는 구별하여 인식한다. 그 경우에는 사용할 수 있다. 
	}
	*/
	
	
	//↓새로운 생성자와 동시에 쓰고 싶다면 default 생성자를 따로 만들어주면 된다.
	public Point() {
		System.out.println("point(2)");
		//↑각각 어떤 생성자가 쓰였는지 출력값으로 확인해보자! 
	}
	
	
	//메소드
	public void setX(int x) {
		this.x=x; //this:자기자신(실제 유효한 이름x) 구별 목적
	}
	public int getX() {
		return x;
	}
	public void setY(int y) {
		if(y>0) {//y가 양수가 아니면 0으로 처리한다.>이런 방식으로 추가 가능
			this.y=y;
		}else {
			this.y=0;
		}
	}
	public int getY() {
		return y;
	}
	
	
	//메소드 오버 로딩(같은 이름을 가진 메소드를 여럿 생성)
	public void draw() {
		System.out.println("점[x="+getX()+", y="+y+"]을 그렸습니다.");
	}
	//메소드도 안에 메소드를 호출할 수 있다.>getX()
	
	//action=true면 그리는 기능, action=false면 지우는 기능
	public void draw(boolean action) {
		if(action==true) {
			System.out.println("점[x="+x+", y="+y+"]을 그렸습니다.");
		}else if(action==false) {
			System.out.println("점[x="+x+", y="+y+"]을 지웠습니다.");
		}else {
			//boolean 타입은 값이 두 가지밖에 없으나 if문은 else로 끝나는 게 자연스러우므로
			//아래의 출력 코드를 임의로 넣어주었다. 실제로는 출력될 일이 없다.
			System.out.println("잘못된 입력입니다.");
		}
	}
	
	
}
