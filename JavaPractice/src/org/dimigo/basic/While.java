package org.dimigo.basic;

import java.util.Scanner;

public class While {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int menu;
		
		// <���� �޴�>>
		// 1. ����
		// 2. ����
		// 3. ����
		
		do{
			System.out.println("-----------------------------");
			System.out.println("<< ���� �޴� >>");
			System.out.println("1. ����");
			System.out.println("2. ����");
			System.out.println("3. ����");
			System.out.printf("�޴� �Է� => ");
			menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.println("�����϶� !!!");
				break;
			case  2:
				System.out.println("�����϶� !!!");
				break;
			case 3:
				System.out.println("���� ����");
				break;
			default:
				System.out.println("���� �޴��Դϴ�.");
				break;
			}
		} while(menu!=3);
	}
}
