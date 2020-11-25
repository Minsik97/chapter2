package com.javaex.ex01;

public class GoodsApp {

	public static void main(String[] args) {
		
		//카메라
		Goods  camera = new Goods();
		
		camera.setName("니콘");
		String cameraName = camera.getName();
		//System.out.println(cameraName);
		
		camera.setPrice(400000);
		int cameraPrice = camera.getPrice();
		//System.out.println(cameraPrice);
		
		//System.out.println("상품이름: " + cameraName + ",  가격: " + cameraPrice);
		camera.showInfo();
		
		
		//노트북
		Goods computer = new Goods();
		
		computer.setName("LG그램");
		String computerName = computer.getName();
		//System.out.println(computerName);
		
		computer.setPrice(1000000);
		int computerPrice = computer.getPrice();
		//System.out.println(computerPrice);
		
		//System.out.println("상품이름: " + computerName + ",  가격: " + computerPrice);
		computer.showInfo();
		
		
		
	}

}
