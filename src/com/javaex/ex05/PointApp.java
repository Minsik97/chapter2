package com.javaex.ex05;

public class PointApp {

	public static void main(String[] args) {
		
		Point xy = new Point ();

		xy.setX(23);
		xy.setY(30);
		
		xy.showinfo();
		
		Point xy2 = new Point(40, 60);
		xy2.showinfo();
		
		Point xy3 = new Point(50);
		xy3.setY(55);
		xy3.showinfo();
		
		
		
	}

}
