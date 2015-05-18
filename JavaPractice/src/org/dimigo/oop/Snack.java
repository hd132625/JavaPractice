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
		System.out.println("ÀÌ¸§ : "+this.name);
		System.out.println("Á¦Á¶»ç : "+this.company);
		System.out.println("°¡°Ý : "+String.format("%,d",  price)+"¿ø");
		System.out.println("°³¼ö : "+number+"°³");
	}
	
	public int calcPrice(){
		return price*number;
	}
	
	
	public static void main(String[] args){
		Snack snack[] = {new Snack("»õ¿ì±ø", "³ó½É", 1100, 2),
				new Snack("ÄÜ¯…", "Å©¶ó¿î", 1200, 1),
				new Snack("Çã´Ï¹öÅÍÄ¨", "ÇØÅÂ", 1500, 4)};
		int sum=0;
		for(int i=0; i<3; i++){
			snack[i].printSnack();
			System.out.println();
			sum+=snack[i].calcPrice();
		}
		System.out.println("ÃÑ ±¸¸Å ±Ý¾× : "+String.format("%,d", sum)+"¿ø");
	}
}
