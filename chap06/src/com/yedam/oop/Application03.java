package com.yedam.oop;

public class Application03 {

	public static void main(String[] args) {
		
		Computer computer = new Computer();
		
		// 1) 배열을 활용
		int[] values1 = {1, 2, 3};
		int result1 = computer.sum1(values1);
		System.out.println(result1);
		
		result1 = computer.sum1(new int[10]);
		System.out.println(result1);
		
		result1 = computer.sum1(new int[] {1,2,3,4});
		System.out.println(result1);
		
		// 2) 목록을 넘겨주는 방식
		int result2 = computer.sum2(1, 2, 3);
		System.out.println(result2);
		
		int result3 = computer.sum2(1, 2, 3, 4, 5);
		System.out.println(result3);
		
		Calculator cal = new Calculator();
		cal.execute();
		
		double result4 = cal.areaRectangle(10.5);
		System.out.println(result4);
		
		double result5 = cal.areaRectangle(20.4, 10.2);
		System.out.println(result5);
		
		Book book1 = new Book("혼자 공부하는 자바", "학습서", "24000원", "0001", "한빛 미디어");
		book1.getInfo();
		
		Book book2 = new Book("자바스크립트", "학습서", "15000원", "0002", "어포스트");
		book2.getInfo();
		
	}
}
