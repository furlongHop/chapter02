package com.javaex.ex20;

import java.io.IOException;

public class FileManager {

	//필드 생략
	
	//생성자
	//public FileManager() {}
	
	//메소드 g/s
	
	//메소드 일반
	public void readFile() throws IOException {// c:config.txt를 읽어오는 메소드(가정)
		
		//System.out.println("파일을 읽었습니다.");
		
		
	
			System.out.println("강제 예외 상활 발생");
			throw new IOException(); //파일을 읽지 못했을 때 예외 상황 발생
	
	}
	
}
