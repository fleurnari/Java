package com.yedam.reference;

public class StringRef {

	public static void main(String[] args) {
		String strVal1 = "yedam";
		String strVal2 = "yedam";
		
		// 주소값 비교
		if (strVal1 == strVal2) {
			System.out.println("strVal1과 strVal2는 메모리 주소가 같다.");
		} else {
			System.out.println("strVal1과 strVal2는 메모리 주소가 다르다.");
		}
		
		// 데이터 비교
		if (strVal1.equals(strVal2)) {
			System.out.println("strVal1과 strVal2의 데이터는 같다.");
		} else {
			System.out.println("strVal1과 strVal2의 데이터는 다르다.");
		}
		
		// new 연산자 -> 새로운 객체 생성
		// heap에 객체 생성 -> 데이터를 넣을 수 있는 공간을 만듬
		
		String strVal3 = new String("yedam");
		String strVal4 = new String("yedam");
		
		if(strVal3 == strVal4) {
			System.out.println("strVal3과 strVal4는 메모리 주소가 같다.");
		} else {
			System.out.println("strVal3과 strVal4는 메모리 주소가 다르다.");
		}
		
		if (strVal3.equals(strVal4)) {
			System.out.println("strVal3과 strVal4의 데이터는 같다.");
		} else {
			System.out.println("strVal3과 strVal4의 데이터는 다르다.");
		}
		
		if (strVal1 == strVal3) {
			System.out.println("strVal1과 strVal3는 메모리 주소가 같다.");
		} else {
			System.out.println("strVal1과 strVal3는 메모리 주소가 다르다.");
		}
		
		
	}
	
}
