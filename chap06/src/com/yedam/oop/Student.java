package com.yedam.oop;

public class Student {

	// 학생의 정보를 관리하는 프로그램

	// 필드 : 이름, 학년, 국어 점수, 영어 점수, 수학 점수
	String name;
	int grade;
	int korScore;
	int engScore;
	int mathScore;

	// 기본 생성자
	Student() {
		
	}
	
	// 메소드
	// 모든 정보를 출력 getInfo()
	void getInfo() {
		System.out.println("이름 : " + name);
		System.out.println("학년 : " + grade);
		System.out.println("국어 점수 : " + korScore);
		System.out.println("영어 점수 : " + engScore);
		System.out.println("수학 점수 : " + mathScore);
	}
	
	
}
