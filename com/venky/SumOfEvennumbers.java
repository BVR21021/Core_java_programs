package com.venky;

public class SumOfEvennumbers {

	public static void main(String[] args) {
            int[] arr= {1,2,3,4,5,6,7,8,9};
            System.out.println(arr);
            int sum=0;
            for(int x:arr) {
            	if(x%2==0) {
            		sum=sum+x;
            	}
            }
            System.out.println("Sum of even numbers:"+sum);
            int [] arr1=new int[arr.length];
            for(int i=0;i<arr.length;i++) {
              arr1[i]=arr[i];
              System.out.println(arr1[i]);
            }
           
	}

}
