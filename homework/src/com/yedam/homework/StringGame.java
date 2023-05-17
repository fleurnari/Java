package com.yedam.homework;

import java.util.ArrayList;
import java.util.Scanner;

public class StringGame {
	
	// 필드
	public String word;
	
	public StringGame() {
		int randomNo = (int)(Math.random() * 4) + 1;
		
		if (randomNo == 1) {
			this.word = "orange";
		} else if (randomNo == 2) {
			this.word = "game";
		} else if (randomNo == 3) {
			this.word = "phone";
		} else {
			this.word = "smart";
		}
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	ArrayList<String> strArry = new ArrayList<String>();

	// 메소드
	public void setCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		if (strArry.size() == 0) {
			System.out.println();
		} else {
		for (int i = 0; i < strArry.size(); i++) {
			System.out.print(strArry.get(i) + " ");
			}
		System.out.println();
		}
		System.out.print("입력 값>>");
		String data = sc.nextLine();
		strArry.add(data);
		
		int existData = 0;
		for (int i = 0; i < word.length(); i++) {
			if (data.equals(String.valueOf(word.charAt(i)))) {
				existData++;
			}
		}
		if (existData >= 1) {
			System.out.println("문자열을 구성하는 문자입니다.");
		} else {
			System.out.println("문자열을 구성하는 문자가 아닙니다.");
		}
	}
	
	public void setStrData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		if (strArry.size() == 0) {
			System.out.println();
		} else {
		for (int i = 0; i < strArry.size(); i++) {
			System.out.print(strArry.get(i) + " ");
			}
		System.out.println();
		}
		System.out.print("입력 값>>");
		String ansWord = sc.nextLine();
		if (ansWord.equals(word)) {
			System.out.println("정답입니다.");
		} else if (ansWord.length() != word.length()) {
			System.out.println("입력한 문자열의 길이가 정답과 다릅니다.");
		} else {
			for (int i = 0; i < ansWord.length(); i++) {
				if (ansWord.charAt(i) == word.charAt(i)) {
					System.out.print("O ");
				} else {
					System.out.print("X ");
				}
			} System.out.println();
		}
		
	}
	
	public void showCharData() {
		System.out.println("현재까지 확인된 문자열의 문자들은 다음과 같습니다.");
		if (strArry.size() == 0) {
			System.out.println();
		} else {
		for (int i = 0; i < strArry.size(); i++) {
			System.out.print(strArry.get(i) + " ");
			}
		System.out.println();
		}
	}
	
	public void init() {
		StringGame game = new StringGame();
		strArry.clear();
	}

}
