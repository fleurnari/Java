package com.yedam.homework;

public abstract class Culture {
	
	// 필드
	String title;
	int director;
	int actor;
	int audience;
	int totalScore;
	
	// 생성자
	public Culture(String title, int director, int actor) {
		this.title = title;
		this.director = director;
		this.actor = actor;
	}
	
	// 메소드
	public void setTotalScore(int score) {
		this.totalScore += score;
		audience++;
	}
	
	public String getGrade() {
		int score = (int)totalScore / audience;
		
		if (score >= 9) {
			return "☆☆☆☆☆";
		} else if (score >= 7) {
			return "☆☆☆☆";
		} else if (score >= 5) {
			return "☆☆☆";
		} else if (score >= 3) {
			return "☆☆";
		} else {
			return "☆";
		}

		
	}
	
	public abstract void getInformation();
	
	

}
