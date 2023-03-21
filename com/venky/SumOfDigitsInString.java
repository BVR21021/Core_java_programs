package com.venky;

public class SumOfDigitsInString {

	public static void main(String[] args) {

		String s = "vEnKy715";
		String s1 = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) >= 'A' && s.charAt(i) <= 'Z') {

				char ch = (char) (s.charAt(i) + 32);
				s1 = s1 + ch;
			} else if (s.charAt(i) >= 'a' && s.charAt(i) <= 'z') {
				char ch = (char) (s.charAt(i) - 32);
				s1 = s1 + ch;
			} else {
				s1 = s1 + s.charAt(i);
			}
		}
		System.out.println("changed string is:" + s1);
	}

}
