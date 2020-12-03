package com.javaex.ex22;

import javax.swing.text.DefaultStyledDocument;

public class ShapeApp {

	public static void main(String[] args) {
		
		Point p = new Point (3,3);
		Drawable d = new Point(4,4);
		p.draw();
		System.out.println(p.getX());
		System.out.println("=================================");
		//d.getX();		//보이지 않음
		
		((Point)d).getX(); //다운캐스터 해서 사용 가능
		
		
		//점 + 도형 함께 관리 
		Drawable[] dArray = new Drawable[4];
		
		Drawable r01 = new Ractangle("빨강", "빨강", 4, 8);
		Drawable c01 = new Circle("파랑", "파랑", 5);
		Drawable t01 = new Triangle("노랑", "노랑", 10, 10);
		Drawable p01 = new Point(5, 5);
		
		dArray[0] = r01;
		dArray[1] = c01;
		dArray[2] = t01;
		dArray[3] = p01;
		//전체 그리기
		for(int i=0; i<dArray.length; i++) {
			dArray[i].draw();
		}
		
		System.out.println("=================================");
		//전체 면적 구하기--> Point 면적이 없다.
		//순차적으로  면적 area()실행. 부모가 shape
		for(int i=0; i<dArray.length; i++) {
			
			//부모가 Shape이면  실행.
			if(dArray[i] instanceof Shape) {
			System.out.println(((Shape)dArray[i]).area());
			}
		}
		
			
	}
}
