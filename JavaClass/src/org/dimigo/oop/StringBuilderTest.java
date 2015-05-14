package org.dimigo.oop;

public class StringBuilderTest {
	public static void main(String[] args){
		String str = "��̰� ";
		str+="2�г� ";
		str+="6�� ";
		str+="25�� ";
		str+="������";
		System.out.println(str);
		
		StringBuilder sb = new StringBuilder();
		sb.append("��̰� ");
		sb.append("2�г� ");
		sb.append("6�� ");
		sb.append("25�� ");
		sb.append("������ ");
		System.out.println(sb.toString());
		
		String sb1 = new StringBuilder().append("��̰�  ").append("2�г� ").append("6�� ").append("25�� ").append("������ ").toString();
		System.out.println(sb1);
		
		
		
		
		long start = System.currentTimeMillis();
		StringBuilder test1 = new StringBuilder("abc");
		for(int i = 0; i<100000; i++){
			test1.append("def");
		}
		long end = System.currentTimeMillis();
		System.out.println(end - start);
		
		
		
	}
}
