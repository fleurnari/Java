package com.yedam.oop;

public class Car {
	
	// 필드 : 객체를 만들었을 때 정보를 담아주는 역할
	String name;
	int price;
	// 클래스 내부에서 필드에 정보를 입력
	String company = "벤틀리";
	
	// 생성자 : 객체로 만들 때 내가 하고 싶은 행위를 정의
	//		: 클래스 이름과 동의
	//		: 다양한 방법으로 객체를 생성하기 위해서 생성자를 오버로딩

	// 기본 생성자
	Car() {

	}
	
	// 생성자를 오버로딩 : 데이터 타입의 순서가 중요
	Car(String name, int price) {
		
	}
	
	Car(int price, String company) {
	
	}
	
	Car(String name) {
		this(name, 10000, "현대");
//		this.name = name;
		System.out.println("자동차 이름만 입력");
	}
	
	Car(int price) {
		
	}
	
	Car(String name, int price, String company) {
		this.name = name;
		this.price = price;
		this.company = company;
		System.out.println("모든 필드 초기화");
	}
	
	// 메소드 : 객체가 사용할 수 있는 기능
	
	// 리턴값이 없는 메소드
	void run() {
		System.out.println("달려");
	}
	
	// 문자열 리턴 메소드
	String info() {
		String data = company + " : " + name + " : " + price;
		return data;
	}

}
