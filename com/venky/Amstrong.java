package com.venky;

import java.util.Scanner;

public class Amstrong {

	public static void main(String[] args) {

		System.out.println("Eneter the number:");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int c = 0;
		int s = 0;
		int sum = 0;
		int temp = n;
		while (n != 0) {
			n = n / 10;
			c++;

		}
		n = temp;
		while (n != 0)
		{
			int l = n % 10;
			s = 1;
			for (int i = 1; i <= c; i++) {
				s = s * l;
			}
			sum = sum + s;
			n = n / 10;
		}
		if (temp == sum) {
			System.out.println("Given number is Amstrong Number");
		} else {
			System.out.println("Given number is Not Amstrong Number");
		}
	}

}
