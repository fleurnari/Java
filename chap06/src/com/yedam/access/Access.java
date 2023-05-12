package com.yedam.access;

public class Access {

	/*
	 * 접근 제한자 : 필드, 메소드, 클래스, 생성자, 인터페이스 등의 앞에 사용 가능
	 * public : 제한 없음
	 * protected : 같은 패키지 내 & 패키지 다를 경우 부모 클래스를 상속 받은 자식 클래스에서 사용 가능
	 * default : 같은 패키지 내에서 사용 가능
	 * private : 내가 속한 클래스, 객체에서만 사용 가능
	 */
	
	// 필드
	public String free;
	protected String parent;
	String basic; // 접근 제한자 생략할 경우 default
	private String privacy;
	
	// 생성자에 접근 제한 : 객체를 생성하는 범위를 제한
	/*
	 * public : 어디서든 객체 생성 가능
	 * protected : 같은 패키지 & 다른 패키지일 경우 부모 클래스를 상속 받은 자식 클래스에서 객체 생성 가능
	 * default : 같은 패키지 내에서 객체 생성 가능
	 * private : 객체 생성 불가능
	 */
	
	public Access() {
		
	}
	
	protected Access(int a) {
		
	}
	
	Access(String s) {
		
	}
	
	private Access(double a) {
		
	}
	
	// 메소드
	private void info() {
		System.out.println("private method");
	}
	
	public void instead() {
		info();
	}
	
	protected void parent() {
		System.out.println("protected method");
	}
	
	void basic() {
		System.out.println("default method");
	}
	
}
