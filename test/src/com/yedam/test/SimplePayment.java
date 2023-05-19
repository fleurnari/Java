package com.yedam.test;

public class SimplePayment implements Payment {
	// 필드
	public double simplePaymentRatio;
	
	// 생성자
	public SimplePayment(double simplePaymentRatio) {
		this.simplePaymentRatio = simplePaymentRatio;
	}

	@Override
	public int online(int price) {
		return price - (int)(price * (simplePaymentRatio + ONLINE_PAYMENT_RATIO));
	}

	@Override
	public int offline(int price) {

		return price - (int)(price * (simplePaymentRatio + OFFLINE_PAYMENT_RATIO));
	}

	@Override
	public void showInfo() {
		System.out.println("*** 간편결제 시 할인 정보");
		System.out.println("온라인 결제시 총 할인율 : " + (simplePaymentRatio + ONLINE_PAYMENT_RATIO));
		System.out.println("오프라인 결제시 총 할인율 : " + (simplePaymentRatio + OFFLINE_PAYMENT_RATIO));
	}
	


	
}
