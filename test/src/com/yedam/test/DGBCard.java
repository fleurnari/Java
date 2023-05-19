package com.yedam.test;

public class DGBCard extends Card {
	// 필드
	public String company = "대구은행";
	public String cardStaff;
	
	public DGBCard(String cardNo, String validDate, String cvc, String cardStaff) {
		super(cardNo, validDate, cvc);
		this.cardStaff = cardStaff;
	}
	
	// 메소드
	@Override
	public void showCardInfo() {
		super.showCardInfo();
		System.out.println("담당직원 - " + cardStaff + ", " + company);
	}

	
}
