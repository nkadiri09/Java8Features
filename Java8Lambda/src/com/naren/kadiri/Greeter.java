package com.naren.kadiri;

public class Greeter {

	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter g = new Greeter();
		HelloWorldGreeting hwg = new HelloWorldGreeting();
		// g.greet(hwg);

		MyClass myLambdaExpression = () -> System.out.println("Hello World!");
		myLambdaExpression.foo();

		Greeting greeting = new Greeting() {
			public void perform() {
				System.out.println("anotehr Helloworld");
			}
		};

		greeting.perform();
	}
}
