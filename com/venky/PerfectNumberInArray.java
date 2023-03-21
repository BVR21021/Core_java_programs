package com.venky;

public class PerfectNumberInArray {
	public static void main(String[] args) {
		int arr[] = { 2, 2, 3, 1, 5, 6, 7, 8, 9 };
		int count = 0;
		int sum = 0;
		for (int a : arr) {
			int n = a;
			for (int i = 1; i < a; i++) {
				if (n % i == 0) {
					sum = sum + i;
				}

			}
			if (n == sum) {
				System.out.println(n + "is perfect number...");
			}
		}
	}

}
