package org.dimigo.basic;

public class StringConcat {
	public static void main(String[] args){
		String school = "��̰�";
		int grade = 2;
		int ban = 6;
		String name = "���ڹ�";
		
		System.out.println(school+grade+ban+name);
		
		//26��̰���ڹٸ� ����Ϸ���?
		System.out.println(""+grade+ban+school+name);
		System.out.println(grade+(ban+school)+name);
	}
}
