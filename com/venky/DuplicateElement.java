
package com.venky;

import java.util.Scanner;

public class DuplicateElement {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int count = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr a number to check:");
		int n = sc.nextInt();
		for (int a : arr) {
			if (a == n) {
				count++;
			}
		}
		if (count == 0) {
			System.out.println("element not found...");
		} else if (count == 1) {
			System.out.println("Element not duplicate....");
		} else {
			System.out.println("Duplicate element");
		}

	}

}
