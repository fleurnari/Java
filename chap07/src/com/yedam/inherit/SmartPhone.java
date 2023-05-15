package com.yedam.inherit;

public class SmartPhone extends CellPhone {

	// 필드
	String agency;
	
	// 생성자
	SmartPhone(String model, String color, String agency) {
		// 부모 생성자 호출 -> 부모 클래스 - 자식 클래스 순서로 객체 생성한다.
		super();
		System.out.println("자식 객체 생성 중");
		this.model = model;
		this.color = color;
		this.agency = agency;
	}
	
	SmartPhone(String model, String color) {
		super(model);
		this.color = color;
		this.agency = "KT";
	}
	
	void kakaoExe() {
		System.out.println("카톡 실행");
	}
	
	void Info() {
		System.out.println("통신사 : " + agency);
	}
	
	void kakaoExit() {
		System.out.println("카톡 종료");
	}
	
	// 메소드
}
