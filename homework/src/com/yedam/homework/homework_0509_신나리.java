package com.yedam.homework;

import java.util.Scanner;

public class homework_0509_�ų��� {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// ����1) ���ʴ�� x�� y�� ���� �־����� �� ��� ��и鿡 �ش�Ǵ��� ����ϵ��� �����ϼ���.
		// �� ��и鿡 �ش� �ϴ� x�� y�� ���� �Ʒ��� �����ϼ���.
		// ��1��и� : x>0, y>0
		// ��2��и� : x<0, y>0
		// ��3��и� : x<0, y<0
		// ��4��и� : x>0, y<0
		// ������ó, ����(https://www.acmicpc.net/) 14681�� ����
		
		System.out.println("x�� ���� �Է��ϼ���.");
		int xData = Integer.parseInt(scanner.nextLine());
		System.out.println("y�� ���� �Է��ϼ���.");
		int yData = Integer.parseInt(scanner.nextLine());
		
		if (xData > 0 && yData > 0) {
			System.out.println("�� 1 ��и�");
		} else if (xData < 0 && yData > 0) {
			System.out.println("�� 2 ��и�");
		} else if (xData < 0 && yData < 0) {
			System.out.println("�� 3 ��и�");
		} else if (xData > 0 && yData < 0) {
			System.out.println("�� 4 ��и�");
		}
		

		// ����2) ������ �־����� �� �ش� �⵵�� ���������� Ȯ���ؼ� ����ϵ��� �ϼ���.
		// ������ ������ 4�� ����̸鼭 100�� ����� �ƴ� �� �Ǵ� 400�� ����϶��Դϴ�.
		// ���� ���, 2012���� 4�� ����̸鼭 100�� ����� �ƴ϶� �����̸�,
		// 1900���� 100�� ����̰� 400�� ����� �ƴϱ� ������ ������ �ƴմϴ�.
		// HiNT : ���� IF�� ���
		// ������ó, ����(https://www.acmicpc.net/) 2753�� ����
		
		System.out.println("������ �Է��ϼ���.");
		int yearData = Integer.parseInt(scanner.nextLine());
		if (yearData % 4 == 0) {
			if (yearData % 100 == 0 && yearData % 400 != 0) {
				System.out.println("4�� ��������� 100�� ����̹Ƿ� ������ �ƴմϴ�.");
			} else {
				System.out.println("�����Դϴ�.");
			}
		} else {
			System.out.println("������ �ƴմϴ�.");
		}
		
		
		// ����3) switch���� �̿��Ͽ� ����, ����, �� �� �ϳ��� �־����� �� ����� � ���� ������ �̱� �� �ִ� ���� ����ϵ���
		// �����ϼ���.
		// ���� ���, ������ �־����� �� "�̱�� ���ؼ� ������ �����մϴ�." ��� ����ϵ��� �ϼ���.
		// �� �ܾ �Է¹��� ��� Scanner��ü�� next() �Լ��� ����ϸ� �˴ϴ�.

		System.out.println("���� / ���� / �� �� �ϳ��� �Է��ϼ���.");
		String data = scanner.nextLine();
		
		switch (data) {
		case "����":
			System.out.println("�̱�� ���ؼ� ������ ���� �մϴ�.");
			break;
		case "����":
			System.out.println("�̱�� ���ؼ� ���� ���� �մϴ�.");
			break;
		case "��":
			System.out.println("�̱�� ���ؼ� ������ ���� �մϴ�.");
			break;
		default:
			System.out.println("�ùٸ��� ���� �Է°��Դϴ�.");
			break;
		}
		
		
		// ����4) for���� "*"�� �̿��Ͽ� �Ʒ��� ���� ����ϵ��� �ϼ���.
		// *
		// **
		// ***
		// ****
		// *****
		
		for(int i = 1; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}System.out.println();
		}
		

		// ����5) ���ʴ�� m�� n�� �Է¹޾� m���� n��°���� ����ϵ��� �ϼ���.
		// ���� ��� 2�� 3�� �Է¹޾��� ��� �Ʒ�ó�� ����մϴ�.
		// 2 X 1 = 2
		// 2 X 2 = 4
		// 2 X 3 = 6

		System.out.println("����� ���� �Է� �ϼ���.");
		int num1 = Integer.parseInt(scanner.nextLine());
		System.out.println("���°���� ����ұ��?");
		int num2 = Integer.parseInt(scanner.nextLine());
		
		for(int i = 1; i <= num2; i++) {
			System.out.printf("%d * %d = %d\n", num1, i, (num1 * i));
		}
		
	}
}
