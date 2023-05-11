package com.yedam.condition;

import java.util.Scanner;

public class ifCondition {

	public static void main(String[] args) {
		
		int score = 93;
		
		// if문 1개
		if (score >= 90) {
			System.out.println("A");
		}
		
		// if-else
		if (score >= 90) {
			System.out.println("90 이상");
		} else {
			System.out.println("90 미만");
		}
		
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else {
			System.out.println("D");
		}
		
		if (score < 70) {
			System.out.println("D");
		} else if (score < 80) {
			System.out.println("C");
		} else if (score < 90) {
			System.out.println("B");
		} else {
			System.out.println("A");
			
		}
		
		// random() 값 추출
		// Random() / Math.random()
		// 0 <= Math.random() < 1 : 실수 (0 ~ 0.9xxxxxxxxxxxx)
		// 1 ~ 10 사이 데이터 랜덤 추출
		// 0 * 10 <= Math.random() * 10 < 1 * 10
		// double -> int 소수점 삭제
		// (int) 0 <= (int) Math.random() * 10 < (int) 10
		// (int) 0 + 1 <= (int)Math.random() * 10 + 1 < (int) 10 + 1
		
		// 주사위 번호 뽑기 (1 ~ 6)
		// 0 <= x < 1
		// 0 * 6 < x * 6 < 1 * 6
		// (int) 0 <= (int) x * 6 < (int) 6
		// (int) 0 + 1 <= (int) x * 6 + 1 < (int) 6 + 1
		
		int number = (int)(Math.random() * 6) + 1;
		if (number == 1) {
			System.out.println("주사위 1");
		} else if (number == 2) {
			System.out.println("주사위 2");
		} else if (number == 3) {
			System.out.println("주사위 3");
		} else if (number == 4) {
			System.out.println("주사위 4");
		} else if (number == 5) {
			System.out.println("주사위 5");
		} else {
			System.out.println("주사위 6");
		} 
			
		// 중첩 if : 하나의 데이터를 여러 번 조건 확인 할 때
		//		if (조건식) {
		//			실행문
		//			if (조건식) {
		//				실행문
		//				if (조건식) {
		//				  실행문
		//					
		//				}
		//			}
		//		}
		
		
		int no = 10;
		if (no % 2 == 0) {
			if (no % 5 == 0) {
				if (no % 10 == 0) {
					System.out.println("2,5,10의 배수");
				}
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("점수 입력 >");
		score = Integer.parseInt(sc.nextLine());
		String grade = "";
		
		if (score >= 90) {
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		}
		System.out.println("학점 : " + grade);
	}
}
