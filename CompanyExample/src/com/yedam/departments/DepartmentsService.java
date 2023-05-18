package com.yedam.departments;

import java.util.List;
import java.util.Scanner;


public class DepartmentsService {
	
	Scanner sc = new Scanner(System.in);
	
	public void getDepartmentsList() {
		List<Departments> list = DepartmentsDAO.getInstance().getDepartmentsList();
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i).toString());
		}
		
	}
	
	public void getDpepartments() {
		System.out.println("부서 번호 입력>");
		int depId = Integer.parseInt(sc.nextLine());
		Departments dep = DepartmentsDAO.getInstance().getDepartments(depId);
		if (dep != null) {
			System.out.println("departmentID : " + dep.getDepartmentId());
			System.out.println("departmentName : " + dep.getDepartmentName());
			System.out.println("managerId : " + dep.getManagerId());
			System.out.println("locationId : " + dep.getLocationId());
		} else {
			System.out.println("해당 부서 번호가 존재 하지 않습니다.");
		}
	}
	
	public void insertDep() {
		Departments dep = new Departments();
		System.out.println("=====부서 등록=====");
		System.out.println("부서 번호>");
		dep.setDepartmentId(Integer.parseInt(sc.nextLine()));
		System.out.println("부서 이름>");
		dep.setDepartmentName(sc.nextLine());
		System.out.println("매니저 번호>");
		dep.setManagerId(Integer.parseInt(sc.nextLine()));
		System.out.println("위치 번호>");
		dep.setLocationId(Integer.parseInt(sc.nextLine()));

		int result = DepartmentsDAO.getInstance().insertDep(dep);
		
		if (result > 0) {
			System.out.println("부서 입력 완료");
		} else {
			System.out.println("부서 입력 실패");
		}
		
	}

}
