package com.yedam.homework;

public class ArcadeGame implements Keypad{
	// 필드
	public int mode;
	
	// 생성자
	public ArcadeGame(int mode) {
		this.mode = mode;
		System.out.println("ArcadeGame 실행");
	}
	
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 앞쪽으로 이동한다.");
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 뒤쪽으로 이동한다.");
	}

	@Override
	public void rightUpButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else if (mode == HARD_MODE) {
			System.out.println("캐릭터가 연속 공격");
		}
	}

	@Override
	public void rightDownButton() {
		if (mode == NORMAL_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		} else if (mode == HARD_MODE) {
			System.out.println("캐릭터가 Double HIT 공격");
		}
	}

	@Override
	public void changeMode() {
		String showMode = "";
		if (mode == NORMAL_MODE) {
			mode = HARD_MODE;
			showMode = "HARD_MODE";
		} else if (mode == HARD_MODE) {
			mode = NORMAL_MODE;
			showMode = "NORMAL_MODE";
		}
		System.out.println("현재 모드 : " + showMode);
	}



}
