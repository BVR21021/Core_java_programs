package com.venky;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size:");
		int n = sc.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		boolean flag = false;
		System.out.println("Eneter the element to  search:");
		int ele = sc.nextInt();
		int low = 0;
		int high = n - 1;
		Arrays.sort(arr);
		while (low <= high) {
			int mid = (low + high) / 2; // System.out.println("mid value"+mid);
			if (ele < arr[mid]) {
				high = mid - 1;
			} else if (ele > arr[mid]) {
				low = mid + 1;
			} else if (ele == arr[mid]) {
				System.out.println("Element found at locaation" + mid);

				flag = true;
				break;
			}
		}
		if (!flag) {
			System.out.println("Element not found");
		}
	}

}
