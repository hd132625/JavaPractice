package org.dimigo.basic;

public class IfElse {
	public static void main(String[] args){
		// �ߴ޴ܰ迡 ���� ���� ����
		// 0~6 ���Ʊ�
		// 7~12 : �Ƶ���
		// 13~15 : �����
		// 16~24 : û���
		int age = 18;
		if(age<0) {
			System.out.println("���̴� ����� �����մϴ�.");
			return;
		}
		if(age>=0&&age<=6) System.out.println("���Ʊ��Դϴ�.");
		else if (age>=7&&age<=12) System.out.println("�Ƶ����Դϴ�.");
		else if (age>=13&&age<=15) System.out.println("������Դϴ�.");
		else if (age>=16&&age<=24) System.out.println("û����Դϴ�.");
		else System.out.println("�����Դϴ�.");
		
		int i = 5;
		if(i>10){
			if(i<100)
				System.out.println("10���� ũ�� 100���� �۴�.");
		}
		else {
			System.out.println("10���� �۰ų� ����.");
		}
		
	}
}
