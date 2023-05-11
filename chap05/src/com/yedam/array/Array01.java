package com.yedam.array;

public class Array01 {
	public static void main(String[] args) {
		
		// 값 목록 활용해서 배열 만들기
		// 총  6개의 데이터를 담을 수 있는 배열 -> 데이터를 배열의 각 공간에 입력
		
		// 배열 생성과 동시에 데이터 입력
		int[] intAry = {1,2,3,4,5,6};
		
		// 배열 생성만, 데이터 나중에 입력
		int[] intAry2 = new int[6];
		//		intAry2[0] = 1;
		//		intAry2[1] = 2;
		//		intAry2[2] = 3;
		//		intAry2[3] = 4;
		//		intAry2[4] = 5;
		//		intAry2[5] = 6;
		
		// 문자열 배열 생성
		String[] strAry = new String[10];
		
		System.out.println("intAry2의 첫번째 값 : " + intAry2[0]);
		System.out.println("strAry의 첫번째 값 : " + strAry[1]);
		System.out.println("intAry의 세번째 값 : " + intAry[2]);
		
		// 반복문과 배열
		int[] score = {83, 90, 97};
		int sum = 0;
		for(int i = 0; i < score.length; i++) {
			System.out.println(score[i]);
			sum += score[i];
		} System.out.println("score의 합계 : " + sum);
		
		// new 연산자 활용한 배열 생성
		int[] point;
		point = new int[] {1,2,3};
		
		// 데이터 입력 X
		int[] arr1 = new int[3];
		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		arr1[0] = 10;
		arr1[1] = 20;
		arr1[2] = 30;

		for (int i = 0; i < arr1.length; i++) {
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		// 참조 객체 String 배열
		String[] arr2 = new String[3];
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
		arr2[0] = "3월";
		arr2[1] = "11월";
		arr2[2] = "1월";
		
		for (int i = 0; i < arr2.length; i++) {
			System.out.println("arr2[" + i + "] : " + arr2[i]);
		}
		
	}
}
