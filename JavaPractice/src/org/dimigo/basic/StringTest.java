package org.dimigo.basic;

public class StringTest {
	public static void main(String[] args){
		String dog1 = "港港捞";
		String dog2 = "港港捞";
		
		String cat1 = new String("具克捞");
		String cat2 = new String("具侩捞");
		
		System.out.println(dog1 == dog2);
		System.out.println(cat1 == cat2);
		System.out.println(cat1.equals(cat2));
	}
}
