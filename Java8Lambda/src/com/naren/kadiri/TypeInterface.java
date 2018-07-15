package com.naren.kadiri;

public class TypeInterface {

	public static void main(String[] args) {

		printFunction(s -> s.length());

	}

	public static void printFunction(StringLambda sl) {
		System.out.println(sl.StringLength("Hello world!"));

	}

	interface StringLambda {
		int StringLength(String str);
	}

}
