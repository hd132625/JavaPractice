package org.dimigo.oop;

public class Calculator2 {
	public static int count=0;
	Calculator2(){
		Calculator2.count++;
	}
	boolean powerFlag;
	public void powerOn(){
		System.out.println("전원 켜짐");
		powerFlag = true;
	}
	public void powerOff(){
		System.out.println("전원 꺼짐");
		powerFlag = false;
	}
	
	public static int add(int num1, int num2, Calculator2 c){
		if (c.powerFlag!=true) c.powerOn();
		return num1+num2;
	}
	public static int sub(int num1, int num2, Calculator2 c){	
		if (c.powerFlag!=true) c.powerOn();
		return num1-num2;
	}
	public static int mul(int num1, int num2, Calculator2 c){
		if (c.powerFlag!=true) c.powerOn();
		return num1*num2;
	}
	public static double div(int num1, int num2, Calculator2 c){
		if (c.powerFlag!=true) c.powerOn();
		return num1/(double)num2;
	}
	
	public static int add(int num1, int num2){
		return num1+num2;
	}
	public static int sub(int num1, int num2){		
		return num1-num2;
	}
	public static int mul(int num1, int num2){
		return num1*num2;
	}
	public static double div(int num1, int num2){
		return num1/(double)num2;
	}
	
	public static void count_display(){
		System.out.println("개수 : "+Calculator2.count);
	}
	
}
