package org.dimigo.inheritance;

public class Figure {
	public int centerX;
	public int centerY;
	public Figure(){
		centerX=0;
		centerY=0;
	}
	public Figure(int centerX, int centerY) {
		super();
		this.centerX = centerX;
		this.centerY = centerY;
	}
	
	protected double calcArea(){
		return 0.0;
	}
	
	protected void printCenter(){
		System.out.println("중심좌표 : ("+centerX+", "+centerY+")");
	}
	
	protected void moveFigure(int x, int y){
		centerX+=x;
		centerY+=y;
	}
	
}
