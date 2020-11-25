package com.javaex.ex05;

public class Point {

	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x) {
		this.x = x;
	}
	
	/*//사용할 수 없다. ??? int 중복 안됨
	public Point(int y) {
		this.y = y;
	}*/
	
	
	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	public void showinfo() {
		System.out.println("x값: " + x + ",  " + "y값: " + y);
	}
	
}