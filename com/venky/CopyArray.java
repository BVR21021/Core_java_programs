package com.venky;

import java.util.Arrays;

public class CopyArray {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int[] arr1= new int[arr.length];
		for(int i=0;i<arr.length;i++) {
			arr1[i]=arr[i];
		}
		for(int a:arr1) {
			System.out.println(a);
		}
		System.out.println(Arrays.toString(arr1));
			
		
	}

}
