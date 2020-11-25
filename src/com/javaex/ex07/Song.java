package com.javaex.ex07;

public class Song {

	private String  artist;
	private String  title;
	private String  album;
	private String  year;
	private String  composer;
	private int track;
	
	public Song () {
	}
	
	public Song(String artist, String title, String album, String year, int track, String composer) {
		this.artist = artist;
		this.title = title;
		this.album = album;
		this.year = year;
		this.composer = composer;
		this.track = track;
	}
	
	public Song(String artist, String title) {
		this.artist = artist;
		this.title = title;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAlbum() {
		return album;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	public String getComposer() {
		return composer;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public int getTrack() {
		return track;
	}

	public void setTrack(int track) {
		this.track = track;
	}
	
	public void showinfo() {
		System.out.println(artist + ", " + title + " (" + album + ", " + year + ", " + track + "번 track" + ", " + composer + ")");
	}
	
	
	
	
	//필드 6개
	
	//생성자 0
	
	//생성자 6
	
	//생성자 2  : 타이틀 아티스트
	
	//생성자 2 : 타이틀 작곡자 -->확인
	
	//생성장 2 : 타이틀 트랙번호 --> 확인 
	
	
	//메소드 - getter / setter 
	
	//메소드 - 일반메소드 showInfo()
	
	//메소드 - 일반메소드 toString() <--테스트

}
