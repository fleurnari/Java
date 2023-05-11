package com.yedam.print;

import java.io.IOException;
import java.util.Scanner;

public class KeyCode {

	public static void main(String[] args) throws IOException {
		
//		System.out.println("입력>");
//		
//		int keyCode = 0;
//		
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
//		
//		keyCode = System.in.read();
//		System.out.println("KeyCode : " + keyCode);
		
		// Scanner
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("입력>");
		
		// 문자열 읽기
		// nextLine() : enter 기준으로 엔터 입력 이전까지의 데이터를 받아옴
		String inputData = scanner.nextLine();
		// 정수 읽기
		int data = scanner.nextInt(); // 엔터 값이 남아 있음
		// 엔터키 소멸
		scanner.nextLine();
		
		inputData = scanner.nextLine();
		System.out.println("Scanner 활용 => " + inputData);
		
		// 데이터 비교 : 입력한 값 == 저장된 값 비교
		// 기본 타입(정수, 실수) 비교 : ==
		// 문자열 비교 : equals
		
		if(inputData.equals("yedam")) {
			System.out.println("일치합니다.");
		} else {
			System.out.println("나가");
		}
		
	}
}
