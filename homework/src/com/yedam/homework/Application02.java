package com.yedam.homework;

import java.util.Scanner;

public class Application02 {

	public static void main(String[] args) {
		
		// 문제 1
		System.out.println("=====문제1=====");
		Keypad rpg = new RPGgame();
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		System.out.println("======================");
		Keypad ac = new ArcadeGame();
		ac.leftUpButton();
		ac.rightUpButton();
		ac.leftDownButton();
		ac.changeMode();
		ac.rightUpButton();
		ac.leftUpButton();
		ac.rightDownButton();
		
		
		// 문제 2
		System.out.println("=====문제2=====");
		Notebook nb = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		PortableNotebook pn = (PortableNotebook) nb;
		pn.writeDocumentation();
		pn.watchVideo();
		pn.changeMode();
		pn.useApp();
		pn.searchInternet();
		
		// 문제 3
		System.out.println("=====문제3=====");
		Scanner sc = new Scanner(System.in);
		
		Keypad kp;
		
		if ((int)(Math.random() * 2) + 1 == 1) {
			kp = new RPGgame();
		} else {
			kp = new ArcadeGame();
		}
		
		boolean run = true;
		
		while (run) {			
			System.out.println("============================================================================================");
			System.out.println("<< 1.LeftUP | 2.LeftDown | 3.RightUp | 4.RightDown | 5.ModeChange | 0.GameChange | 9.EXIT >>");
			System.out.println("============================================================================================");
			System.out.println("choice>>");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch (selectNo) {
			case 1:
				kp.leftUpButton();
				break;
			case 2:
				kp.leftDownButton();
				break;
			case 3:
				kp.rightUpButton();
				break;
			case 4:
				kp.rightDownButton();
				break;
			case 5:
				kp.changeMode();
				break;
			case 0:
				if (kp instanceof RPGgame) {
					kp = new ArcadeGame();
				} else {
					kp = new RPGgame();
				}
				break;
			case 9:
				System.out.println("EXIT");
				run = false;
				break;				
			default:
				System.out.println("잘못 입력");
				break;
			}
			
			
		}
		
	}

}
