package com.venky;

import java.util.Arrays;

public class CreateEvenArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				count++;
			}
		}
		int[] even = new int[count];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				even[j] = arr[i];
				j++;
			}
		}
		System.out.println(Arrays.toString(even));
	}
}
