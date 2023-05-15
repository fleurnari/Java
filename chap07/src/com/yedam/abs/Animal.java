package com.yedam.abs;

// 추상 클래스
public abstract class Animal {
	// 필드
	public String kind;
	
	// 생성자
	
	// 메소드
	public void breathe() {
		System.out.println("숨쉬기");
	}
	
	// 추상 메소드
	public abstract void sound();
	
}
