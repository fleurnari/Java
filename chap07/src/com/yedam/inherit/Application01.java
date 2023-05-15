package com.yedam.inherit;

public class Application01 {
	public static void main(String[] args) {
		SmartPhone sp  = new SmartPhone("아이폰", "스그", "SK");
		
		// CellPhone(부모)
		System.out.println("모델 : " + sp.model);
		System.out.println("색상 : " + sp.color);
		
		// SmartPhone(자식)
		System.out.println("통신사 : " + sp.agency);
		
		// CellPhone(부모)
		sp.powerOn();
		sp.bell();
		sp.hangUp();
		sp.powerOff();
		
		// SmartPhone(자식)
		sp.kakaoExe();
		sp.kakaoExit();
		sp.Info();
		
	}
	
}
