package com.javaex.ex02;

public class Point {

	private int name;
	private int name2;
	
	//X값
	public void setX(int x) {
		name = x;
	}
	public int getX() {
		return name;
	}
	
	//Y값
	public void setY(int y) {
		name2 = y;
	}
	public int getY() {
		return name2;
	}
	
	
	
	
	public void showinfo() {
		System.out.println("점[" + "x=" + name + ", " + "y=" + name2 + "]을 그렸습니다."   );
	}
	
	
	
}
