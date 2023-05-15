package com.yedam.homework;

public class Application01 {
	
	public static void main(String[] args) {
		// 문제 1
		EmpDept empDept = new EmpDept("이지나", 3000, "교육부");
		empDept.getInformation();
		empDept.print();
		
		// 문제 2
		Human human1 = new StandardWeightInfo("홍길동", 168, 45);
		human1.getInformation();
		
		Human human2 = new ObesityInfo("박둘이", 168, 90);
		human2.getInformation();
		
		// 문제 3
		Culture culture1 = new Movie("추격자", 7, 5, "액션");
		culture1.setTotalScore(8);
		culture1.getInformation();
		
		Culture culture2 = new Performance("지킬앤하이드", 9, 10, "뮤지컬");
		culture2.setTotalScore(10);
		culture2.getInformation();
		
		
	}
	
}