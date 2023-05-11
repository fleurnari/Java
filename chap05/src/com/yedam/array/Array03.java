package com.yedam.array;

import java.util.Arrays;

public class Array03 {
	public static void main(String[] args) {
		// 2차원 배열
		// 계단식 배열
		int[][] intAry = { {1,2} , {1, 2, 3} };
		
		// intAry[0] -> 1,2
		// intAry[1] -> 1,2,3
		
		int[][] mathScore = new int[2][3];
		System.out.println("mathScore length : " + mathScore.length);
		
		for(int i = 0; i < mathScore.length; i++) {
			for(int j = 0; j < mathScore[i].length; j++) {
				System.out.print(" mathScore[" + i + "][" + j + "] = "  + mathScore[i][j]);
			}
			System.out.println();
		}
		
		// 이차원 배열 구구단 저장
		int[][] gugu = new int[8][9];
		
		// 단수 for문
		for(int i = 2; i < 10; i++) {
			// 곱셈
			for (int j = 1; j < 10; j++) {
				gugu[i - 2][j - 1] = i * j; 
			}
		}
		
		// 구구단 배열 출력
		for(int i = 0; i < gugu.length; i++) {
			System.out.println((i + 2) + "단 : ");
			// 배열.toString() : 배열 정보 출력
			System.out.println(Arrays.toString(gugu[i]));
			System.out.println();
		}
		
		// 참조 타입 배열
		String[] strAry = new String[3];
		strAry[0] = "yedam";
		strAry[1] = "yedam";
		strAry[2] = new String("yedam");
		
		// 주소값 비교
		System.out.println(strAry[0] == strAry[1]);
		System.out.println(strAry[0] == strAry[2]);
		
		// 데이터 비교
		System.out.println(strAry[0].equals(strAry[2]));
		
		// 배열 복사
		int[] oldAry = {1, 2, 3};
		int[] newAry = new int[5];
		
		System.out.println("배열 복사");
		
		for(int i = 0; i < oldAry.length; i++) {
			newAry[i] = oldAry[i];
		}
		
		for(int i = 0; i < newAry.length; i++) {
			System.out.println(newAry[i]);
		}
		
		// arrayCopy
		
		int[] oldAry2 = {1,2,3,4,5,6,7};
		int[] newAry2 = new int[10];
		
		System.arraycopy(oldAry2, 1, newAry2, 1, oldAry2.length - 1);
		System.out.println("배열 복사 2");
		for(int i = 0; i < newAry2.length; i++) {
			System.out.println(newAry2[i]);
		}
		
		// 향상된 for문
		for(int temp : newAry2) {
			System.out.print(temp + "\t");
		}
		
		
		
		
	}
}
