package com.yedam.homework;

public class ObesityInfo extends StandardWeightInfo {

	public ObesityInfo(String name, int height, int weight) {
		super(name, height, weight);
	}
	
	@Override
	public void getInformation() {
		double bmi = getObesity();
		String bmiCheck;
		
		if (bmi < 18.5) {
			bmiCheck = "저체중";
		} else if (bmi < 23) {
			bmiCheck = "정상";
		} else if (bmi < 25) {
			bmiCheck = "과체중";
		} else {
			bmiCheck = "비만";
		}
		
		
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight +
		           ", "  + bmiCheck + "입니다.");
	}
	
	public double getObesity() {
		double bmi = (weight - getStandardWeight()) / getStandardWeight() * 100;
		return bmi;
	}
	
	
}
