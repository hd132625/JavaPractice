package org.dimigo.oop;

public class Car3 {
	private String company;
	private String model;
	private String color;
	private int maxSpeed;
	private int price;
	public Car3(){}
	public Car3(String company, String model, String color, int maxSpeed,int price){
		this.company = company;
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
		this.price = price;
	}
	
	public Car3(String company, String model, String color, int maxSpeed){
		this(company, model, color, 0, 0);
	}
	
	public Car3(String company, String model, String color){
		this(company, model, color, 0);
	}
	
	public Car3(String company, String model){
		this(company, model, "Null");
	}
	
	public Car3(String company){
		this(company, "Null");
	}
	
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
	
	public void display(){
		System.out.println("������� : "+company);
		System.out.println("�𵨸� : "+model);
		System.out.println("���� : "+color);
		System.out.println("�ִ�ӵ� : "+maxSpeed+"km");
		System.out.println("���� : "+String.format("%,d", price)+"��");
	}
	
}
