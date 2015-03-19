package org.dimigo.basic;

public class ArithmeticOperator {
	public static void main(String[] args){
		int a = 5, b = 2;
		double result = (double)a/b;
		System.out.println(result);
		
		double d = 3.14;
		int i = 10;
		int r = (int)(d+i);
		double r1 = d+i;
		System.out.println(r+"\n"+r1);
		
		short s1=1, s2=2;
		int r2 = s1+s2;
		short r3 = (short)(s1+s2);
		System.out.println(r3);
		System.out.println(r2);
	}
}
