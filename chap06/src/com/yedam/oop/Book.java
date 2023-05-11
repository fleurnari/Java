package com.yedam.oop;

public class Book {

	// 필드 : 책 이름, 책 종류, 가격, 도서번호, 출판사
	String name;
	String category;
	String price;
	String no;
	String publisher;
	
	// 생성자1 : 기본 생성자, 생성자 2 : 모든 데이터를 받아오는 생성자
	
	Book() {
		
	}
	
	Book(String name, String category, String price, String no, String publisher) {
		this.name = name;
		this.category = category;
		this.price = price;
		this.no = no;
		this.publisher = publisher;
	}
	
	
	// 메소드 : 모든 정보를 출력할 수 있는 getInfo()
	void getInfo() {
		System.out.println("책 이름 : " + name);
		System.out.println("# 내용");
		System.out.println("1) 종류 : " + category);
		System.out.println("2) 가격 : " + price);
		System.out.println("3) 출판사 : " + publisher);
		System.out.println("4) 도서번호 : " + no);
		
	}
	
	
}
