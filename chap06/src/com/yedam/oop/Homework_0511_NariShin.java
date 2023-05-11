package com.yedam.oop;

import java.util.Scanner;

public class Homework_0511_NariShin {
	
	public static void main(String[] args) {
		// 문제2) 다음은 키보드로부터 상품 수와 상품 가격을 입력받아서
		// 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총 합을 구하는 프로그램을 작성하세요.
		// 1) 메뉴는 다음과 같이 구성하세요.
		// 1.상품 수 | 2.상품 및 가격입력 | 3.제품별 가격 | 4.분석 | 5.종료
		// 2) 입력한 상품 수만큼 상품명과 해당 가격을 입력받을 수 있도록 구현하세요.
		// 3) 제품별 가격을 출력하세요.
		//	출력예시, "상품명 : 가격"
		// 4) 분석기능은 최고 가격을 가지는 제품과 해당 제품을 제외한 제품들의 총합을 구합니다.
		// 5) 종료 시에는 프로그램을 종료한다고 메세지를 출력하도록 구현하세요.
		
		Merchandise[] mdArray = null;
		
		int no = 0;
		
		Scanner sc = new Scanner(System.in);
		
		
		while (true) {
		
		System.out.println("==========================================================");
		System.out.println("1. 상품 수 | 2. 상품 및 가격 입력 | 3. 제품별 가격 | 4. 분석 | 5. 종료");
		System.out.println("===========================================================");
		
		int selectNo = Integer.parseInt(sc.nextLine());
		
		if (selectNo == 1) {
			System.out.println("상품 수>");
			no = Integer.parseInt(sc.nextLine());
		} else if (selectNo == 2) {
			mdArray = new Merchandise[no];
			for (int i = 0; i < mdArray.length; i++) {
				mdArray[i] = new Merchandise();
				
				System.out.println("상품명>");
				mdArray[i].name = sc.nextLine();
				System.out.println("가격>");
				mdArray[i].price = Integer.parseInt(sc.nextLine());
			}
			
		} else if (selectNo == 3) {
			for (int i = 0; i < mdArray.length; i++) {
				mdArray[i].getInfo();
			}
			
		} else if (selectNo == 4) {
			String maxName = mdArray[0].name;
			int maxPrice = mdArray[0].price;
			int exceptMaxTotal = 0;
			
			for (int i = 0; i < mdArray.length; i++) {
				
				if (maxPrice < mdArray[i].price) {
					maxPrice = mdArray[i].price;
					maxName = mdArray[i].name;
				}
				
			}
			
			for (int i = 0; i < mdArray.length; i++) {
				
				if (mdArray[i].price == maxPrice) {
					continue;
				}
				
				exceptMaxTotal += mdArray[i].price;
			}
			
			System.out.println("최고 가격을 가지는 제품명 : " + maxName + ", 가격 : " + maxPrice);
			System.out.println("최고 가격 제품을 제외한 가격 총합 : " + exceptMaxTotal);
			
		} else if (selectNo == 5) {
			System.out.println("프로그램 종료");
			break;
		} else {
			System.out.println("잘못 입력했어요");
		}
		
		
		}
	}

}
