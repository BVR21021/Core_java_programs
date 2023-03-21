package com.venky;

import java.util.Scanner;

public class SumPairs {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		Scanner sc = new Scanner(System.in);
		System.out.println("enetr the element to ");
		int ele = sc.nextInt();
		boolean flag = false;
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length; j++) {
				if ((arr[i] + arr[j]) == ele) {
					flag = true;
					System.out.println(arr[i] + "+" + arr[j] + "=" + ele);
				}

			}
		}
		if (!flag) {

			System.out.println("no elements ");
		}
	}

}
