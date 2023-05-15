package com.yedam.poly;

public class ChildExample {
	public static void main(String[] args) {
		// 부모 - 자식 간의 자동 타입 변환
		// 1) 부모 변수명 = new 자식생성자();
		// 2) 자식 변수명 = new 자식생성자()
		// 	  부모 변수명 = 자식 변수명;
		// 자식 생성자로 객체 생성 후 부모 객체에 담아준다.
		
		// 타입 변환 + 오버라이딩 : 다형성
		// 부모 클래스에 있는 내용을 사용하되, 자식클래스에 오버라이딩 되어 있다면 자식클래스 메소드 사용
		// 하나의 부모에 여러 자식이 존재 -> 다양한 객체를 생성 -> 다형성
		
		Parent p1 = new Child();
		p1.method1();
		p1.method2();
		p1.field = "parent";
//		p1.field2 = "child";
//		p1.method3();
		
		p1 = new Child02();
		p1.method1();
		p1.method2();
		p1.field = "parent";
		
	}
}
