package com.venky;

import java.util.Arrays;

public class OnlyEvennumbers {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,7,8,9,0};
		int count=0;int even=0,odd=0;
		for(int a:arr) {
			if(a%2==0) {
				count++;
			}
		}
		int[] evens=new int[count];
		int[] odds=new int[arr.length-count];
		for(int i=0;i<arr.length;i++) {
			if(arr[i]%2==0) {
				evens[even]=arr[i];
				even++;
			}
			else {
			odds[odd]=arr[i];
				odd++;
			}
			
		}
		System.out.println("evens:"+Arrays.toString(evens));
		System.out.print("odds:"+Arrays.toString(odds));
	}

}
