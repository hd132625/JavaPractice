package org.dimigo.abstractclass;

public class SmartPhoneTest {
	public static void main(String[] args){
		SmartPhone i = new IPhone("iPhone 6", "애플", 700000);
		SmartPhone g = new Galaxy("갤럭시 S6", "삼성", 650000);
		
		System.out.println(i.toString());
		i.turnOn();
		((IPhone)i).pay();
		i.useSpecialFunction(i);
		i.turnOff();
		
		System.out.println();
		
		System.out.println(g.toString());
		g.turnOn();
		g.pay();
		g.useSpecialFunction(g);
		g.turnOff();
	}
}
