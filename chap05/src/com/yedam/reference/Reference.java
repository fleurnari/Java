package com.yedam.reference;

public class Reference {

	public static void main(String[] args) {
		// 참조 : 배열
		int[] array = {1,2,3,4,5,6};
		int[] array2 = {1,2,3,4,5,6};
		int[] array3 = null;
		
		System.out.println(array);
		System.out.println(array2);
		System.out.println(array == array2);
		System.out.println(array[0]);
		System.out.println(array3);
		
		System.out.println(array3 == null);
		
		if (array3 == null) {
			// array3이 null일 경우에 실행할 실행문
		} else {
			// array3에 객체 있는 경우에 실행할 실행문
		}
	}
	

}
