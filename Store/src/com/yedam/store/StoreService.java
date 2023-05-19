package com.yedam.store;

import java.util.List;
import java.util.Scanner;

public class StoreService {
	Scanner sc = new Scanner(System.in);
	
	// 모든 가게 정보 조회
	public void getStoreList() {
		List<Store> list = StoreDAO.getInstance().getStoreList();
		if (list.size() == 0) {
			System.out.println("등록된 가게 정보가 없습니다（；´д｀）ゞ");
		} else {
		for (int i = 0; i < list.size(); i++) {
			System.out.println("가게 번호 : " + list.get(i).getStoreId());
			System.out.println("가게명 : " + list.get(i).getStoreName());
			System.out.println("가게 연락처 : " + list.get(i).getStoreTel());
			System.out.println("주소 : " + list.get(i).getStoreAddr());
			System.out.println("매출 : " + list.get(i).getStoreSales());
		}
		// 향상된 for문
//		 for (Store store : list) {
//			 System.out.println("상호명 : " + store.getStoreName());
//			 System.out.println("가게번호 : " + store.getStoreId());
//			 System.out.println("연락처 : " + store.getStoreTel());
//			 System.out.println("주소 : " + store.getStoreAddr());
//			 System.out.println("매출 : " + store.getStoreSales());
//		 }
		
	   }
	}
	
	// 지역구별 매출 합계 조회
	public void getSumSales() {
		List<Store> list = StoreDAO.getInstance().getSumSales();
		if (list.size() == 0) {
			System.out.println("조회된 데이터가 없습니다（；´д｀）ゞ");
		} else {
			for(int i = 0; i < list.size(); i++) {
				System.out.println("지역구 : " + list.get(i).getStoreLocation() + "\t" + "매출 : " + list.get(i).getSumSales());
			}
		}
	}
	
	// 가게 정보 입력
	public void insertStore() {
		Store store = new Store();
		System.out.println("가게 정보 입력ヾ(≧▽≦*)o");
		System.out.println("가게 번호>");
		store.setStoreId(Integer.parseInt(sc.nextLine()));
		System.out.println("가게명>");
		store.setStoreName(sc.nextLine());
		System.out.println("가게 연락처>");
		store.setStoreTel(sc.nextLine());
		System.out.println("주소>");
		store.setStoreAddr(sc.nextLine());
		System.out.println("매출>");
		store.setStoreSales(Integer.parseInt(sc.nextLine()));
		
		int result = StoreDAO.getInstance().insertStore(store);
		
		if (result > 0) {
			System.out.println("가게 정보 입력 완료( •̀ ω •́ )✧");
		} else {
			System.out.println("가게 정보 입력 실패o(TヘTo)");;
		
		}
	}
	
	// 매출 수정
	public void updateStore() {
		Store store = new Store();
		System.out.println("매출 수정ヾ(≧▽≦*)o");
		System.out.println("가게 번호>");
		store.setStoreId(Integer.parseInt(sc.nextLine()));
		System.out.println("매출>");
		store.setStoreSales(Integer.parseInt(sc.nextLine()));
		
		int result = StoreDAO.getInstance().updateSales(store);
		if (result > 0) {
			System.out.println("매출 수정 완료( •̀ ω •́ )✧");
		} else {
			System.out.println("매출 수정 실패o(TヘTo)");
		}
	}
	
	
	

	
}
