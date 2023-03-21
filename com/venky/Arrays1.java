package com.venky;
public class Arrays1
{
	public static void main(String[] args)
	{
	int [] a= {1,2,3,4,5,6,7,8,9,10};
	for(int i=0;i<=a.length-1;i++)
	{
		int n=a[i]; 
		int fact=1;
		for(int j=1;j<=n;j++)
		{
			fact=fact*j;	
		}
		System.out.println(fact);	
	}	
	}
}
