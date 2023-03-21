package com.venky;

import java.util.Scanner;

public class DigitsInStringDriveQ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the String:");
		String s = sc.next();
		int count = 0, sum = 0;
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			if (ch >= '0' && ch <= '9') {
				count++;
				sum = sum + (ch - 48);
			}
		}
		System.out.println("count:" + count);
		System.out.println("sum:" + sum);
		if (sum % 2 == 0) {
			System.out.println("sum is even...");
		} else {
			System.out.println("sum is odd");
		}
	}

}
