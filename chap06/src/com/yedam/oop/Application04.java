package com.yedam.oop;

import java.util.Scanner;

public class Application04 {
	public static void main(String[] args) {
		// 객체 배열
		// Book Class
		Book[] bookAry = new Book[10];
		
		// 객체 생성해서 저장
		Book b1 = new Book("혼자 공부하는 자바", "학습서", "24000원", "0001", "한빛 미디어");
		bookAry[0] = b1;
		System.out.println(b1);
		System.out.println(bookAry[0]);

		// 배열의 공간에 바로 객체 생성
		bookAry[1] = new Book("자바스크립트", "학습서", "15000원", "0002", "어포스트");

		// 객체 배열
		// 책들의 정보를 저장하는 프로그램
		// 1. 책 권수 입력 / 2. 책 정보 입력 / 3. 책 정보 확인 / 4. 종료
		
		// 책 정보 보관 배열
		Book[] bookAry2 = null;
		
		// 책 권수 입력
		int bookNum = 0;
		
		// 데이터 입력 받을 스캐너
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("========================================");
			System.out.println("1. 책 수 | 2. 정보 입력 | 3. 정보 확인 | 4. 종료");
			System.out.println("========================================");
			
			String selectNo = sc.nextLine();
			
			if (selectNo.equals("1")) {
				System.out.println("책 수>");
				bookNum = Integer.parseInt(sc.nextLine());
				
			} else if (selectNo.equals("2")) {
				bookAry2 = new Book[bookNum];
				// 책 정보 입력
				for(int i = 0; i < bookAry2.length; i++) {
					// 객체를 생성하고 배열에 저장
					Book book = new Book();
					System.out.println("책 제목>");
					book.name = sc.nextLine();
					System.out.println("책 종류>");
					book.category = sc.nextLine();
					System.out.println("책 가격>");
					book.price = sc.nextLine();
					System.out.println("도서 번호>");
					book.no = sc.nextLine();
					System.out.println("출판사>");
					book.publisher = sc.nextLine();
					
					bookAry2[i] = book;
				}
			} else if (selectNo.equals("3")) {
				for(int i = 0; i < bookAry2.length; i++) {
					System.out.println((i+1) + "번째 책 정보====");
					bookAry2[i].getInfo();
					System.out.println();
				}
			} else if (selectNo.equals("4")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력했다");
			}
		}
		
		
	}
}
