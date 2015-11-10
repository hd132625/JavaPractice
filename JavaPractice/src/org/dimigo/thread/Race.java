package org.dimigo.thread;

public class Race {
	public static void main(String[] args){
		System.out.println("main thread start");
		Runner r1 = new Runner("홍길동");
		Runner r2 = new Runner("홍길순");
		r1.start();
		r2.start();
		System.out.println("main thread end");
	}
}
