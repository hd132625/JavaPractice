package org.dimigo.oop;

import java.util.Scanner;

public class Question {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String a1 = "사이퍼즈";
		String a2 = "샬럿";
		String a3 = "음악 감상";	
		
		System.out.println("가장 좋아하는 게임은?");
		if(a1.equals(sc.nextLine())) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
		System.out.println("가장 좋아하는 캐릭터는?");
		if(a2.equals(sc.nextLine())) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
		System.out.println("나의 취미는?");
		if(a3.equals(sc.nextLine())) System.out.println("정답입니다!");
		else System.out.println("틀렸습니다!");
	}
}
