package org.dimigo.basic;

public class Operator {
	public static void main(String[] args){
		double trapezoid_h = 5.8;
		int trapezoid_a = 9;
		int trapezoid_b = 10;
		
		double pararell_h = 5.4;
		int pararell_a = 9;
		
		double trapezoid = (trapezoid_h*(trapezoid_a+trapezoid_b))/2;
		double pararell = pararell_h*pararell_a;
		
		System.out.println("<< 도형 넓이 비교 >>");
		System.out.println("사다리꼴 넓이 : "+trapezoid);
		System.out.println("평행사변형 넓이 : "+pararell);
		if(trapezoid>pararell) System.out.println("사다리꼴이 평행사변형보다 "+(trapezoid-pararell)+" 더 큽니다.");
		else if (pararell>trapezoid) System.out.println("평행사변형이 사다리꼴보다 "+(pararell-trapezoid)+"더 큽니다.");
		else System.out.println("두 도형의 넓이는 "+pararell+"로 같습니다.");
	}
}
