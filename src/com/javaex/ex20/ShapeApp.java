package com.javaex.ex20;

public class ShapeApp {

	public static void main(String[] args) {
		
		Shape[] sArray = new Shape[2];
		
		//사각형 만들기
		Shape r01 = new Ractangle("노랑", "노랑", 100, 100);
		
		//원 만들기
		Shape c01 = new Circle("파랑", "파랑", 100);
		
		sArray[0] = r01;
		sArray[1] = c01;
		
		for(int i=0; i<sArray.length; i++) {
			sArray[i].draw(); 
		}
		
		//전부 면적 구하기
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].area()); 
		}
		
		/*
		//테스트
		Shape s01 = new Shape("빨강", "빨강");
		System.out.println(s01.toString());
		
		
		Ractangle r01 = new Ractangle("노랑", "노랑", 100, 100);
		r01.draw();
		
		Circle c01 = new Circle("파랑", "파랑", 100);
		c01.draw();
		*/
	}

}
