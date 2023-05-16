package com.yedam.homework;

public class Performance extends Culture {

	// 필드
	String genre;
	
	// 생성자
	public Performance(String title, int director, int actor, String genre) {
		super(title, director, actor);
		this.genre = genre;
	}

	// 메소드
	@Override
	public void getInformation() {
		System.out.println("공연 제목 : " + title);
		System.out.println("감독 : " + director);
		System.out.println("배우 : " + actor);
		System.out.println("공연 총점 : " +  score);
		System.out.println("공연 평점 : " + getGrade());
	

	}

}
