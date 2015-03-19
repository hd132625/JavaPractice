package org.dimigo.basic;

public class Promotion {
	public static void main(String[] args){
		long wage = 1700000;
		int employ = 3;
		int shop = 1500;
		long sum = wage*employ*shop*12;
		System.out.println("<<디미베네 연간 인건비>>");
		System.out.println("월 평균 급여 : "+String.format("%,d", wage)+"원");
		System.out.println("점포 내 직원 수 : "+employ+"명");
		System.out.println("점포 수 : "+String.format("%,d", shop)+"개\n");
		System.out.println("연간 인건비 : "+String.format("%,d", sum)+"원");
	}
}
