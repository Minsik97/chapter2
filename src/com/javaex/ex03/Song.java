package com.javaex.ex03;

public class Song {

	private String artist;
	private String song;
	private String album;
	private String track;
	private String composer;
	private int year;

	//생성자
	//메소드와 유사하다 이름은 클래스명 그리고 리턴형이 없다
	public Song(String artist, String song, String album, String composer, int year, String track ) {
		//메모리에 올린다.
		this.artist = artist ; 
		//위처럼 순서 맞게 나열
	}
	/*
	// 가수
	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getArtist() {
		return artist;
	}

	// 노래제목
	public void setSong(String song) {
		this.song = song;
	}

	public String getSong() {
		return song;
	}

	// 앨범
	public void setAlbum(String album) {
		this.album = album;
	}

	public String getAlbum() {
		return album;
	}

	// 트랙
	public void setTrack(String track) {
		this.track = track;
	}

	public String getTrack() {
		return track;
	}

	// 작곡가
	public void setComposer(String composer) {
		this.composer = composer;
	}

	public String getComposer() {
		return composer;
	}

	// 년도
	public void setYear(int year) {
		this.year = year;
	}

	public int getYear() {
		return year;
	}
*/
	public void showinfo() {
		System.out.println(artist + ", " + song + " (" + album + ", " + year + ", " + track + ", " + composer + ")");
	}

}
