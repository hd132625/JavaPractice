package org.dimigo.oop;

public class Snack {
	private String name;
	private String company;
	private int price;
	private int number;
	
	public Snack(){}
	public Snack(String name, String company, int price, int number) {
		this.name = name;
		this.company = company;
		this.price = price;
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
	public void printSnack(){
		System.out.println("이름 : "+this.name);
		System.out.println("제조사 : "+this.company);
		System.out.println("가격 : "+String.format("%,d",  price)+"원");
		System.out.println("개수 : "+number+"개");
	}
	
	public int calcPrice(){
		return price*number;
	}
	
	
	public static void main(String[] args){
		Snack snack[] = {new Snack("새우깡", "농심", 1100, 2),
				new Snack("콘칲", "크라운", 1200, 1),
				new Snack("허니버터칩", "해태", 1500, 4)};
		int sum=0;
		for(int i=0; i<3; i++){
			snack[i].printSnack();
			System.out.println();
			sum+=snack[i].calcPrice();
		}
		System.out.println("총 구매 금액 : "+String.format("%,d", sum)+"원");
	}
}
