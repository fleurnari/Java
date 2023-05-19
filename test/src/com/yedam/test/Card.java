package com.yedam.test;

public class Card {

	// 필드
	public String cardNo;
	public String validDate;
	public String cvc;
	
	// 생성자
	public Card(String cardNo, String validDate, String cvc) {
		this.cardNo = cardNo;
		this.validDate = validDate;
		this.cvc = cvc;
	}

	public String getCardNo() {
		return cardNo;
	}

	public String getValidDate() {
		return validDate;
	}

	public String getCvc() {
		return cvc;
	}
	
	// 메소드
	public void showCardInfo() {
		System.out.println("카드 정보 ( Card No : " + cardNo + ", 유효기간 : " + validDate + 
						   ", CVC : " + cvc + " )");
	}
	
	
	
}
