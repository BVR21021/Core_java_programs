package com.venky;

public class LastOddNumber {

	public static void main(String[] args) {
          int[]arr= {1,2,3,4,5,7};int a=0;
          for(int i=0;i<arr.length;i++) {
        	  if(arr[i]%2!=0) {
        		  a=arr[i];
        	  }
          }
          System.out.println("last odd number in this aray is:"+a);
	}

}
