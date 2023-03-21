package com.venky;

public class EvenNumbers {

	public static void main(String[] args) {
           int[] arr= {1,2,3,4,5,6,7,8,9};
           for(int x:arr) {
        	   if(x%2==0) {
        		   System.out.println("Even number are-->"+x);
        	   }
           }
	}

}
