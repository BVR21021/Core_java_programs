package com.venky;

import java.util.Arrays;

public class DuplecatesReplace {

	public static void main(String[] args) {

		int [] arr= {1,2,3,10,3,2,5,6,9,4,5,9};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=0&&arr[i]==arr[j]) {
					arr[i]=0;
				}
			}
		}
		System.out.println(Arrays.toString(arr));
		
	}

}
