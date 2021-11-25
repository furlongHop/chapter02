package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {
		
		//6개 모두 setter로 초기화
		Song IU = new Song();
		IU.setTitle("좋은 날");
		IU.setArtist("아이유");
		IU.setAlbum("Real");
		IU.setComposer("이민수");
		IU.setYear(2010);
		IU.setTrack(3);
		
		System.out.println(IU.toString());
		
		System.out.println("================================");
		//6개 전부 생성자로 초기화
		//6개를 전부 담당하는 생성자가 없으므로 5개짜리 생성자와 그 생성자를 호출하는 생성자, 총 두 개가 쓰였다. 
		Song BUS = new Song("벚꽃엔딩","버스커버스커","버스커버스커 1집","장범준",2012,4);
		System.out.println(BUS.toString());
		System.out.println("================================");
		
		
		//5개는 생성자 초기화, 트랙 번호는 setter로 초기화
		Song BIGBANG = new Song("거짓말","BIGBANG","Always","G-DRAGON",2007);
		BIGBANG.setTrack(2);
		
		System.out.println(BIGBANG.toString());
		
		
		System.out.println("");
		//출력
		IU.showInfo();
		BUS.showInfo();
		BIGBANG.showInfo();
		
	}
}
