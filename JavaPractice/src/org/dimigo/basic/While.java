package org.dimigo.basic;

import java.util.Scanner;

public class While {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int menu;
		
		// <게임 메뉴>>
		// 1. 공격
		// 2. 수비
		// 3. 종료
		
		do{
			System.out.println("-----------------------------");
			System.out.println("<< 게임 메뉴 >>");
			System.out.println("1. 공격");
			System.out.println("2. 수비");
			System.out.println("3. 종료");
			System.out.printf("메뉴 입력 => ");
			menu = sc.nextInt();
			switch(menu){
			case 1:
				System.out.println("공격하라 !!!");
				break;
			case  2:
				System.out.println("수비하라 !!!");
				break;
			case 3:
				System.out.println("게임 종료");
				break;
			default:
				System.out.println("없는 메뉴입니다.");
				break;
			}
		} while(menu!=3);
		sc.close();
	}
}
