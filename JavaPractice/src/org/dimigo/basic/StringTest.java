package org.dimigo.basic;

public class StringTest {
	public static void main(String[] args){
		String dog1 = "�۸���";
		String dog2 = "�۸���";
		
		String cat1 = new String("�߿���");
		String cat2 = new String("�߿���");
		
		System.out.println(dog1 == dog2);
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));
	}
}
