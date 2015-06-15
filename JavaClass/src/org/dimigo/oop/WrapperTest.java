package org.dimigo.oop;

public class WrapperTest {
	public static void main(String[] args){
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.MAX_VALUE);
		
		Integer num1 = new Integer(1000);
		Integer num2 = new Integer(1000);
		
		if(num1.equals(num2)){
			System.out.println("같은 객체");
		}
		else {
			System.out.println("다른 객체");
		}
		
		//Boxing
		Integer obj1 = new Integer(1000);
		Double obj2 = new Double(3.14);
		Integer obj3 = Integer.valueOf("2000");
		
		//Unboxing - xxxValue() 메소드 이용하기
		int i1 = obj1.intValue();
		double d1 = obj2.doubleValue();
		
		// 문자열을 기본 자료형으로 바꾸기 - parseXxx()
		
		int i2 = Integer.parseInt("2000");
		
	}
}
