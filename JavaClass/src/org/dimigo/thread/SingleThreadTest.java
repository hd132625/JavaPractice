package org.dimigo.thread;

import java.util.*;

public class SingleThreadTest {
	public static void main(String[] args){
		System.out.println("main thread start");
		
		Thread t = Thread.currentThread();
		System.out.println(t.getName());
		System.out.println(t.toString());
		
		int time = new Random().nextInt(10000);
		System.out.println("first sleep time : "+time);
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		time = new Random().nextInt(10000);
		System.out.println("second sleep time : "+time);
		
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
