package com.yedam.API;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

public class StringExample {
	public static void main(String[] args) {
		// String API
		
		// byte[] -> String
		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		// byte[] -> String (위치를 지정), 6의 자리에서 4개
		String str2 = new String(bytes, 6, 4);
		System.out.println(str2);
		
		// charAt() : 인덱스 값(문자 위치) 입력해서 해당 위치에 있는 문자 읽기
		String ssn = "940404-2345678";
		char gender = ssn.charAt(7);
		System.out.println(gender);
		switch (gender) {
		case '1':
		case '3':
			System.out.println("남자");
			break;
		case '2':
		case '4':
			System.out.println("여자");
			break;
		}
		
		// equals() 문자열 비교
		String str3 = "김치킨";
		String str4 = "김치킨";
		String str5 = new String("김치킨");
		if (str3.equals(str4)) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		
		if (str3.equals(str5)) {
			System.out.println("같은 문자열");
		} else {
			System.out.println("다른 문자열");
		}
		
		// 문자열 -> 바이트 배열
		String str6 = "안녕하세요";
		byte[] byte1 = str6.getBytes();
		for (byte word : byte1) {
			System.out.println(word);
		}
		
		// byte -> String
		String str7 = new String(byte1);
		System.out.println("byte->String : " + str7);
		
		// byte <-> String + encoding type
		try {
			// String -> byte (EUC-KR)
			byte[] byte2 = str6.getBytes("EUC-KR");
			// byte -> String (EUC-KR)
			String str8 = new String(byte2, "EUC-KR");
			System.out.println(str8);
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		
		// 문자열 위치 찾기
		String subject = "자바 프로그래밍";
		int idx = subject.indexOf("그래밍");
		System.out.println(idx);
		// 문자열을 못 찾았을 때 : -1 반환
		idx = subject.indexOf("java");
		System.out.println(idx);
		
		// 문자열 길이
		System.out.println(subject.length());
		
		String ssn2 = "000102-3157849";
		
		if (ssn2.length() == 14) {
			System.out.println("주민등록번호 자리 수가 맞습니다.");
		} else {
			System.out.println("주민등록번호 자리 수가 맞지 않습니다.");
		}
		
		// 문자열 대치 (문자열 바꾸기)
		String oldStr = "자바 프로그래밍";
		String newStr = oldStr.replace("자바", "java");
		System.out.println(newStr);
		
		// 문자열 자르기 : substring
		// 매개변수에 따라서 자르는 방법 다름
		// 1) 매개변수가 1개일 경우 - 해당 위치로부터 끝까지 자르기
		String ssn3 = "123456-1234567";
		String firstNum = ssn3.substring(7);
		System.out.println(firstNum);
		
		// 2) 매개변수가 2개일 경우 : 시작 위치 ~ 끝나는 위치-1 까지 자르기
		String secondNum = ssn3.substring(0,6);
		System.out.println(secondNum);
		
		// 대문자 -> 소문자
		String big = "ABCDEFG";
		System.out.println(big.toLowerCase());
		
		// 소문자 -> 대문자
		String small = "abcdefg";
		System.out.println(small.toUpperCase());
		
		// 양쪽 공백 제거
		String name = "      김피자       ";
		System.out.println(name.trim());
		
		// 기본 타입 -> 문자열 변환
		String temp = String.valueOf(123);
		System.out.println(temp); // "123"
		temp = String.valueOf(true);
		System.out.println(temp); // "true"
		
		// 문자열 분리하기 : split()
		// 구분자를 통한 문자열 분리
		String value = "1,2,3,4,5,6,7,8,9";
		String[] strAry = value.split(",");
		
		for(String data : strAry) {
			System.out.println(data);
		}
		
		// isEmpty : 문자열이 비어 있는지 확인
		String empty = "";
		if (empty.isEmpty()) {
			System.out.println("비어있음");
		} else {
			System.out.println("문자열 있음");
		}
		
		// String의 단점을 보완해 주는 API : StringBuilder, StringBuffer
		StringBuilder sb = new StringBuilder();
		sb.append("ye");
		sb.append("ah");
		System.out.println(sb);
		sb.deleteCharAt(1);
		System.out.println(sb);
		sb.delete(0, 1);
		System.out.println(sb);
		
		// concat - 문자열 합치기(+)
		// contains - 포함하고 있는 문자열 확인(indexOf)
		
		String str = "";
		System.out.println(str.endsWith("a"));
		
		// 1) 문자열 뒤집기
		String strBefore = "abcdefg";
		String strAfter = "";
		
		for (int i = strBefore.length() - 1; i >= 0; i--) {
			strAfter += strBefore.charAt(i);
		}
		System.out.println(strAfter);
		
		// 2) 문자 개수 찾기 : 숫자 n개, 알파벳 n개, 공백 n개
		String strFind = "1n2ASD 330naa1";
		byte[] strByte = strFind.getBytes();
		
		int strNum = 0;
		int strAlp = 0;
		int strSpa = 0;
		
		for(int i = 0; i < strFind.length(); i++) {
			if (strByte[i] >= 48 && strByte[i] <= 57) {
				strNum++;
			} else if ((strByte[i] >= 65 && strByte[i] <= 90) || (strByte[i] >= 97 && strByte[i] <= 122)) {
				strAlp++;	
			} else {
				strSpa++;
			}
		} System.out.println("숫자 : " + strNum + "알파벳 : " + strAlp + "공백 : " + strSpa);
		
		
		// 교수님 답안
		int alpha = 0, num = 0, space = 0;
		
		for (int i = 0; i < strFind.length(); i++) {
			char tempCh = strFind.charAt(i);
			if (tempCh == ' ') {
				space++;
			} else if (tempCh >= '0' && tempCh <= '9') {
				num++;
			} else if (tempCh >= 'A' && tempCh <= 'Z' ||
					   tempCh >= 'a' && tempCh <= 'z') {
				alpha++;
			}
			
		} System.out.println("숫자 : " + num + "개 " + "알파벳 : " + alpha + "개 " + "공백 : " + space + "개 ");
		
		
		// 3) 주민등록번호 입력 후 나이 계산하기 (올해 기준 : 23년생 - 2023 / 24년생 - 1924)
		String ssnAge = "240102-1234567";
		
		int ssnYear = Integer.parseInt(ssnAge.substring(0, 2));
		
		if (ssnYear >= 24 && ssnYear <= 99) {
			System.out.println("나이 : " + (2023 - (1900 + ssnYear) + 1));
		} else {
			System.out.println("나이 : " + (2023 - (2000 + ssnYear) + 1));
		}
		
		// 교수님 답안
		Scanner sc = new Scanner(System.in);
		System.out.println("생년월일>");
		String birth = sc.nextLine();
		// 년도 문자열 자르고 정수로 변환
		int birthNo = Integer.parseInt(birth.substring(0,2));
		
		if(birthNo <= 23) {
			System.out.println("나이 : " + (24 - birthNo));
		} else {
			System.out.println("나이 : " + (124 - birthNo));
		}
		
		
		// 4)
		String strZip = "KKHSSSSSSSSE";
		String result = "";
		int count = 1;
		for (int i = 0; i < strZip.length(); i++) {
			if (i < strZip.length() - 1 && strZip.charAt(i) == strZip.charAt(i + 1)) {
				count++;
			} else {
				result += strZip.charAt(i);
				if (count > 1) {
					result += String.valueOf(count);
				}
				count = 1;
			}
		}
		System.out.println(result);
		
		}
		
	
		}

