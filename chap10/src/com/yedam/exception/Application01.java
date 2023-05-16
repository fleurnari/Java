package com.yedam.exception;

public class Application01 {
	public static void main(String[] args) {
//		try {
//			// 예외가 발생할 만한 코드
//		} catch (Exception e) {
//			// 예외 발생 했을 때 처리하는 코드
//		} finally {
//			// 무조건 실행하는 코드 (선택사항)
//		}
		
		try {
			double avg = 1 / 1;
			System.out.println(avg);
			
			String str = "123";
			int a = Integer.parseInt(str);
			
			// ClassNotFound
			Class clazz = Class.forName("java.lang.String");
			
		} catch(ArithmeticException e) {
			System.out.println("숫자를 0으로 나눌 수 없습니다.");
			e.printStackTrace();
		}
		  catch(NumberFormatException e) {
		    System.out.println("문자열을 정수로 변환 할 수 없습니다.");
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		} finally {
			System.out.println("finally 항상 실행");
		}
		
		try {
			findClass();
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재 하지 않습니다.");
		}
	}
	
	public static void findClass() throws ClassNotFoundException {
		Class clazz = Class.forName("java.lang.String2");
	}
	
}
