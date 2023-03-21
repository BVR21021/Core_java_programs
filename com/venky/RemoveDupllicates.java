package com.venky;

public class RemoveDupllicates {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 1, 4,3, 6, 2, 2, 3, 4, 5,};
		int count = 0;
		for (int i = 0; i < arr.length; i++) {

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i]!=0&&arr[i] == arr[j]) {
					count++;
					arr[i]=0;
				}
			}
		}
		System.out.println(count);
		int [] arr1 = new int [arr.length-count];
		int temp = 0;
		System.out.println(arr1.length);
		for (int i = 0; i <arr.length; i++) {
			for (int j = i + 1; j <arr.length; j++) {
				if (arr[i]!=0 && arr[i] == arr[j]) {
					arr[i] = 0;
					
				}
				else if(arr[i]!=0) {
					arr1[temp]=arr[i];
					temp++;
				}
			}
		}
		for(int a:arr1) {
			System.out.println(a);
		}
	}
}
