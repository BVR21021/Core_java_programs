package com.venky;

public class DuplicatesInArray {

	public static void main(String[] args) {

		int[] arr= {1,1,2,3,2,3,4};
		for(int i=0;i<arr.length-1;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]!=0&&arr[j]!=0&&(arr[i]==arr[j])) {
					System.out.println(arr[i]);
					arr[j]=0;arr[i]=0;
					break;
					
				}
			}
		}
	}

}
