package com.yedam.loop;

public class ForLoop2 {
	public static void main(String[] args) {
		
		// 중첩 for 문
		//		for() {
		//			for() {
		//				
		//			}
		//		}

		// 2단 ~ 9단 출력
		for (int i = 2; i <= 9; i++) {
			System.out.println("====== " + i + "단" + " ======");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + " * " + j + " = " + (i * j));
			}
		}
		
		// 별 찍기
		//		*
		//		**
		//		***
		//		****
		//		*****

		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 5; i >= 0; i--) {
			for(int j = i; j > 0; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
