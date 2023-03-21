
package com.venky;

import java.util.Arrays;
import java.util.Scanner;

public class C {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("enter the number:");

		String n = sc.next();

		char arr[] = n.toCharArray();

		char temp = arr[0];

		arr[0] = arr[arr.length - 1];

		arr[arr.length - 1] = temp;

		String s = "";

		System.out.println("Original number is:" + n);

		for (int i = 0; i < arr.length; i++) {
			s += arr[i];
		}
		System.out.println("modified number is:" + s);

	}
}

class b {

	public static void main(String[] args) {
		int[] arr = { 9,6, 3, 8, 1, 2, 5, 4, 7};

		String prime = "";
		String odd = "";
		int prime1=0;
		int odd1=0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0) {
				
				int n=arr[i];
				
					prime = prime + "" + n;
				
				

			} else {
				int n1=arr[i];
				
				odd = odd + "" + n1;
			}
		}
		for(int i=0;i<prime.length();i++) {
			
		}
		char[] arr1 = (prime + odd).toCharArray();
		System.out.println(Arrays.toString(arr1));

	}
}