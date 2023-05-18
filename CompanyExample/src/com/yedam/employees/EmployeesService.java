package com.yedam.employees;

import java.sql.Date;
import java.util.List;
import java.util.Scanner;

public class EmployeesService {
	// 실행 <-> 데이터 가공 <-> DB
	Scanner sc = new Scanner(System.in);
	// 전체 조회
	public void getEmployeesList() {
		List<Employees> list = EmployeesDAO.getInstance().getEmployeesList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
	}
	
	public void getEmployees() {
		System.out.println("사번 입력>");
		int empId = Integer.parseInt(sc.nextLine());
		Employees emp = EmployeesDAO.getInstance().getEmployee(empId);
		if (emp != null) { // 데이터 조회 결과가 있을 경우
			System.out.println("employeeID : " + emp.getEmployeeId());
			System.out.println("lastName : " + emp.getLastName());
			System.out.println("email : " + emp.getEmail());
			System.out.println("hireDate : " + emp.getHireDate());
			System.out.println("jobId : " + emp.getJobId());
		} else { // 데이터 조회 결과가 없을 경우
			System.out.println("존재하지 않는 사번입니다.");
		}
	}
	
	public void insertEmp() {
		Employees emp = new Employees();
		System.out.println("=====사원 등록=====");
		System.out.println("사번>");
		emp.setEmployeeId(Integer.parseInt(sc.nextLine()));
		System.out.println("이름>");
		emp.setLastName(sc.nextLine());
		System.out.println("이메일>");
		emp.setEmail(sc.nextLine());
		System.out.println("입사일>");
		emp.setHireDate(Date.valueOf(sc.nextLine()));
		System.out.println("직책>");
		emp.setJobId(sc.nextLine());
		
		int result = EmployeesDAO.getInstance().insertEmp(emp);
		
		if (result > 0) {
			System.out.println("사원 입력 완료");
		} else {
			System.out.println("사원 입력 실패");
		}
		
		
	}
}
