package com.yedam.inherit;

public class Application03 {
	public static void main(String[] args) {
		int r = 10;
		
		Computer com = new Computer();
		System.out.println("원 면적 : " + com.areaCircle(r));
		
		Child child = new Child();
		
		// 부모 객체
//		child.getInfo();
//		child.method1();
//		child.method2();
//		
//		// 자식 객체
//		child.method3();

		
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly();
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
		
	}
}
