package com.javaex.ex03;

public class Song {

	// 필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private String track;

	// alt+shift+s:getter/setter generate
	// ctrl+shift+f:자동 정렬
	// 메소드 getter/setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getTrack() {
		return track;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	//메소드-일반
	// 출력
	public void showInfo() {
		System.out.println(artist + "," + title + "(" + album + "," + year + "," + track + "," + composer + " 작곡)");
	}

	//alt+shift+s>toString>확인용 출력
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
	

}
