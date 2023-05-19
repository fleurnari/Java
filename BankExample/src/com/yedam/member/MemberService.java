package com.yedam.member;

import java.util.Scanner;

public class MemberService {
	
	public static Member memberInfo = null;
	Scanner sc = new Scanner(System.in);
	
	public void login() {
		System.out.println("로그인✨");
		System.out.println("ID>");
		String id = sc.nextLine();
		System.out.println("PW>");
		String pw = sc.nextLine();
		
		Member member = MemberDAO.getInstance().login(id);
		
		if (member != null) {
			if (member.getMemberPw().equals(pw)) {
				System.out.println("로그인 성공");
				} else {
				System.out.println("비밀번호 불일치😢");
			} 
		} else {
			System.out.println("아이디 불일치😢");
		}
		
	}
}
