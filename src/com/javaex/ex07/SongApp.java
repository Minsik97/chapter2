package com.javaex.ex07;

public class SongApp {

	public static void main(String[] args) {
		
		Song song = new Song();
		
		song.setArtist("아이유");
		song.setTitle("좋은날");
		song.setAlbum("Real");
		song.setYear("2010");
		song.setComposer("이민수 작곡");
		song.setTrack(3);
		
		song.showinfo();
		
		
		Song song2  = new Song("BIGBANG", "거짓말", "Always", "2007", 2, "G-DRAGON");
		
		song2.showinfo();
		
		
		Song song3 = new Song("버스커버스커", "벚꽃엔딩");
		song3.setAlbum("버스커버스커1집");
		song3.setYear("2012");
		song3.setComposer("장범준 작곡");
		song3.setTrack(4);
		
		song3.showinfo();
	}

}
