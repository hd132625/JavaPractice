package org.dimigo.thread;

public class Runner2 implements Runnable {
	private String name;
	
	public Runner2(){}
	
	public Runner2(String name) {
		super();
		this.name = name;
	}
	
	public void run(){
		System.out.println(name+" 출발");
		for(int i=100; i>=0; i--){
			if(i%10==0){
				System.out.println(name+" "+i+" 미터");
			}
		}
		System.out.println(name+" 골인");
	}
	
}
