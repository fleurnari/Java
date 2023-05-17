package com.yedam.homework;

import java.util.Scanner;

public class StringGame {
	
	public String word;
	
	
	Scanner sc = new Scanner(System.in);
	
	public void setCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		System.out.println();
		System.out.println("입력 값>>");
		String data = sc.nextLine();
		int existData = 0;
		
		for (int i = 0; i < word.length(); i++) {
			if (String.valueOf(word.charAt(i)) == data) {
				existData++;
			}
		}
		
		if (existData >= 1) {
			System.out.println("문자열을 구성하는 문자입니다.");
		} else {
			System.out.println("문자열을 구성하는 문자가 아닙니다.");
		}
	}

}
