package com.naren.kadiri;

public class ThreadExample {

	public static void main(String[] args) {

		Thread thread = new Thread(() -> System.out.println("Thread Running"));
		thread.run();
	}

}
