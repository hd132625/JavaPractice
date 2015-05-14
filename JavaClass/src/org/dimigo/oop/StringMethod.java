package org.dimigo.oop;

public class StringMethod {
	public static void main(String[] args){
		String s = "abcdefgABCDEFG";
		
		System.out.println(s.length());
		System.out.println(s.substring(3));
		System.out.println(s.substring(3, 6));
		System.out.println(s.indexOf("C"));
		System.out.println(s.charAt(7));
		System.out.println(s.concat("ABC"));
		System.out.println("   abcd    ".trim());
		System.out.println(s.toUpperCase());
		System.out.println(s.toLowerCase());
		System.out.println(s.replace('a', 'A'));
		System.out.println(s.startsWith("abc"));
		System.out.println(s.endsWith("EFG"));
	}
}
