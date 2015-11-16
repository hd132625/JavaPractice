package org.dimigo.thread;

public class AccountTest {
	public static void main(String[] args){
		Account account = new Account(10000);
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<5; i++){
					account.deposit(2000);
				}
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				for(int i=0; i<3; i++){
					account.withdraw(3000);
				}
			}
			
		});
		
		t1.start();
		t2.start();
		try{
			t1.join();
			t2.join();
		} catch(Exception e){
			e.printStackTrace();
		}
		System.out.println("최종 잔액 : "+account.getBalance());
	}
}
