package com.yedam.homework;

public class RPGgame implements Keypad {

	// 필드
	public int mode;
	
	// 생성자
	public RPGgame(int mode) {
		this.mode = mode;
		System.out.println("RPGgame 실행");
	}
	
	// 메소드
	@Override
	public void leftUpButton() {
		System.out.println("캐릭터가 위쪽으로 이동한다.");
		
	}

	@Override
	public void leftDownButton() {
		System.out.println("캐릭터가 아래쪽으로 이동한다.");
		
	}

	@Override
	public void rightUpButton() {
		if (mode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 한칸 단위로 점프한다.");
		} else if (mode == Keypad.HARD_MODE){
			System.out.println("캐릭터가 두칸 단위로 점프한다.");
		}
		
	}

	@Override
	public void rightDownButton() {
		if (mode == Keypad.NORMAL_MODE) {
			System.out.println("캐릭터가 일반 공격");
		} else if (mode == Keypad.HARD_MODE) {
			System.out.println("캐릭터가 HIT 공격");
		}
		
	}

	@Override
	public void changeMode() {
		String showMode = "";
		if (mode == Keypad.NORMAL_MODE) {
			mode = Keypad.HARD_MODE;
			showMode = "HARD_MODE";
		} else if (mode == Keypad.HARD_MODE) {
			mode = Keypad.NORMAL_MODE;
			showMode = "NORMAL_MODE";
		}
		System.out.println("현재 모드 : " + showMode);
	} 

}
