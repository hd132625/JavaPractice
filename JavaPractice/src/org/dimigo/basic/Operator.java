package org.dimigo.basic;

public class Operator {
	public static void main(String[] args){
		double trapezoid_h = 5.8;
		int trapezoid_a = 9;
		int trapezoid_b = 10;
		
		double pararell_h = 5.4;
		int pararell_a = 9;
		
		double trapezoid = (trapezoid_h*(trapezoid_a+trapezoid_b))/2;
		double pararell = pararell_h*pararell_a;
		
		System.out.println("<< ���� ���� �� >>");
		System.out.println("��ٸ��� ���� : "+trapezoid);
		System.out.println("����纯�� ���� : "+pararell);
		if(trapezoid>pararell) System.out.println("��ٸ����� ����纯������ "+(trapezoid-pararell)+" �� Ů�ϴ�.");
		else if (pararell>trapezoid) System.out.println("����纯���� ��ٸ��ú��� "+(pararell-trapezoid)+"�� Ů�ϴ�.");
		else System.out.println("�� ������ ���̴� "+pararell+"�� �����ϴ�.");
	}
}
