package org.dimigo.basic;

public class Condition {
	public static void main(String[] args){
		String carType = "고속버스";
		int distance = 10;
		int charge = 0;
		int plus = 0;
		switch(carType){
		case "고속버스":
			plus = 300;
			charge = 850;
			break;
		case "경차":
			plus = 200;
			charge = 300;
			break;
		case "그 외":
			plus = 200;
			charge = 600;
			break;
		}
		if(distance>10) charge+=(distance/10)*plus;
		System.out.println("<< 고속도로 통행료 계산 >>");
		System.out.println("거리 : "+distance+"km");
		System.out.println("차종 : "+carType);
		System.out.println("통행료 : "+charge+"원");
	}
}
