package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		String carType = "��ӹ���";
		int distance = 10;
		int charge = 0;
		int plus = 0;
		switch(carType){
		case "��ӹ���":
			plus = 300;
			charge = 850;
			break;
		case "����":
			plus = 200;
			charge = 300;
			break;
		case "�� ��":
			plus = 200;
			charge = 600;
			break;
		}
		if(distance>10) charge+=(distance/10)*plus;
		System.out.println("<< ��ӵ��� ����� ��� >>");
		System.out.println("�Ÿ� : "+distance+"km");
		System.out.println("���� : "+carType);
		System.out.println("����� : "+charge+"��");
	}
}
