package com.venky;

public class SmallNumberInArray {

	public static void main(String[] args) {
            int[] arr= {2,3,4,5,6,7,8,9,1,0};
            int small=arr[0];
            for(int i=0;i<arr.length;i++) {
            	if(arr[i]<arr[0]) {
            		small=arr[i];
            	}
            }
            System.out.println("Smallest element in the given array is:"+small);
	}

}
