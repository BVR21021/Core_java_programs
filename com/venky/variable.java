package com.venky;

import java.util.Scanner;

public class variable {

	public static void main(String[] args) {

		String s1 = "venky";
		String s2 = "venky";
		boolean flag = false;
		int count = 0;
		if (s1.length() == s2.length()) {
			
			for (int i = 0; i < s1.length(); i++) {

				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						count++;
					}
				}
			}
			if (count == s1.length()) {
				System.out.println("Both Strings are Equal");
			} else {
				System.out.println("Strings are not equal");
			}
		} else {
			System.out.println("Strings are not Equal.......");
		}
	}

}
