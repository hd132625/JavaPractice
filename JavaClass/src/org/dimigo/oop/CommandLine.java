package org.dimigo.oop;

import java.util.Arrays;

public class CommandLine {
	public static void main(String[] args){
		if(args.length != 2){
			System.out.println("프로그램 사용법 : java CommandLine arg1 arg2");
			System.exit(0);
		}
		
		System.out.println(Arrays.toString(args));
		String num1 = args[0];
		String num2 = args[1];
		
		System.out.println(Integer.parseInt(num1)+Integer.parseInt(num2));
		
		
	}
}
