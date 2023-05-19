package com.yedam.test;

import java.util.Scanner;

public class 신나리 {
	public static void main(String[] args) {
		
		// 문제 1
		
		int a = 10;
		double b = 2.0;
		
		System.out.println("a + b = " + (int)(a + b));
		System.out.println("a - b = " + (int)(a - b));
		System.out.println("a * b = " + (int)(a * b));
		System.out.println("a / b = " + (int)(a / b));
		
		// 문제 2
		
		int num1 = 10;
		int num2 = 20;
		boolean result;
		
		result = ((num1 > 10) && (num2 > 10));
		System.out.println(result); // (1) false

		result = ((num1 > 10) || (num2 > 10));
		System.out.println(result); // (2) true
		System.out.println(!result); // (3) false
		
		// 문제 3
		
		// 큰 금액부터 동전을 우선적으로 거슬러 줘야 한다.
		int[] coinUnit = {500, 100, 50, 10};
		int money = 2680;
		System.out.println("money = " + money);	
		for(int i = 0; i < coinUnit.length; i++) {
			int coinNum = money / coinUnit[i];
			money = money - (coinUnit[i] * coinNum);
			System.out.print(coinUnit[i] + "원 : " + coinNum + "개, ");
		}
		
		System.out.println();
		
		// 문제 4
		Scanner sc = new Scanner(System.in);
		System.out.println("출력할 단을 입력하세요.");
		int num = Integer.parseInt(sc.nextLine());
		
		for (int i = 1; i <= num; i++) {
			System.out.println(num + " * " + i + " = " + num * i);
		}
		
		// 문제 5
		int[] diceArry = null;
		
		int diceNum = 0;
		
		
		while(true) {
			System.out.println("=== 1. 주사위 크기 2. 주사위 굴리기 3. 결과 보기 4. 가장 많이 나온 수 5. 종료 ===");
			System.out.println("메뉴 > ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if (selectNo == 1) {
				System.out.println("주사위 크기 >");
				diceNum = Integer.parseInt(sc.nextLine());
				if (diceNum < 5 || diceNum > 10) {
					System.out.println("주사위 크기는 5~10까지 설정할 수 있습니다.");
				}
				
				} else if (selectNo == 2) {
					diceArry = new int[diceNum];
					int diceCount = 0;
					while (true) {
						diceArry[(int)(Math.random() * diceNum)]++;
						diceCount++;
						if (diceArry[4] != 0) {
							break;
						}
					} System.out.println("5가 나올 때까지 주사위를 " + diceCount + "번 굴렸습니다.");
					
				} else if (selectNo == 3) {
					for (int i = 0; i < diceArry.length; i++) {
						System.out.println((i + 1) + "은 " + diceArry[i] + "번 나왔습니다.");
					}
				} else if (selectNo == 4) {
					int maxNum = 0;
					for (int i = 1; i < diceArry.length; i++) {
						if (diceArry[maxNum] < diceArry[i]) {
							maxNum = i;
						}
						
					} System.out.println("가장 많이 나온 수는 " + (maxNum + 1) + "입니다.");
				} else if (selectNo == 5) {
					System.out.println("프로그램 종료");
					break;
				} else {
					System.out.println("잘못 입력 했습니다.");
				}
			}
			
		}
		
	}


