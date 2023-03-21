package com.venky;

public class SwapEvenToOdd {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int i, j;
		for (i = arr.length-1; i >=0 ; i--) {
			if (arr[i] % 2 != 0) {
				break;
			}
		}
		for (j = 0; j < arr.length; j++) {
			if (arr[j] % 2 == 0) {
				break;
			}
		}
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
		for (int a : arr) {
			System.out.println(a);
		}

	}

}
