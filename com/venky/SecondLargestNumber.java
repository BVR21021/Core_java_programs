package com.venky;

import java.util.Arrays;

public class SecondLargestNumber {

	public static void main(String[] args) {

		int[] arr= {10,2,4,5,1,8,6};
		int temp=0;
		int i=0;
		for( i=0;i<arr.length;i++) {
			for(int j=0;j<arr.length-1;j++) {
				if(arr[j]>arr[j+1]) {
					  temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
		 
			}	// System.out.println(arr[i]);  
		 
		}	   
		//System.out.println(arr[arr.length-2]);
		//System.out.println(Arrays.toString(arr));
		
	 for(i=0;i<arr.length;i++) {
		 //System.out.println(arr[i]);
		// System.out.println(arr[1]);
	 }
	 System.out.println(arr[1]);
	 
	}

	

}
