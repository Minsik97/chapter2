package com.javaex.ex03;

public class SongApp {

	public static void main(String[] args) {

		Song singer = new Song();

		// 가수
		singer.setArtist("아이유");
		String Singer = singer.getArtist();

		// 노래
		singer.setSong("좋은날");
		String Song = singer.getSong();

		// 앨범
		singer.setAlbum("Real");
		String Album = singer.getAlbum();

		// 작곡 년도
		singer.setYear(2010);
		int Year = singer.getYear();

		// 트랙
		singer.setTrack("3번 track");
		String Track = singer.getTrack();

		// 작곡가
		singer.setComposer("이민수 작곡");
		String Composer = singer.getComposer();

		singer.showinfo();

		// 빅뱅
		Song singer2 = new Song();
		//Song singer2 = new Song(순서대로 씀 "빅뱅", "거짓말");
		
		// 가수
		singer2.setArtist("빅뱅");
		String Artist2 = singer2.getArtist();

		// 노래
		singer2.setSong("거짓말");
		String Song2 = singer2.getSong();

		// 앨범
		singer2.setAlbum("Always");
		String Album2 = singer2.getAlbum();

		// 년도
		singer2.setYear(2007);
		int Year2 = singer2.getYear();

		// 트랙
		singer2.setTrack("2번 track");
		String Track2 = singer2.getTrack();

		// 작곡가
		singer2.setComposer("G-DRAGON 작곡");
		String composer2 = singer2.getComposer();

		singer2.showinfo();

		// 버스커버스커
		Song singer3 = new Song();

		// 가수
		singer3.setArtist("버스커버스커");
		String Artist3 = singer3.getArtist();

		// 노래
		singer3.setSong("벚꽃엔딩");
		String Song3 = singer3.getSong();

		// 앨범
		singer3.setAlbum("버스커버스커1집");
		String Album3 = singer.getAlbum();

		// 년도
		singer3.setYear(2012);
		int Year3 = singer3.getYear();

		// 트랙
		singer3.setTrack("4번 track");
		String Track3 = singer3.getTrack();

		// 작곡가
		singer3.setComposer("장범준 작곡");
		String composer3 = singer3.getComposer();

		singer3.showinfo();

	}

}
