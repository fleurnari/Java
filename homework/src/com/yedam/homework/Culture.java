package com.yedam.homework;

public abstract class Culture {
	
	// 필드
	String title;
	int director;
	int actor;
	int audience;
	int score;
	
	// 생성자
	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	// 메소드
	public void setTotalScore(int score) {
		this.score += score;
		audience++;
	}
	
	public String getGrade() {
		String star = "";
		
		for (int i = 1; i <= score/audience; i++) {
			star += "☆";
		}
		return star;
	}
	
	public abstract void getInformation();
	
	

}
