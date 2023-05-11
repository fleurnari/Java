package com.yedam.enumer;

import java.util.Calendar;

public class EnumExample {
	public static void main(String[] args) {
		// Week 타입의 today 변수 : Week가 가지고 있는 데이터(monday~sunday)만 사용 가능
		Week today = null;
		
		Calendar cal = Calendar.getInstance();
		
		// 요일에 상응하는 숫자를 받아옴 (일요일 : 1, 월요일 : 2 .... 토요일 : 7)
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1:
			today = Week.SUNDAY;
			break;
		case 2:
			today = Week.MONDAY;
			break;
		case 3:
			today = Week.TUESDAY;
			break;
		case 4:
			today = Week.WEDNESDAY;
			break;
		case 5:
			today = Week.THURSDAY;
			break;
		case 6:
			today = Week.FRIDAY;
			break;
		case 7:
			today = Week.SATURDAY;
			break;
		}
		
		System.out.println("오늘의 요일 : " + today);
		
	}
}
