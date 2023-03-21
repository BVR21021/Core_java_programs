package com.venky;

import java.util.Scanner;

public class KrishnamurthyNumber{  
	
	  
	public static void main(String args[]){ 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		while(n!=0) {
			int d=n%10;int fact=1;
			for(int i=1;i<=d;i++) {
				fact=fact*i;
			}
			//System.out.println("fact"+fact);
			sum=sum+fact;
			n=n/10;
			//System.out.println("sum:"+sum);
		}
		if(sum==temp) {
			System.out.println(temp+" is Krishnamurthy Number..");
		}
		else {
			System.out.println(temp+" is not krishnamurthy Number...");
		}
	}
}
