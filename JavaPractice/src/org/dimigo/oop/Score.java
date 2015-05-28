package org.dimigo.oop;
import java.util.Scanner;

public class Score {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int kor, math, eng;
		
		System.out.printf("���� ���� �Է� => ");
		kor = sc.nextInt();
		System.out.printf("���� ���� �Է� => ");
		math = sc.nextInt();
		System.out.printf("���� ���� �Է� => ");
		eng = sc.nextInt();
		
		String display = new StringBuilder().append("<<���� ���>>\n")
				.append("���� ���� : "+kor+"��\n")
				.append("���� ���� : "+math+"��\n")
				.append("���� ���� : "+eng+"��\n")
				.append("���� : "+(kor+eng+math)+"��\n")
				.append("��� : "+String.format("%.1f", (kor+eng+math)/3.0)+"��\n").toString();
		System.out.println(display);
		sc.close();
	}
}
