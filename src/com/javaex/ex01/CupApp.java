package com.javaex.ex01;

public class CupApp {

	public static void main(String[] args) {
		Cup cup = new Cup("머그컵", 4000);
		
		/*
		cup.cupSet("머그컵");
		String name = cup.cupGet();
		System.out.println(name);
		
		cup.cupPrice(4000);
		int price = cup.cupPrice2();
		System.out.println(price);
		*/
		cup.showinfo();
	}

}
