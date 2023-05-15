package com.yedam.homework;

public class EmpDept extends Employee{
	
	// 필드
	String dept;

	// 생성자
	public EmpDept(String name, int salary, String dept) {
		super(name, salary);
		this.dept = dept;
	}
	
	// 메소드
	
	public String getDept() {
		return dept;
	}

	@Override
	public void getInformation() {
		System.out.println("이름:" + name + " 연봉:" + salary + " 부서:" + dept);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스\n서브클래스");
	}
	

	
	
	
	
	

}
