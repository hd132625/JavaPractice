package org.dimigo.oop;

public class Calculator {
	private int num1;
	private int num2;
	private boolean powerFlag;
	
	Calculator(){}
	Calculator(int num1, int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void powerOn(){
		System.out.println("전원을 켭니다.");
		this.powerFlag = true;
	}
	public void powerOff(){
		System.out.println("전원을 끕니다.");
		this.powerFlag = false;
	}
	
	public int add(){
		if(this.powerFlag==false) this.powerOn();
		return this.num1+this.num2;
	}
	public int sub(){
		if(this.powerFlag==false) this.powerOn();
		return this.num1-this.num2;
	}
	public int mul(){
		if(this.powerFlag==false) this.powerOn();
		return this.num1*this.num2;
	}
	public double div(){
		if(this.powerFlag==false) this.powerOn();
		return this.num1/(double)this.num2;
	}
}
