package com.yedam.homework;

import java.util.Scanner;

public class Application03 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		boolean run = true;
		StringGame game = new StringGame();
		int randomNo = (int)(Math.random() * 4) + 1;
		
		if (randomNo == 1) {
			game.word = "Orange";
		} else if (randomNo == 2) {
			game.word = "Game";
		} else if (randomNo == 3) {
			game.word = "Phone";
		} else {
			game.word = "Smart";
		}
		
		System.out.println(game.word);
		
		while(run) {
			System.out.println("---------------------------------------------");
			System.out.println(" 1.문자하나 | 2.단어 | 3.입력내역 | 4.새 게임 | 5.종료 ");
			System.out.println("---------------------------------------------");
			int menu = sc.nextInt();
			
			switch(menu) {
			case 1:
				game.setCharData();
				break;
//			case 2:
//				game.setStrData();
//				break;
//			case 3:
//				game.showCharData();
//				break;
//			case 4:
//				game.init();
//				break;
			case 5:
				run = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못된 메뉴를 입력하셨습니다.");
			
			}
		}
	}

}
