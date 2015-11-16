package org.dimigo.thread;

public class Account {
	private int balance;
	
	public Account(int balance){
		this.balance = balance;
	}
	
	public void deposit(int money){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		synchronized(this){
			this.balance += money;
		}
		System.out.println(money+"원 입금 => 현재 잔고  : "+this.balance);
	}
	
	public void withdraw(int money){
		try {
			Thread.sleep(1);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(this.balance>=money){
			synchronized(this){
				this.balance -= money;
			}
			System.out.println(money+"원 출금 => 현재 잔고 : "+this.balance);
		}
	}

	public int getBalance() {
		return balance;
	}
	
	
}
