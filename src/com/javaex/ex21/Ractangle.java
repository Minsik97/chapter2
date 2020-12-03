package com.javaex.ex21;

public class Ractangle extends Shape {

	// 필드
	private int width;
	private int height;

	// 생성자
	public Ractangle() {
		super();
	}

	public Ractangle(String fillColor, String lineColor, int width, int height) {
		super(fillColor, lineColor);
		this.width = width;
		this.height = height;
	}

	// 메소드 g/s
	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	// 메소드 일반
	public void draw() {
		System.out.println("원-면색:" + super.getFillColor() + "  선색:" + super.getLineColor() + "  가로:" + width + "  새로:" + height);
	}
	
	public double area() {
		return 3.14;
	}
	
	
	@Override
	public String toString() {
		return "Ractangle [width=" + width + ", height=" + height + ", getFillColor()=" + getFillColor()
				+ ", getLineColor()=" + getLineColor() + "]";
	}

}
