package org.dimigo.basic;

public class Switch {
	public static void main(String[] args){
		// �ֻ��� ��ȣ �̱� (1~6)
//		for(int i = 0; i<10; i++){
//			int random = (int)(Math.random()*6)+1;
//			System.out.println(random);
//		}
		
		int num = (int)(Math.random()*6)+1;
		switch(num%2){
		case 0:
			System.out.println("¦���Դϴ�.");
			break;
		case 1:
			System.out.println("Ȧ���Դϴ�.");
			break;
		default:
			System.out.println("�� ������!!");
		}
		
		// ���ڿ� ��
		String season = "��";
		switch(season){
		case "��":
			System.out.println("�����ϳ׿�...");
			break;
		case "����":
			System.out.println("���׿�...");
			break;
		case "����":
			System.out.println("�ҽ��ϳ׿�...");
			break;
		case "�ܿ�":
			System.out.println("��׿�...");
			break;
		default:
			System.out.println("�� ������!!");
			break;
		}
	}
}
