package com.yedam.inherit;

public class CellPhone {
	// 필드
	String model;
	String color;
	
	// 생성자
	public CellPhone() {
		System.out.println("부모 객체 생성");
	}
	
	public CellPhone(String model) {
		this.model = model;
	}
	
	// 메소드
	void powerOn() {
		System.out.println("전원 키기");
	}
	
	void powerOff() {
		System.out.println("전원 끄기");
	}
	
	void bell() {
		System.out.println("전화 오는중");
	}
	
	void hangUp() {
		System.out.println("전화 끊기");
	}

}
