package org.dimigo.oop;

public class CalculatorTest2 {
	public static void main(String[] args){
		System.out.println("<< 실행 결과 >>");
		Calculator2 cal1 = new Calculator2();
		Calculator2 cal2 = new Calculator2();
		//cal1.powerOn();
		System.out.println("10 + 20 = "+Calculator2.add(10, 20));
		System.out.println("10 - 20 = "+Calculator2.sub(10, 20));
		System.out.println("10 * 20 = "+Calculator2.mul(10, 20));
		System.out.println("10 / 20 = "+Calculator2.div(10, 20));
		
		
		
		
		System.out.println("10 + 20 = "+Calculator2.add(10, 20, cal1));
		System.out.println("10 - 20 = "+Calculator2.sub(10, 20, cal1));
		System.out.println("10 * 20 = "+Calculator2.mul(10, 20, cal1));
		System.out.println("10 / 20 = "+Calculator2.div(10, 20, cal1));
		Calculator2.count_display();
	}
}
