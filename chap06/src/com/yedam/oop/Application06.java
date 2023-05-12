package com.yedam.oop;

import java.util.Scanner;

import com.yedam.access.Access;

public class Application06 {

	Scanner sc = new Scanner(System.in);
	// 필드 선언
	static int num = 1;
	// int num = 1;
	
	// 메소드 선언
	static void info() {
		System.out.println("info 출력");
	}
	
	// void info() {
	//	System.out.println("info 출력");
	// }
	
	public static void main(String[] args) {
		
		// 자기 자신을 객체로 만들기 : 사용 X
		
		// Application06 app = new Application06();
		
		// int a = app.num + 1;
		
		// app.info();
		
		int a = num + 1;
	
		info();
		
		// 클래스에 정의된 정적 멤버 사용 : 클래스명.필드명, 클래스명.메소드명
		// 정적 필드
		System.out.println(StaticCal.PI);
		// 정적 메소드
		System.out.println(StaticCal.minus(10, 5));
		System.out.println(StaticCal.plus(10, 5));
		
		Person p1 = new Person("111111-1234567", "김치킨");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		System.out.println("지구의 반지름 : " + StaticCal.EARTH_RADIUS);
		System.out.println("지구의 표면적 : " + 4 * StaticCal.PI * StaticCal.EARTH_RADIUS * StaticCal.EARTH_RADIUS);
		
		Access ac = new Access();
		ac.free = "public";
//		ac.parent = "protected";
//		ac.basic = "default";
//		ac.privacy = "private";
		
	}
}
