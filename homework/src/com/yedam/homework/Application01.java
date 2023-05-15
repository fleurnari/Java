package com.yedam.homework;

public class Application01 {
	
	public static void main(String[] args) {
		EmpDept empDept = new EmpDept("이지나", 3000, "교육부");
		empDept.getInformation();
		empDept.print();
		
		Human human1 = new StandardWeightInfo("홍길동", 168, 45);
		human1.getInformation();
		
		Human human2 = new ObesityInfo("박둘이", 168, 90);
		human2.getInformation();
	}
	
}
