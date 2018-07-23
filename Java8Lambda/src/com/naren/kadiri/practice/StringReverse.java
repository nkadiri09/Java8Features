//String reverse with Recursieve

package com.naren.kadiri.practice;

import java.util.Scanner;

public class StringReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String string = sc.nextLine();
		StringReverse sr = new StringReverse();
		System.out.println("String after reverse: " + sr.makeReverse(string));
	}

	private String makeReverse(String str) {
		int length = str.length();
		if (length < 0 || str.isEmpty())
			return str;
		return makeReverse(str.substring(1)) + str.charAt(0);
	}

}
