package org.dimigo.oop;

public class CalculatorTest {
	public static void main(String[] args){
		Calculator cal1 = new Calculator(10, 20);
		System.out.println("<< 실행 결과 >>");
		//cal1.powerOn();
		System.out.println("10 + 20 = "+cal1.add());
		System.out.println("10 - 20 = "+cal1.sub());
		System.out.println("10 * 20 = "+cal1.mul());
		System.out.println("10 / 20 = "+cal1.div());
		cal1.powerOff();
	}
}
