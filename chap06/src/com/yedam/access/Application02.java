package com.yedam.access;

public class Application02 {
	public static void main(String[] args) {
		// 인스턴스(객체) 생성
		Student std = new Student();
		
		// 인스턴스 필드 -> 데이터 입력 및 저장
		std.setStdName("김치킨");
		std.setMajor("컴퓨터공학과");
		std.setStdGrade("2");
		std.setProgramming(-5);
		std.setDatabase(50);
		std.setOs(-50);
		
		// 인스턴스 필드 -> 데이터 읽어오기
		System.out.println("이름 : " + std.getStdName());
		System.out.println("학과 : " + std.getMajor());
		System.out.println("학년 : " + std.getStdGrade());
		System.out.println("프로그래밍 점수 : " + std.getProgramming());
		System.out.println("데이터베이스 점수 : " + std.getDatabase());
		System.out.println("운영체제 점수 : " + std.getOs());
		
		System.out.println("====== Member 객체 생성 ======");
		Member mem = new Member();
		
		mem.setMemId("kingofjava");
		mem.setMemPw("chickenislove");
		mem.setMemName("김치킨");
		mem.setMemAge(-70);
		
		System.out.println("아이디 : " + mem.getMemId());
		System.out.println("비밀번호 : " + mem.getMemPw());
		System.out.println("이름 : " + mem.getMemName());
		System.out.println("나이 : " + mem.getMemAge());
		
	}
}
