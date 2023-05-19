package com.yedam.exe;

import java.util.Scanner;

import com.yedam.store.StoreService;

public class StoreApp {

	private Scanner sc = new Scanner(System.in);
	private boolean run = true;
	private String menu = null;
	StoreService ss = new StoreService();
	
	public StoreApp() {
		start();
	}

	private void start() {
		while(run) {
			System.out.println("1. 모든 가게 정보 조회 | 2. 지역구별 매출 합계 조회 | 3. 가게 정보 입력 | 4. 매출 수정 | 5. 종료");
			System.out.println("입력>");
			menu = sc.nextLine();
			
			switch(menu) {
			case "1":
				ss.getStoreList();
				break;
			case "2":
				ss.getSumSales();
				break;
			case "3":
				ss.insertStore();
				break;
			case "4":
				ss.updateStore();
				break;
			case "5":
				System.out.println("프로그램 종료");
				run = false;
				break;
			}
			
			
		}
	}
}
