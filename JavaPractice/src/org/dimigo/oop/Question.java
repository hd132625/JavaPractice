package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a1 = "��������";
		String a2 = "����";
		String a3 = "���� ����";	
		
		System.out.println("���� �����ϴ� ������?");
		if(a1.equals(sc.nextLine())) System.out.println("�����Դϴ�!");
		else System.out.println("Ʋ�Ƚ��ϴ�!");
		System.out.println("���� �����ϴ� ĳ���ʹ�?");
		if(a2.equals(sc.nextLine())) System.out.println("�����Դϴ�!");
		else System.out.println("Ʋ�Ƚ��ϴ�!");
		System.out.println("���� ��̴�?");
		if(a3.equals(sc.nextLine())) System.out.println("�����Դϴ�!");
		else System.out.println("Ʋ�Ƚ��ϴ�!");
		
		sc.close();
	}
}
