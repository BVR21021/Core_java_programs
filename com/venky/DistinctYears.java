package com.venky;

import java.util.*;

public class DistinctYears {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("Enter a string one: ");

		String input = scanner.nextLine();

		System.out.print("Enter a string two: ");

		String input1 = scanner.nextLine();

		DistinctYears dy = new DistinctYears();

		String t = dy.check(input, input1);

		System.out.println(t);

	}

	public String check(String s, String s1) {

		String new_s = s.substring(6, s.length());

		String new_s1 = s1.substring(6, s1.length());

		if (new_s.equals(new_s1)) {

			return new_s + "," + new_s1 + "are not distict years.. ";
		} else {

			return new_s + "," + new_s1 + "are  distict years.. ";
		}

	}
}

class prime {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int n = sc.nextInt();

		int count = 0;
		for (int i = 1; i <= n; i++) {

			if (n % i == 0) {
				count++;
			}
		}
		if (count == 2) {
			System.out.println(n + "is prime number");

		} else {
			System.out.println(n + "is not prime number" + count);
		}

	}
}

class factor {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int n = sc.nextInt();

		int temp1 = n;
		int sum = 0;
		if (n >= 10) {
			while (n > 0) {
				int d = n % 10;
				sum += d;
				n = n / 10;
			}
		} else {
			sum = n;
		}

		String s = "";

		for (int i = 1; i < n; i++) {
			if (n % i == 0) {
				s += i;

			}
		}

		String temp = s;
		int temp2 = Integer.parseInt(s);
		int sum1 = 0;
		if (temp2 > 10) {
			while (temp2 > 0) {
				int d1 = temp2 % 10;
				sum1 += d1;
				temp2 = temp2 / 10;
			}
		} else {
			sum1 = temp2;
		}

		if (sum == sum1) {
			System.out.println(n + "is a smith number.");
		} else {
			System.out.println(n + "not is a smith number.");
		}

	}
}
/*
 * echo "# Students" >> README.md git init git add README.md git commit -m
 * "first commit" git branch -M main git remote add origin
 * git@github.com:venkateswararao7157/Students.git git push -u origin main
 */


class Buzz{
	
	public static void main(String []args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number:");
		int n=sc.nextInt();
		int temp=0;
		
		  if(n>9) { temp=n/10; }
		
		
		if (n%7==0||n==7||temp==7) {
			System.out.println("given number is buzz number..");
		}
		else {
			System.out.println("given number is not buzz number..");
		}
		
		}
}




































