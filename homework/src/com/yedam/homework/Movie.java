package com.yedam.homework;

public class Movie extends Culture {

	// 필드
	String genre;
	
	// 생성자
	public Movie(String title, int director, int actor, String genre) {
		super(title, director, actor);
		this.genre = genre;
		
	}

	// 메소드
	@Override
	public void getInformation() {
		System.out.println("영화 제목 : " + title);
		System.out.println("감독 : " + director);
		System.out.println("배우 : " + actor);
		System.out.println("영화 총점 : " + totalScore);
		System.out.println("영화 평점 : " + getGrade());

	}

}
