package com.yedam.array;

import java.util.Scanner;

public class Array02 {
	public static void main(String[] args) {
//		int[] intAry = new int[10];
//		
//		System.out.println("intAry의 길이 : " + intAry.length);
//		
//		for(int i = 0; i < intAry.length; i++) {
//			System.out.println(intAry[i]);
//		}
		
//		Scanner sc = new Scanner(System.in);
		
//		// 배열
//		int[] ary;
//		// 배열의 크기
//		int no;
//		
//		System.out.println("배열의 크기>");
//		no = Integer.parseInt(sc.nextLine());
//		
//		ary = new int[no];
//		
//		System.out.println(ary.length);
//		
//		// 데이터 입력
//		for(int i = 0; i < ary.length; i++) {
//			System.out.println("입력>");
//			int data = Integer.parseInt(sc.nextLine());
//			ary[i] = data;
//		}
//		
//		for(int i = 0; i < ary.length; i++) {
//			System.out.println(ary[i]);
//		}
//		
//		// 점수 데이터를 담는 배열
//		int[] point = new int[3];
//		
//		System.out.println("영어 점수를 입력하세요.");
//		point[0] = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("수학 점수를 입력하세요.");
//		point[1] = Integer.parseInt(sc.nextLine());
//		
//		System.out.println("복싱 점수를 입력하세요.");
//		point[2] = Integer.parseInt(sc.nextLine());
//		
//		// 1) 점수의 총 합
//		int sum = 0;
//		for (int i = 0; i < point.length; i++) {
//			sum += point[i];
//		}
//		System.out.println("점수의 총 합계 : " + sum);
//		
//		// 2) 평균
//		double avg = (double)sum / point.length;
//		System.out.println("평균 : " + avg);
		
		
		// 입력 받은 데이터의 갯수의 총합, 평균, 최대, 최소값 구하기
		
//		int[] intAry2;
//		int num;
//		
//		System.out.println("데이터 갯수를 입력하세요.");
//		num = Integer.parseInt(sc.nextLine());
//		intAry2 = new int[num];
//		
//		int total = 0;
//		int maxNum = 0;
//		int minNum = 0;
//		
//		
//		for(int i = 0; i < intAry2.length; i++) {
//			System.out.println((i + 1) + "번째 데이터를 입력하세요.");
//			intAry2[i] = Integer.parseInt(sc.nextLine());
//			total += intAry2[i];
//			
//			if (i == 0) {
//				maxNum = intAry2[i];
//				minNum = intAry2[i];
//			}
//			if (maxNum < intAry2[i]) {
//				maxNum = intAry2[i];
//			}
//			if (minNum > intAry2[i]) {
//				minNum = intAry2[i];
//			}
//
//		}
//		
//		System.out.println("데이터의 총 합 : " + total);
//		System.out.println("데이터의 평균값 : " + (double)total / intAry2.length);
//		System.out.println("데이터의 최대값 : " + maxNum + " 데이터의 최소값 : " + minNum);
		
		// 201p 6번 문제
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("--------------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = Integer.parseInt(scanner.nextLine());
			

			if (selectNo == 1) {
				System.out.println("학생수>");
				studentNum = Integer.parseInt(scanner.nextLine());
				
			} else if (selectNo == 2) {
				scores = new int[studentNum];
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>");
					scores[i] = Integer.parseInt(scanner.nextLine());
				}
				
			} else if (selectNo == 3) {
				for (int i = 0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);				
				}
				
			} else if (selectNo == 4) {
				
				int total = 0;
				int maxNum = scores[0];
				
				for(int i = 0; i < scores.length; i++) {
					total += scores[i];
					if (maxNum < scores[i]) {
						maxNum = scores[i];
					}
				}
				
				System.out.println("최고 점수 : " + maxNum);
				System.out.println("평균 점수 : " + (double)total / scores.length);
				
			} else if (selectNo == 5) {
				run = false;
			}
		}
		
		System.out.println("프로그램 종료");
		
		int[] answer = {1,4,4,3,1,4,4,2,1,3,2};
		int[] counter = new int[4];
		
		for(int i = 0; i < answer.length; i++) {
			counter[answer[i] - 1]++;
			} 
		
		for(int i = 0; i < counter.length; i++) {
			for (int j = 0; j < counter[i]; j++) {
				System.out.print("*");
			}
			System.out.println();

		}
	}
}

