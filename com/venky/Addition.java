package com.venky;

import java.util.Scanner;

public class Addition {
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the two values");
		int a=sc.nextInt();
		int b=sc.nextInt();
		while (a--!=0)
		{
			b++;
		}
		System.out.println(b);

	}

}
