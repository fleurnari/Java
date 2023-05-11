package com.yedam.loop;

import java.util.Scanner;

public class ForLoop {

	public static void main(String[] args) {
		
//		// for문
//		// 1 ~ 100까지의 수 출력
//		for(int i = 1; i <= 100; i++) {
//			System.out.println(i);
//		}
//		
//		int result = 0;
//		
//		for (int i = 1; i <= 100; i++) {
//			result += i;
//		}
//		System.out.println("1 ~ 100 사이의 합 : " + result);
//		
//		// 1 ~ 100 사이의 짝수, 홀수 구하기
//		for(int i = 1; i <= 100; i++) {
//			if (i % 2 == 0) {
//				System.out.println(i + "는 짝수");
//			} else if (!(i % 2 == 0)){
//				System.out.println(i + "는 홀수");
//			}
//		}
//		
//		// 입력한 숫자에 대한 구구단 출력
//		Scanner sc = new Scanner(System.in);
//		System.out.println("숫자 입력 >");
//		int num = Integer.parseInt(sc.nextLine());
//		
//		for(int i = 1; i <= 9; i++) {
//			System.out.printf("%d * %d = %d\n", num, i, num * i);
//		}

		// 입력한 값에 대한 총합, 평균, 최대값, 최소값 구하기
//		Scanner sc = new Scanner(System.in);
//		System.out.println("몇 번 반복할지 입력하세요.");
//		int count = Integer.parseInt(sc.nextLine());
//		
//		int total = 0;
//		int max = 0;
//		int min = 0;
//		
//		for(int i = 0; i < count; i++) {
//			System.out.println("데이터를 입력하세요.");
//			int data = Integer.parseInt(sc.nextLine());
//			total += data;
//			if (i == 0) {
//				max = data;
//				min = data;
//			} else {
//				 if (max < data) {
//					max = data;
//			 }
//				 if (min > data) {
//					min = data;
//				}
//			 }
//		}
//		
//		System.out.println("합계 : " + total);
//		System.out.printf("평균 : %5.2f\n", (double)total / count);
//		System.out.println("최대값 : " + max + " 최소값 : " + min);
			
		
		Scanner sc = new Scanner(System.in);
		int randomNo = (int)(Math.random() * 100) + 1;
		System.out.println("임의의 숫자 : " + randomNo);
		
		for(int i = 1; i <= 5; i++) {
			System.out.println("숫자를 입력하세요.");
			int data = Integer.parseInt(sc.nextLine());
			if (data == randomNo) {
				System.out.printf("축하합니다. %d 번만에 맞추셨습니다.", i);
				break;
			} else if (data < randomNo) {
					System.out.println("Up");
				}
			  else if (data > randomNo) {
					System.out.println("down");
				}
				if (i == 5) {
					System.out.printf("모든 기회를 소진 하셨습니다. 정답 : %d", randomNo);
					break;
				}
			}
			
		}
	}
	

