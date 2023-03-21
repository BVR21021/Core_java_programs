package com.venky;

public class ElementsGreaterthanAvg {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5,10,  6, 7, 8, 9 };
		int sum = 0;
		int avg = 0;

		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		avg = sum / arr.length;
		System.out.println("Average:" + avg);
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > avg) {
				avg = arr[i];
			}
		}
		System.out.println("big element is" + avg);
	}
}
