package com.venky;

public class sumOfPairsDriveQ {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 0 };
		int ele = 5;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 1; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == 5) {
					System.out.println(arr[i] + "+" + arr[j] + "=" + ele);
				}
			}
		}
	}

}
