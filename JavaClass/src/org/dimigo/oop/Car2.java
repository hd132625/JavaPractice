package org.dimigo.oop;

public class Car2 {
	//인스턴스
	private String name;
	
	//정적 필드
	private static String company;
	
	public Car2(String name){
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public static String getCompany() {
		return company;
	}

	public static void setCompany(String company) {
		Car2.company = company;
	}
	
	public void printCar(){
		System.out.println(this.name+", "+Car2.company);
	}
	
	public void printCar2(){
		System.out.println(getName()+", "+getCompany());
	}
	
	public static void printCar3(Car2 car){
		System.out.println(car.name+", "+company);
	}
	
	public static void printCar4(Car2 car){
		System.out.println(car.getName()+", "+getCompany());
	}
}
