package org.dimigo.basic;

public class For {
	public static void main(String[] args){
		//for��
		System.out.println("<< ��ȣ ����ϱ� >>");
		for(int i=1; i<=37; i++){
			if(i%10==0) System.out.println((i/10)*10+" ����");
			System.out.println(i+" ��");
		}
		
		//������ ����ϱ�
		System.out.println("<< ������ ����ϱ� >>");
		for(int i=2; i<=9; i++){
			System.out.println("< "+i+"�� >");
			for(int j=1; j<=9; j++){
				System.out.printf("%d * %d = %d\t", i, j, i*j);
			}
			System.out.println("");
		}
		
		//�迭 ����
		int[] intArr = {10, 20, 30};
		for(int i=0; i<intArr.length; i++){
			System.out.println(intArr[i]);
		}
		
		// for-each ��
		for(int value : intArr){
			System.out.println(value);
		}
		
		System.out.println("<< ���ѵ��� ��� >>");
		String[] member = {"���缮", "������", "�ڸ��", "����", "������"};
		for(String value : member){
			System.out.println(value);
		}
	}
}
