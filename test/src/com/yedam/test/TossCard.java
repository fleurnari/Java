package com.yedam.test;

public class TossCard extends Card {
	// 필드
	public String company = "Toss";
	public String cardStaff;
	
	// 생성자
	public TossCard(String cardNo, String validDate, String cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	// 메소드
	@Override
	public void showCardInfo() {
		System.out.println("카드정보 - Card NO, " + cardNo);
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

}
