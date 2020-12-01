package com.javaex.ex16;

public class PersonApp {

	public static void main(String[] args) {
		
		//Person배열관리
		Person[] pArray = new Person[3];

		Person p01 = new Person("둘리", 1203);
		
		
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이콜", 300);
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		
		for(int i=0 ; i<pArray.length;i++) {
			System.out.println(pArray[i].toString());
		}
		///////////////////////////////////////////////////
		
		Student[] sArray = new Student[2];
		
		Student s01 = new Student("유재석", 44, "서울고등학교");
		
		
		Student s02 = new Student("강호동", 47, "경기고등학교");
			
		sArray[0] = s01;
		sArray[1] = s02;
		
		for(int i=0; i<sArray.length; i++) {
			System.out.println(sArray[i].toString());
		}
		
		//System.out.println(p02.toString());
		

	}

}
