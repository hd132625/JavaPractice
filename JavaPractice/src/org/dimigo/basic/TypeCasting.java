package org.dimigo.basic;

public class TypeCasting {
	public static void main(String[] args) {
		byte b = 100;
		short s = b;
		int i = s;
		long l = i;
		
		System.out.println(b + " " + s + " " + i + " " + l);
		
		System.out.println(b + " " + s + " " + i + " " + l);
		
		long l2 = 10000000000l;
		int i3 = (int)l2;
		System.out.println(i3);
	}
}
