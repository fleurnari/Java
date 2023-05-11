package com.yedam.condition;

import java.util.Scanner;

public class SwitchCondition {

	public static void main(String[] args) {
		
		int number = (int)(Math.random() * 6) + 1;
		
		switch(number) {
		case 1:
			System.out.println("주사위 1");
			break;

		case 2:
			System.out.println("주사위 2");
			break;

		case 3:
			System.out.println("주사위 3");
			break;

		case 4:
			System.out.println("주사위 4");
			break;

		case 5:
			System.out.println("주사위 5");
			break;

		case 6: // default
			System.out.println("주사위 6");
			break;	
		}
		
		// char
		char grade = 'B';
		String grade2 = "b";
		
		switch(grade2) {
		case "A" :
			System.out.println("우수 회원");
			break;
		case "B" :
		case "b" :
			System.out.println("일반 회원");
			break;
		default:
			System.out.println("나가");
			break;
		}
		
		// 입력한 성적을 등급으로 표현
		Scanner sc = new Scanner(System.in);
		
		System.out.println("성적 입력 >");
		
		// 0 ~ 100
		// 90 이상 A (95 이상 A+) / 80 이상 B (85 이상 B+) / 70 이상 C (75 이상 C+) / 70 미만 D
	
		int score = Integer.parseInt(sc.nextLine());
		
		switch(score / 10) {
		 case 9:
			 if (score >= 95) {
				System.out.println("A+"); 
			 } else {
				System.out.println("A");
			 }
			 break;
			 
		 case 8:
			 if (score >= 85) {
				System.out.println("B+"); 
			} else {
				System.out.println("B");
			}
			 break;
			 
		 case 7:
			 if (score >= 75) {
				System.out.println("C+"); 
			} else {
				System.out.println("C");
			}
			 break;
			 
		 default:
			 System.out.println("D");
		}
	
		// 메뉴 선택
		System.out.println("1. 글 보기 2. 글 수정 3. 글 삭제 4. 뒤로 가기");
		
		int selectNo = Integer.parseInt(sc.nextLine());
		
		switch(selectNo) {
			case 1:
				System.out.println("글 보기");
				break;
			case 2:
				System.out.println("글 수정");
				break;
			case 3:
				System.out.println("글 삭제");
				break;
			case 4:
				System.out.println("뒤로 가기");
				break;
		}
	}
	
	
}
