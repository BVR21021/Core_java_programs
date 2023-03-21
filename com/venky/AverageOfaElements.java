package com.venky;

public class AverageOfaElements {

	public static void main(String[] args) {
          int[] arr= {7,15,22};int sum=0;
          for(int i=0;i<arr.length;i++) {
        	  sum=sum+arr[i];
          }
		System.out.println(sum/arr.length);
	}

}
