package org.dimigo.oop;

public class Car {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	
	public String getCompany(){
		return company;
	}
	public String getModel(){
		return model;
	}
	public String getColor(){
		return color;
	}
	public int getMaxSpeed(){
		return maxSpeed;
	}
	public int getPrice(){
		return price;
	}
	public void setCompany(String str){
		company = str;
	}
	public void setModel(String str){
		model = str;
	}
	public void setColor(String str){
		color = str;
	}
	public void setMaxSpeed(int num){
		maxSpeed = num;
	}
	public void setPrice(int num){
		price = num;
	}
	

	
}
