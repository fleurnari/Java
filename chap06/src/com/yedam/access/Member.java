package com.yedam.access;

public class Member {
	
	// 사이트에 회원 정보 저장
	
	// 필드 : 아이디, 비밀번호, 이름, 나이
	private String memId;
	private String memPw;
	private String memName;
	private int memAge;
	
	// 기본 생성자
	Member() {
		
	}
	
	// getter, setter 이용해서 정보 읽고 저장
	// 1) 나이 입력 받았을 때 0보다 적은 숫자가 들어오면 0으로 변경
	// 2) 나이 정보를 얻어 갈 때 +1 해서 얻어간다.
	
	public String getMemId() {
		return memId;
	}
	public void setMemId(String memId) {
		this.memId = memId;
	}
	public String getMemPw() {
		return memPw;
	}
	public void setMemPw(String memPw) {
		this.memPw = memPw;
	}
	public String getMemName() {
		return memName;
	}
	public void setMemName(String memName) {
		this.memName = memName;
	}
	public int getMemAge() {
		return memAge + 1;
	}
	public void setMemAge(int memAge) {
		this.memAge = (memAge < 0) ? 0 : memAge;
	}
	
	public void instance() {
		Singleton single = Singleton.getInstance();
		System.out.println("Member 객체의 instance 메소드");
		System.out.println(single.age);
		System.out.println(single.name);
	}
	
	
	
}
