package com.venky;

import java.util.Scanner;

public class RemoveString {

	public static void main(String[] args) {
		String s = "abcd78";
		String s1 = "";
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the charecter to remove: ");
		char ch = sc.next().charAt(0);

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == ch) {
				s1 = s1 + "";
			} else {
				s1 = s1 + String.valueOf(s.charAt(i));
			}

		}
		System.out.println("remaining word is:" + s1);

	}

}
