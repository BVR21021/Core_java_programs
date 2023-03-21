package com.venky;

import java.util.Arrays;

public class replaceDuplicatWithZero {

	public static void main(String[] args) {

		int[] arr= {1,2,2,3,4,5,5,6,1,7,};
		
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					arr[i]=0;
				}
				
			}
		}
		System.out.println(Arrays.toString(arr));
	}

}
