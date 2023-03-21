package com.venky;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		int[] arr = { 15,7,22,7,15 };
		System.out.println("entre the two locations to swapping from 0 to :"+(arr.length-1));
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println("befour swapping:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
		System.out.print("After Swapping:");
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");

		}
	}

}
