package com.yedam.oop;

import java.util.Scanner;

public class Application05 {
	public static void main(String[] args) {
		
		
		Student[] student = null;
		
		int studentNum = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("==================================================");
			System.out.println("1. 학생 수 | 2. 정보 입력 | 3. 정보 확인 | 4. 분석 | 5. 종료");
			System.out.println("==================================================");

			String selectNo = sc.nextLine();
			
			if (selectNo.equals("1")) {
				System.out.println("학생 수>");
				studentNum = Integer.parseInt(sc.nextLine());	
			} else if (selectNo.equals("2")) {
				student = new Student[studentNum];
				
				for(int i = 0; i < student.length; i++) {
					Student st = new Student();
					
					// 배열에 바로 객체 만들기
					// student[i] = new Student();
					
					System.out.println("학생의 이름은?");
					st.name = sc.nextLine();
					System.out.println("학생의 학년은?");
					st.grade = Integer.parseInt(sc.nextLine());
					System.out.println("학생의 국어 점수는?");
					st.korScore = Integer.parseInt(sc.nextLine());
					System.out.println("학생의 영어 점수는?");
					st.engScore = Integer.parseInt(sc.nextLine());
					System.out.println("학생의 수학 점수는?");
					st.mathScore = Integer.parseInt(sc.nextLine());
					
					student[i] = st;

					
				}
			} else if (selectNo.equals("3")) {
				for (int i = 0; i < student.length; i++) {
					System.out.println((i + 1) + "번째 학생 정보=====");
					student[i].getInfo();
					System.out.println();
				}
			} else if (selectNo.equals("4")) {
				int total = 0;
				
				for (int i = 0; i < student.length; i++) {
					int bestScore = student[i].korScore;
					int worstScore = student[i].korScore;
					
					total += student[i].korScore + student[i].engScore + student[i].mathScore;
					
					if (bestScore < student[i].engScore) {
						bestScore = student[i].engScore;
					}
					if (bestScore < student[i].mathScore) {
						bestScore = student[i].mathScore;
					}
					
					// 교수님 답안
//					if (student[i].engScore < student[i].mathScore) {
//						if (bestScore < student[i].mathScore) {
//							bestScore = student[i].mathScore;
//						}
//					} else {
//						if (bestScore < student[i].engScore) {
//							bestScore = student[i].engScore;
//						}
//					}
					
				
					if (worstScore > student[i].engScore) {
						worstScore = student[i].engScore;
					}
					if (worstScore > student[i].mathScore) {
						worstScore = student[i].mathScore;
					}
					
					System.out.println(student[i].name + " 학생의 가장 점수가 높은 과목 : " + bestScore + "점");
					System.out.println(student[i].name + " 학생의 가장 점수가 낮은 과목 : " + worstScore + "점");
					
				}
				
				System.out.println("전체 학생의 점수 총점 : " + total);
				System.out.println("총점의 평균 : " + (double)total / student.length);
				
				
			} else if (selectNo.equals("5")) {
				System.out.println("프로그램 종료");
				break;
			} else {
				System.out.println("잘못 입력했다");
			}
		
		}
		
		
		
	}
}
