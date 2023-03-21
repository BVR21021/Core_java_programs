package com.venky;

public class StringTesting {

	public static void main(String[] args) {

		String s = "venky";
		String s1 = "venky";
		if (s.equals(s1)) {
			System.out.println("immutable..");
		} else {
			System.out.println("not immutable..");
		}

	}

}
