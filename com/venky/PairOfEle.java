package com.venky;

public class PairOfEle {

	public static void main(String[] args) {

		int[] arr= {1,2,3,4,5,6,9,5,6,3};int ele=10;
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=0&&arr[i]+arr[j]==10) {
					System.out.println(arr[i]+"+"+arr[j]+"="+ele);
					arr[i]=0;
				}
				
			}
			
		}
	}

}
