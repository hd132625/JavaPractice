package org.dimigo.thread;

import java.util.Random;

public class MultiThreadTest {
	public static void main(String[] args){
		System.out.println("main thread start");
		
		Thread t1 = new TaskThread("one");
		Thread t2 = new TaskThread("two");
		Thread t3 = new Thread(){
			String name = "three";
			int time = new Random().nextInt(10000);
		};
		t1.start();
		t2.start();
		
		System.out.println("main thread end");
	}
}
