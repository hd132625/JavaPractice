package org.dimigo.thread;

public class SyncTest {
	private int data=0;
	
	public static void main(String[] args){
		SyncTest s = new SyncTest();
		
		Thread t1 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+" start");
				s.add();
			}
			
		});
		
		Thread t2 = new Thread(new Runnable(){

			@Override
			public void run() {
				// TODO Auto-generated method stub
				System.out.println(Thread.currentThread().getName()+" start");
				s.add();
			}
			
		});
		
		
		t1.start();
		t2.start();
		
		// 다른 스레드가 완료될때까지 기다리기
		try{
			t1.join();
			t2.join();
		}catch(InterruptedException e){
			e.printStackTrace();
		}
		System.out.println("Data : "+s.data);
	}
	
	private void add(){
		for(int i=0; i<10000; i++){
			synchronized(this){
				data++;
			}
		}
	}
}
