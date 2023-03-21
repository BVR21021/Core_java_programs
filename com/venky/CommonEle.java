package com.venky;

import java.util.Arrays;

public class CommonEle {

	public static void main(String[] args) {

		int [] arr= {1,2,3,4,5,6,7};
		int[] arr1= {1,2,8,4,5,6,3};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr1.length;j++) {
				if(arr[i]==arr1[j]) {
					
					System.out.println(arr1[j]);
					arr1[j]=0;
					
				}
			}
			
		}
		System.out.println(Arrays.toString(arr1));
	}

}
