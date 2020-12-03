package com.javaex.ex21;

public class ShapeApp {

	public static void main(String[] args) {

		Shape[] s01 = new Shape[2];

		Ractangle r01 = new Ractangle("빨강", "빨강", 100, 100);
		Circle c01 = new Circle("노랑", "노랑", 200);

		s01[0] = r01;
		s01[1] = c01;

		for (int i = 0; i < s01.length; i++) {
			s01[i].draw();
		}
		
		for(int i = 0; i<s01.length; i++) {
			System.out.println(s01[i].area());
		}

	}

}
