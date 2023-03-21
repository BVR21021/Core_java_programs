package com.venky;

import java.util.Arrays;

public class Duplicats {

	public static void main(String[] args) {

		int[] arr = { 2, 4, 6, 2, 4, 7, 8 };
		int count = 0;

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
		}
		// System.out.println(count);
		int temp = 0;
		int n=count-1;
		int[] arr1 = new int[n];
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] != 0 && arr[i] == arr[j]) {
					int a=arr[i];
					arr1[count]=a;
					count++;
				} 
			}
		}
		System.out.println(Arrays.toString(arr1));

	}

}
