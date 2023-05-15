package com.yedam.inherit;

public class Application02 {
	public static void main(String[] args) {
		Student std = new Student("김치킨", "111-111", 1);
		
		// 부모 객체 필드
		System.out.println("name : " + std.name);
		System.out.println("ssn : " + std.ssn);
		
		// 자식 객체 필드
		System.out.println("stdNo : " + std.stdNo);
		
		
	}
}
