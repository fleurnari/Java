package com.yedam.inherit;

public class Child extends Parent{
	// 필드
	String name;
	
	// 생성자
	
	// 메소드
	@Override
	public void getInfo() {
		super.getInfo();
		System.out.println("나의 이름은 " + name + "입니다.");
	}
	
	@Override
	public void method1() {
		this.getInfo();
		method2();
		System.out.println("자식 객체 method1 실행");
	}
	
	public void method3() {
		System.out.println("자식 객체 method3 실행");
	}
}
