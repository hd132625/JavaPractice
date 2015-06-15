package org.dimigo.oop;

public class CarTest2 {
	public static void main(String[] args){
		Car2.setCompany("현대");
		
		Car2[] cars = {
				new Car2("아반떼"), new Car2("제네시스"), new Car2("아슬란"), new Car2("그랜져")
		};
		
		for(Car2 car:cars){
			car.printCar();
		}
	}
}
