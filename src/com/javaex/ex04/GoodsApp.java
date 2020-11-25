package com.javaex.ex04;

public class GoodsApp {

	public static void main(String[] args) {
		
		//생성장Goods()
		Goods camera = new Goods();
		
		camera.setName("니콘");
		camera.setPrice(400000);
		
		camera.showinfo();
		
		//생성자 Goods(String name, int price)
		// setter 사용X
		//showInfo(); 로 확인
		Goods computer = new Goods("LG그램", 10000000);
		computer.showinfo();
		
		
		//생성자 Goods(String name)
		// setter 사용 setPrice();
		//showInfo 로 확인
		Goods cup = new Goods("머그컵");
		cup.setPrice(2000);
		cup.showinfo();
		
		
		
	}

}
