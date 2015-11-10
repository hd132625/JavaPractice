package org.dimigo.thread;

public class InterruptTest {
	public static void main(String[] args){
		Thread t = new Thread(new Runnable(){
			
			@Override
			public void run(){
				String name = Thread.currentThread().getName();
				System.out.println(name + " start");
				
				while(true){
					System.out.println(name + " is running");
					if(Thread.interrupted()){
						System.out.println("실행 중 interrupt 걸림");
						break;
					}
					try{
						Thread.sleep(100);
					} catch(InterruptedException e){
						System.out.println("sleep 중에 interrupt 됨");
						break;
					}
				}
				System.out.println(name+ " end");
			}
		});		
		t.start();
		t.interrupt();
	}
}
