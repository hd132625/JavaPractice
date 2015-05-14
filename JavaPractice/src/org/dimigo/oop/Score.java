package org.dimigo.oop;
import java.util.Scanner;

public class Score {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kor, math, eng;
		
		System.out.printf("국어 점수 입력 => ");
		kor = sc.nextInt();
		System.out.printf("수학 점수 입력 => ");
		math = sc.nextInt();
		System.out.printf("영어 점수 입력 => ");
		eng = sc.nextInt();
		
		String display = new StringBuilder().append("<<점수 출력>>\n")
				.append("국어 점수 : "+kor+"점\n")
				.append("수학 점수 : "+math+"점\n")
				.append("영어 점수 : "+eng+"점\n")
				.append("총점 : "+(kor+eng+math)+"점\n")
				.append("평균 : "+String.format("%.1f", (kor+eng+math)/3.0)+"점\n").toString();
		System.out.println(display);
	}
}
