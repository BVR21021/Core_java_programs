package com.venky;

import java.util.Arrays;

public class BubbolSort {
	int count = 0;

	public static void main(String[] args) {
		int[] arr = { 10, 50, 40, 30, 20 };
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
