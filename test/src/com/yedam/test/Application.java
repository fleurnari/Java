package com.yedam.test;

public class Application {
	public static void main(String[] args) {
		
		// 문제 1
		Person person1 = new Person("940404-2345678", "김치킨", "실리콘밸리");
		System.out.println("주민등록번호 : " + person1.ssn + " 이름 : " + person1.name + " 주소 : " + person1.address);
		
		Person person2 = new Person();
		person2.setSsn("123456-1234567");
		person2.setName("박피자");
		person2.setAddress("벤쿠버");
		System.out.println("주민등록번호 : " + person2.getSsn() + " 이름 : " + person2.getName() + " 주소 : " + person2.getAddress());
		
		// 문제 2
		Card card1 = new Card("5432-4567-9534-3657", "20251203", "253");
		card1.showCardInfo();
		Card card2 = new TossCard("5432-4567-9534-3657", "20251203", "253", "신빛용");
		card2.showCardInfo();
		Card card3 = new DGBCard("5432-4567-9534-3657", "20251203", "253", "신빛용");
		card3.showCardInfo();
		
		
		// 문제 3
		int price = 10000;
		
		Payment card = new CardPayment(0.08);
		card.showInfo();
		System.out.println("온라인 결제 금액 : " + card.online(price));
		System.out.println("오프라인 결제 금액 : " + card.offline(price));
	
		Payment simple = new SimplePayment(0.05);
		simple.showInfo();
		System.out.println("온라인 결제 금액 : " + simple.online(price));
		System.out.println("오프라인 결제 금액 : " + simple.offline(price));
	
	
		
	}
}
