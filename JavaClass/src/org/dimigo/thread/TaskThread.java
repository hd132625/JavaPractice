package org.dimigo.thread;

import java.util.*;

public class TaskThread extends Thread{
	private String name;
	private int time;
	
	public TaskThread(String name){
		this.name = name;
		time = new Random().nextInt(10000);
	}
	
	public void run(){
		System.out.println(name + " start");
		System.out.println(name + "'s sleep time : "+time);
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " end");
	}
}
