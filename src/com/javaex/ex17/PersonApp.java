package com.javaex.ex17;

public class PersonApp {

	public static void main(String[] args) {
		
		
		/*오버라이딩 테스트
		//test --섞어쓰기
		//자료형을 통일하려고
		Person s01 = new Student("유재석", 44, "서울고등학교");
		
		//s01.getSchoolName(); 사용할 수 없다.
		
		s01.showInfo();
		*/
		
		Person[] pArray = new Person[5];
		
		Person p01 = new Person("둘리", 1200);
		Person p02 = new Person("도우너", 200);
		Person p03 = new Person("마이클", 300);
		
		Person s01 = new Student("유재석", 40, "서울고등학교");
		Person s02 = new Student("강호동", 44, "경기고등학교");
		
		pArray[0] = p01;
		pArray[1] = p02;
		pArray[2] = p03;
		pArray[3] = s01;
		pArray[4] = s02;
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
		}
		
		System.out.println("====================");
		
		System.out.println(((Student)pArray[3]).getSchoolName());
		((Student)pArray[4]).setSchoolName("마산 고등학교");
		
		for(int i=0; i<pArray.length; i++) {
			System.out.println(pArray[i].toString());
			
			//케스팅 테스트
			Person t01 = pArray[4];
			//Student t02 = pArray[4];
			
			Student t03 = (Student)pArray[4];
			Person t04 = (Student)pArray[4];
			
			
			
			
			
			
			
		}
		
	}

}
