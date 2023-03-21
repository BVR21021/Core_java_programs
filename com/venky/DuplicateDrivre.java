package com.venky;

import java.util.Arrays;

public class DuplicateDrivre {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 2, 1, 3, 4, 5, 4 };

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					arr[i] = 0;
					count++;
				}

			}
		}
		System.out.println(Arrays.toString(arr) + "-" + count);
		int[] arr1 = new int[arr.length - count];
		int temp = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr1[i] = arr[i];

			}

		}

	}

}
