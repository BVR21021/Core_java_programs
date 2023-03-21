package com.venky;

public class Stringaddition {
	public static void main(String[] args) {
		String s1 = "1,2,1,3,-3,4,5,*10";
		String[] arr = s1.split(",");
		int sum = 0;
		for (int i = 0; i < arr.length-1 ; i++) {
			if (arr[i] != "-" && arr[i] != "*") {
				sum = sum + Integer.valueOf(arr[i]);
			}
		}
		int total = (sum - 3) * 10;
		System.out.println(total);
	}
}
