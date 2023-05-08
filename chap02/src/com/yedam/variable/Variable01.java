package com.yedam.variable;

public class Variable01 {

	public static void main(String[] args) {
		// 변수 선언
		int value = 0;
		int result = value + 10;
		System.out.println(result);
		
		// 변수 사용
		int hour = 3;
		int minute = 5;
		System.out.println(hour + "시간 " + minute + "분");
		
		// 시간 -> 분으로 변환
		int totalMinute = (hour*60) + minute;
		System.out.println("총 " + totalMinute + "분");
		
		// 변수 복사
		int x = 3;
		int y;
		System.out.println("바꾸기 전 : " + x);
		y = x; // y = 3
		System.out.println("바꾼 후 : " + x + y);

		// swap : x와 y의 값 바꾸기 (임시변수 z 사용)
		x = 3;
		y = 5;
		int z = 0;
		
		z = x;
		x = y;
		y = z;
		
		// 변수 사용 범위
		int v1 = 15;
		if (v1 > 10) {
			int v2;
			v2 = v1 - 10;
		}
//		int v3 = v1 + v2 + 5;
			
		
	}
	
}
