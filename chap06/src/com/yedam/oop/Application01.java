package com.yedam.oop;

public class Application01 {
	public static void main(String[] args) {
		
		Car myCar = new Car();
		
		System.out.println(myCar.company);
		System.out.println(myCar.price);
		System.out.println(myCar.name);
		
		// 클래스 외부에서 객체를 생성하고 필드를 호출
		myCar.company = "현대";
		myCar.price = 100;
		myCar.name = "아반떼";
		System.out.println("=== 객체 필드 데이터 입력 ===");
		System.out.println(myCar.company);
		System.out.println(myCar.price);
		System.out.println(myCar.name);
		
		
		Car yourCar = new Car();
		System.out.println("myCar, yourCar 비교");
		System.out.println(myCar.company);
		System.out.println(yourCar.company);
		
		System.out.println("===Korean Class를 활용한 객체 생성===");
		
		Korean k1 = new Korean("박자바", "011225-1234567");
		System.out.println(k1.nation);
		System.out.println(k1.name);
		System.out.println(k1.ssn);
		
		
		System.out.println("=== 생성자 오버로딩 활용한 객체 생성 ===");
		
		// 매개변수가 하나인 생성자 활용
		Car oneCar = new Car("소나타");
		System.out.println("oneCar의 필드 name : " + oneCar.name);
		oneCar.run();
		System.out.println(oneCar.info());
		
//		Car threeCar = new Car("그랜저", 3000, "현대");
//		System.out.println("ThreeCar의 이름 : " + threeCar.name);
//		System.out.println("ThreeCar의 가격 : " + threeCar.price);
//		System.out.println("ThreeCar의 제조사 : " + threeCar.company);
	}
}
