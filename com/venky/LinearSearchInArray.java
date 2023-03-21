package com.venky;

import java.util.Scanner;

public class LinearSearchInArray {

	public static void main(String[] args) {

		boolean flag = false;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element size..");
		int n = sc.nextInt();
		int[] arr = new int[n];
		System.out.println("enter the the elements: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println("enter the element to search: ");
		int ele = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele) {
				System.out.println("element found at loation:" + i+"->"+arr[i]);
				flag=true;
				break;
			}
		}
		if(!flag) {
			System.out.println("Element not found.....");
		}

	}

}
