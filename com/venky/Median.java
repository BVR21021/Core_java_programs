package com.venky;

public class Median {

	public static void main(String[] args) {
      int[] arr= {1,2,3,4,5,6,7,8,9,0};
      //   System.out.println("Array middle value is "+arr[(arr.length/2-1)]);
         if (arr.length%2!=0) {
        	 System.out.println("Array length is odd:"+arr[((arr.length/2)+(arr.length/2-1))/2]);
        	 
         }
         else {
        	// System.out.println("Array middle value is "+arr[arr.length/2]);

        	 System.out.println("Array length is even:"+arr[arr.length/2]);
         }
	}

}
