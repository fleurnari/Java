package com.yedam.oop;

public class Application02 {
	public static void main(String[] args) {
		
		Vehicle vehicle = new Vehicle();
		
		vehicle.setGas(5);
		
		boolean gasState = vehicle.isLeftGas();
		if (gasState) {
			System.out.println("출발");
			vehicle.run();
		}
		
		if (vehicle.isLeftGas()) {
			System.out.println("가스 필요 없어");
		} else {
			System.out.println("가스 넣어");
		}
		
	}

}
