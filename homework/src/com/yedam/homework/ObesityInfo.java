package com.yedam.homework;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInformation() {
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight +
		           ",  "  + getObesity() + "입니다.");
	}
	
	public double getObesity() {
		double bmi = (weight - (height - 100) * 0.9) / ((height - 100) * 0.9 / 100);
		
		if (bmi <= 18.5) {
			System.out.print("저체중");
		} else if (bmi <= 22.9) {
			System.out.print("정상");
		} else if (bmi <= 24.9) {
			System.out.print("과체중");
		} else {
			System.out.print("비만");
		}
		
		return bmi;
	}
	
	
}
