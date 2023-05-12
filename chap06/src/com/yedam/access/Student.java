package com.yedam.access;

public class Student {
	/*
	 * 필드 : 이름, 학과, 학년, 과목별 점수
	 * 과목 : programming, database, os
	 * 필드는 모두 private
	 * setter 메소드 활용해서 필드 초기화
	 * getter 메소드 활용해서 객체의 필드 읽어오기
	 * getInfo() : 학생 정보 출력 메소드
	 */
	
	// 필드
	private String stdName;
	private String major;
	private String stdGrade;
	private int programming;
	private int database;
	private int os;
	
	// 생성자(기본 생성자)
	
	// 메소드
	
	public String getStdName() {
		return stdName;
	}
	public void setStdName(String stdName) {
		this.stdName = stdName;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getStdGrade() {
		return stdGrade;
	}
	public void setStdGrade(String stdGrade) {
		this.stdGrade = stdGrade;
	}
	
	// 과목의 점수 입력
	// 점수가 0점보다 낮은 점수 (음수) 입력될 경우 점수를 0점으로 처리
	
	public int getProgramming() {
		return programming;
	}
	public void setProgramming(int programming) {
		if (programming < 0) {
			this.programming = 0;
			return; // 메소드 강제 종료
		}
		
	this.programming = programming;
	}
	public int getDatabase() {
		return database;
	}
	public void setDatabase(int database) {
		// 삼항 연산자
		this.database = (database < 0) ? 0 : database;
	}
	public int getOs() {
		return os;
	}
	public void setOs(int os) {
		this.os = (os < 0) ? 0 : os;
	}
	

	
	
}
