package com.yedam.exe;

import java.util.Scanner;

import com.yedam.student.StudentService;

public class ExeApp {

	private String menu = null;
	private Scanner sc = new Scanner(System.in);
	private StudentService ss = new StudentService();
	
	public ExeApp() {
		start();
	}
	
	boolean run = true;
	
	private void start() {
		while(run) {
			menu();
			
			switch (menu) {
			case "1":
				ss.getStudentList();
				break;
			case "2":
				ss.getStudent();
				break;
			case "3":
				ss.insertStd();
				break;
			case "4":
				ss.deleteStd();
				break;
			case "5":
				ss.updateStd();
				break;
			case "6":
				ss.getAnalyze();
				break;
			case "7":
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;
				

			}
			
		}
	}

	private void menu() {
		System.out.println("1. 전체 학생 조회 | 2. 학번 조회 | 3. 학생 등록 | 4. 학생 정보 삭제 | "
							+ "5. 전공 변경 | 6. 분석 | 7. 종료");
		System.out.println("입력>");
		menu = sc.nextLine();
	}
	
}
