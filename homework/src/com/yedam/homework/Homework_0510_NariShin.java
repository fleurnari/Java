package com.yedam.homework;

import java.util.Arrays;
import java.util.Scanner;

public class Homework_0510_NariShin {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//�־��� �迭�� �̿��Ͽ� ���� ������ �����ϼ���.
		int[] arr1 = { 10, 20, 30, 50, 3, 60, -3 };
		
		//����1. �־��� �迭 �߿��� ���� 60�� ���� �ε����� ����غ���.
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == 60) {
				System.out.println("���� 6�� ���� �ε��� ��ȣ : " + i + "��");;
			}
			
		}
		
		//����2. �־��� �迭�� �ε����� 3�� ���� ������� ����, �������� ����غ���.
		for(int i = 0; i < arr1.length; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println("arr1[" + i + "] : " + arr1[i]);
		}
		
		//����3. �־��� �迭 ���� �����ϰ� ���� ���� �ε��� ��ȣ�� �Է¹޾�, �� ���� 1000���� �����غ���.
  		//   �Է�) �ε���: 3 ->   {10, 20, 30, 1000, 3, 60, -3}
		System.out.println("�����ϰ� ���� �ε��� ��ȣ�� �Է��ϼ���.");
		int indNum = Integer.parseInt(sc.nextLine());
		arr1[indNum] = 1000;
		System.out.println(Arrays.toString(arr1));
		
		
		//����4. ������ �迭�� �����Ͽ� ���� ���� 10���� �Է¹޾� �迭�� �����ϰ�, �迭�� �ִ� ���� �߿��� 3�� ����� ����غ���.
		int[] tmpArray = new int[10];
		
		for (int i = 0; i < tmpArray.length; i++) {
			System.out.println("�迭�� ������ ���ڸ� �Է��ϼ���.");
			int data = Integer.parseInt(sc.nextLine());
			tmpArray[i] = data;
		}
		
		System.out.println(Arrays.toString(tmpArray));
		
		for (int i = 0; i < tmpArray.length; i++) {
			if (tmpArray[i] % 3 == 0) {
				System.out.println("3�� ��� tmpArray[" + i + "] : " + tmpArray[i]);
			}
		}
		

		//�߰�����
		//X���� M�������� ���α׷��� ������ �ð� �ִ�. ���ǿ� �л��� 30���� �ִµ�, �л� ��ο� �� �л����� 1������ 30������ �⼮��ȣ�� �پ� �ִ�.
		//�������� ���� Ư�������� 28���� �����ߴµ�, �� �߿��� ���� �� �� �л� 2���� �⼮��ȣ�� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
		//���� : ���� https://www.acmicpc.net/problem/5597
		
		int[] studentNum = new int[30];
		
		System.out.println("������ ������ �л��� ��ȣ�� �Է��ϼ���.");
		for(int i = 1; i <= 28; i++) {
			studentNum[sc.nextInt() - 1]++;
		}
		
		for(int i = 0; i < 30; i++) {
			if (studentNum[i] == 0) {
				System.out.println(i + 1);
			}
		}
		
	 }
	}