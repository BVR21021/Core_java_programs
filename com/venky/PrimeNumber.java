package com.venky;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		// Scanner sc = new Scanner(System.in);
		// System.out.println("Enter the number:");
		// int n = sc.nextInt();
		
		for (int i = 1; i <= 100; i++) {
			int count = 0;
			for (int j = 2; j <=i; j++) 
				{
					if (i % j == 0) {
						count++;
					}
				}
			if (count == 1) {
				System.out.println(i+"--->"+"prime number..");
			}
			}
			

		}
	}

