package com.yedam.inherit;

public class Parent {
	// 필드
	String lastName;
	
	// 생성자
	
	// 메소드
	public void getInfo() {
		System.out.println("우리 가족의 성 : " + lastName);
	}
	
	public void method1() {
		System.out.println("부모 객체 method1 실행");
	}
	
	public void method2() {
		System.out.println("부모 객체 method2 실행");
	}
}
