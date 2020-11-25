package com.javaex.ex01;

public class Cup {

	private String name;
	private int price;
	
	public Cup(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void showinfo() {
		System.out.println("상품명: " + name + "   가격: " + price);
	}
	
	
	/*
	public void cupSet(String c) {
		name = c;
	}
	public String cupGet() {
		return name;
	}
	
	public void cupPrice(int cp) {
		price = cp;
	}
	public int cupPrice2() {
		return price;
	}
	*/
	
	
	
	
}
