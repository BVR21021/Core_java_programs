package com.venky;

import java.util.Arrays;

public class CommonEleBothArray {

	public static void main(String[] args) {

		int[] arr1 = { 1, 2, 3, 4, 5, 6 };
		int[] arr2 = { 1, 2, 3 };
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					count++;
				}

			}
		}
		int[] arr3 = new int[count];
		int temp = 0;
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					arr3[temp] = arr1[i];
					temp++;
				}

			}
		}
		System.out.print(Arrays.toString(arr3));

	}

}
