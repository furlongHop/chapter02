package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {
		
		Song IU = new Song();//그릇
		IU.setTitle("좋은 날");
		IU.setArtist("아이유");
		IU.setAlbum("Real");
		IU.setComposer("이민수");
		IU.setYear(2010);
		IU.setTrack("3번 track");
		
		Song BigBang = new Song();
		BigBang.setTitle("거짓말");
		BigBang.setArtist("BIGBANG");
		BigBang.setAlbum("Always");
		BigBang.setComposer("G-DRAGON");
		BigBang.setYear(2007);
		BigBang.setTrack("2번 track");
		
		Song BUS = new Song();
		BUS.setTitle("벚꽃엔딩");
		BUS.setArtist("버스커버스커");
		BUS.setAlbum("버스커버스커 1집");
		BUS.setComposer("장범준");
		BUS.setYear(2012);
		BUS.setTrack("4번 track");
		
		
		IU.showInfo();
		BigBang.showInfo();
		BUS.showInfo();

		//중간 확인, 데이터 확인 출력 코드
		System.out.println(IU.toString());
	}

}
