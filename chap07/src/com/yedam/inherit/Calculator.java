package com.yedam.inherit;

public class Calculator {
	// 부모 클래스 : 원 넓이 구하는 메소드
	double areaCircle(double r) {
		System.out.println("Calculator 부모 객체 메소드 실행");
		return 3.14 * r * r;
	}
}
