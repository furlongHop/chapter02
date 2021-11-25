package com.javaex.ex05;

public class Song {

	//필드
	private String title;
	private String artist;
	private String album;
	private String composer;
	private int year;
	private int track;
	
	
	//생성자
	public Song() {
		System.out.println("Song(0)");
	}
	
	public Song(String title, String artist, String album, String composer) {
		//매개변수가 4개밖에 없는 생성자 안에서 5개짜리 생성자를 호출하기 위해서는 빈 칸을 만들어 두어야 한다. 
		//빈 칸을 필요로 하는 매개변수의 자료형이 String의 경우 ""로 빈 칸을 만들어주고, 정수형일 경우 0 같은 값을 넣어준다.
		this(title,artist,album,composer,0);
	
		System.out.println("Song(4)");
	}
	
	public Song(String title, String artist, String album, String composer, int year) {
		this.title=title;
		this.artist=artist;
		this.album=album;
		this.composer=composer;
		this.year=year;
		
		System.out.println("Song(5)");
	}

	public Song(String title, String artist, String album, String composer, int year, int track) {
		//메모리에 올리는 일
		this(title,artist,album,composer,year);//5번 생성자 호출(분업)
		
		this.track=track;
		System.out.println("Song(6)");
	}
	
	
	//메소드 g/s
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
	
	public int getTrack() {
		return track;
	}
	public void setTrack(int track) {
		this.track = track;
	}

	
	
	//메소드-일반
	public void showInfo() {
		System.out.println(artist + "," + title + "(" + album + "," + year + "," + track + "번 track," + composer + " 작곡)");
	}
	
	//중간 확인용
	@Override
	public String toString() {
		return "Song [title=" + title + ", artist=" + artist + ", album=" + album + ", composer=" + composer + ", year="
				+ year + ", track=" + track + "]";
	}
	
}
