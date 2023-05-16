package com.yedam.homework;

public class Application02 {

	public static void main(String[] args) {
		
		// 문제 1
		Keypad rpg = new RPGgame(0);
		rpg.leftUpButton();
		rpg.rightUpButton();
		rpg.changeMode();
		rpg.rightUpButton();
		rpg.rightDownButton();
		rpg.leftDownButton();
		rpg.changeMode();
		rpg.rightDownButton();
		System.out.println("======================");
		Keypad ac = new ArcadeGame(0);
		ac.leftUpButton();
		ac.rightUpButton();
		ac.leftDownButton();
		ac.changeMode();
		ac.rightUpButton();
		ac.leftUpButton();
		ac.rightDownButton();
		
		
		// 문제 2
		Notebook tb = new PortableNotebook("한글2020", "크롬", "영화", "안드로이드앱");
		tb.writeDocumentation();
		tb.watchVideo();
		
		
	}

}
