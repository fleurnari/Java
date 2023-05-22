package com.yedam.exe;

import java.util.Scanner;

import com.yedam.coffee.CoffeeService;

public class Application {
	
	Scanner sc = new Scanner(System.in);
	boolean flag = true;
	CoffeeService cs = new CoffeeService();
	
	public Application() {
		run();
	}
	
	private void run() {
		while(flag) {
			System.out.println("1. 메뉴 조회 | 2. 메뉴 상세 조회 | 3. 메뉴 등록 | 4. 판매 | 5. 메뉴 삭제 | 6. 매출 | 7. 종료");
			System.out.println("메뉴 입력>");
			int selectNo = Integer.parseInt(sc.nextLine());
			
			switch (selectNo) {
			case 1:
				cs.getMenuList();
				break;
			case 2:
				cs.getMenu();
				break;
			case 3:
				cs.insertMenu();
				break;
			case 4:
				cs.sellMenu();
				break;
			case 5:
				cs.deleteMenu();
				break;
			case 6:
				cs.getSales();
				break;
			case 7:
				System.out.println("end of prog");
				flag = false;
				break;
			default:
				System.out.println("잘못 입력 했습니다.");
				break;
			}
		}
		
	}

}
