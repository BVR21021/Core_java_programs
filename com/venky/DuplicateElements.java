
package com.venky;

public class DuplicateElements {

	public static void main(String[] args) {

		int[] arr = { 3, 1, 2, 3, 4, 6, 7, 3, 1, 2 };

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] != 0 && (arr[i] == arr[j])) {
					System.out.println("Duplicate Element is:" + arr[i]);
					arr[j] = 0;
					break;

				}

			}

		}
	}

}
