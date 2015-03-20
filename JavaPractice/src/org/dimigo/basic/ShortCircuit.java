package org.dimigo.basic;

public class ShortCircuit {
	public static void main(String[] args){
		boolean flag = true;
		int a = 10;
		if(flag||(a/0==0)){
			System.out.println("OR 연산");	
		}
		if(!flag&&(a/0==0)){
			System.out.println("AND 연산");	
		}
	}
}
