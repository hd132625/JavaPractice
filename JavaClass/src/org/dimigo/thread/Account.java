package org.dimigo.thread;

public class Account {
	private int balance;
	
	public Account(int balance){
		this.balance = balance;
	}
	
	public void deposit(int money){
		this.balance += money;
		System.out.println(money+"원 입금 => 현재 잔고  : "+this.balance);
	}
	
	public void withdraw(int money){
		if(this.balance>=money){
			this.balance -= money;
			System.out.println(money+"원 출금 => 현재 잔고"+this.balance);
		}
	}
}
