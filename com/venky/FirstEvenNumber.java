package com.venky;

public class FirstEvenNumber {

	public static void main(String[] args) {
           int[]arr= {1,2,3,4,5,6,7};
           for(int i=0;i<arr.length;i++) {
        	   if(arr[i]%2==0) {
        		   System.out.println("First even number in this array is:"+arr[i]);
        		   break;
        	   }
           }
	}

}
