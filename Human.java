package com.yedam.homework;

public class Human {
	// 필드
	String name;
	int height;
	int weight;
	
	// 생성자
	public Human(String name, int height, int weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// 메소드
	public void getInformation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + " 입니다.");
	}
	
}
