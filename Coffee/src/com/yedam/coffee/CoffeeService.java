package com.yedam.coffee;

import java.util.List;
import java.util.Scanner;

public class CoffeeService {
	Scanner sc = new Scanner(System.in);
	
	// 메뉴 조회
	public void getMenuList() {
		List<Coffee> list = CoffeeDAO.getInstance().getMenuList();
		if (list.size() == 0) {
			System.out.println("등록된 메뉴가 없습니다.");
		} else {
			for (int i = 0; i < list.size(); i++) {
				System.out.println("메뉴 : " + list.get(i).getCoffeeMenu() + " 가격 : " + list.get(i).getCoffeePrice());
			}
		}
		
	}
	
	// 메뉴 상세 조회
	public void getMenu() {
		System.out.println("메뉴 입력>");
		String coffeeMenu = sc.nextLine();
		
		Coffee coffee = CoffeeDAO.getInstance().getMenu(coffeeMenu);
		if (coffee != null) {
			System.out.println("메뉴 : " + coffee.getCoffeeMenu() + " 가격 : " + coffee.getCoffeePrice() + " 설명 : " + coffee.getCoffeeExplain());
		} else {
			System.out.println("해당 메뉴가 없습니다.");
		}
		
	}
	
	// 메뉴 등록
	public void insertMenu() {
		Coffee coffee = new Coffee();
		System.out.println("메뉴 입력>");
		coffee.setCoffeeMenu(sc.nextLine());
		System.out.println("가격 입력>");
		coffee.setCoffeePrice(Integer.parseInt(sc.nextLine()));
		System.out.println("설명 입력>");
		coffee.setCoffeeExplain(sc.nextLine());
		
		int result = CoffeeDAO.getInstance().insertMenu(coffee);
		
		if (result > 0) {
			System.out.println("메뉴 등록 완료");
		} else {
			System.out.println("메뉴 등록 실패");
		}
		
		
	}
	
	// 판매
	public void sellMenu() {
		Coffee coffee = new Coffee();
		System.out.println("메뉴 입력>");
		coffee.setCoffeeMenu(sc.nextLine());
		
		int result = CoffeeDAO.getInstance().sellMenu(coffee);
		if (result > 0) {
			System.out.println("판매량 완료");
		} else {
			System.out.println("판매량 실패");
		}
		
	}
	
	// 메뉴 삭제
	public void deleteMenu() {
		System.out.println("메뉴 입력>");
		String coffeeMenu = sc.nextLine();
		int result = CoffeeDAO.getInstance().deleteMenu(coffeeMenu);
		if (result > 0) {
			System.out.println("메뉴 삭제 완료");
		} else {
			System.out.println("메뉴 삭제 실패");
		}
	}
	
	
	// 매출
	public void getSales() {
		List<Coffee> list = CoffeeDAO.getInstance().getSales();
		int totalSales = 0;
		for(int i = 0; i < list.size(); i++) {
			System.out.println("메뉴 : " + list.get(i).getCoffeeMenu() + ", 판매갯수 : " + list.get(i).getCoffeeSales() + ", 판매 금액 : " + list.get(i).getTotalSales() + "원");
			totalSales += list.get(i).getTotalSales();
		}
		System.out.println("총 매출액 : " + totalSales + "원");
	}
	
	

}
