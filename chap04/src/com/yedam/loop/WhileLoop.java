package com.yedam.loop;

import java.util.Scanner;

public class WhileLoop {

	public static void main(String[] args) {
		
//		int i = 1;
//		while (i <= 100) {
//			if(i % 2 == 0) {
//				System.out.println(i);
//			}
//			i++;
//		}
//		
//		// 계산기 프로그램
//		// 무한 루프, 어떠한 조건을 만나면 프로그램 종료
//		
//		boolean run = true;
		Scanner sc = new Scanner(System.in);
//		
//		
//		while(run) {
//			System.out.println("1. 덧셈 | 2. 뺄셈 | 3. 곱셈 | 4. 종료");
//			System.out.println("입력 >");
//			
//			int num = Integer.parseInt(sc.nextLine());
//			switch(num) {
//			case 1:
//				System.out.println("더하고자 하는 두 수 입력");
//				System.out.println("1번째 값 >");
//				int num1 = Integer.parseInt(sc.nextLine());
//				System.out.println("2번째 값>");
//				int num2 = Integer.parseInt(sc.nextLine());
//				
//				System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
//				break;
//			case 2:
//				break;
//			case 3:
//				break;
//			case 4:
//				System.out.println("종료");
//				run = false;
//				break;
//			}
//			
////			if (num == 1) {
////				
////			} else if (num == 2) {
////				
////			} else if (num == 4) {
////				System.out.println("종료");
////				break;
////			}
//			
//			
//		}
		
		// 오락실 만들기
//		System.out.println("=== Insert Coin ===");
//		int money = Integer.parseInt(sc.nextLine());
//		
//		while (money > 500) {
//			System.out.println((money / 500) + "번의 기회가 있습니다.");
//			System.out.println("1. 킥복싱 | 2. 주짓수 | 3. 종료");
//			
//			System.out.println("메뉴 입력>");
//			int gameNo = Integer.parseInt(sc.nextLine());
//			
//			switch(gameNo) {
//			case 1:
//				System.out.println("킥복싱 진행");
//				money -= 500;
//				break;
//			case 2:
//				System.out.println("주짓수 진행");
//				money -= 500;
//				break;
//			case 3:
//				System.out.println("종료합니다.");
//				money = 0;
//				break;
//			}
//			
//		}
		
		int month;
		
		do {
			System.out.println("올바른 월을 입력하세요. [1 ~ 12]");
			month = sc.nextInt();
		} while (month < 1 || month > 12);
		
		System.out.println("사용자가 입력한 월은 " + month);
		
	}
}
