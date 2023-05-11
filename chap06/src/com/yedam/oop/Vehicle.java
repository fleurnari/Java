package com.yedam.oop;

public class Vehicle {

	// 필드
	int gas;
	
	// 메소드
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if (gas == 0) {
			System.out.println("가스 없어");
			return false;
		}
		
		System.out.println("가스 있어");
		return true;
	}
	
	void run() {
		while (true) {
			if (gas > 0) {
				System.out.println("달려 (gas 잔량 : " + gas + ")");
				gas -= 1;
			} else {
				System.out.println("멈춰 (gas 잔량 : " + gas + ")");
				return; // 메소드 강제 종료
			}
		}
	}
	
}
