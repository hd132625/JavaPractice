package org.dimigo.inheritance;

import java.lang.Math;

public class Circle extends Figure{
	private int radius;

	public Circle(int radius) {
		super();
		this.radius = radius;
	}

	public Circle(int centerX, int centerY) {
		super(centerX, centerY);
		// TODO Auto-generated constructor stub
	}
	
	protected double calcArea(){
		return radius*radius*Math.PI;
	}
	
	protected void printCenter(){
		System.out.println("원 중심좌표 : ("+centerX+", "+centerY+")");
	}
	
}
