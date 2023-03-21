package com.venky;

public class ReturnArrayFromMethod {

	public static void main(String[] args) {
		int[] x = ReturnArrayFromMethod.print();
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}
	}

	public static int[] print() {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
		return a;
	}
}
