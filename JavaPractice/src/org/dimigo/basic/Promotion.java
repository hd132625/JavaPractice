package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args){
		long wage = 1700000;
		int employ = 3;
		int shop = 1500;
		long sum = wage*employ*shop*12;
		System.out.println("<<��̺��� ���� �ΰǺ�>>");
		System.out.println("�� ��� �޿� : "+String.format("%,d", wage)+"��");
		System.out.println("���� �� ���� �� : "+employ+"��");
		System.out.println("���� �� : "+String.format("%,d", shop)+"��\n");
		System.out.println("���� �ΰǺ� : "+String.format("%,d", sum)+"��");
	}
}
