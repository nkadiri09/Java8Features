package com.naren.kadiri;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter g = new Greeter();
		HelloWorldGreeting hwg = new HelloWorldGreeting();
		g.greet(hwg);
	}
}
