package com.yedam.access;

public class Singleton {
	
	// 클래스 내부에서 하나의 객체 생성 : 외부에서 접근 불가능
	private static Singleton singleton = null;
	
	// 외부에서 객체를 생성하지 못하도록 막는 역할
	private Singleton() {
		
	}
	
	// 클래스 내부의 객체를 외부에 전달하기 위한 용도
	public static Singleton getInstance() {
		if (singleton == null) {
			singleton = new Singleton();
		}
		return singleton;
	}
	
	// 필드
	public String name;
	public int age;
	
	// 메소드
	public void info() {
		System.out.println("singleton instance method info");
	}
	
}
