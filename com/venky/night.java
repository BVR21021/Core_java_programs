package com.venky;

import java.util.Scanner;

public class night {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("enter a String: ");
		String s = sc.next();

		
		boolean flag = true;	int count = 0;
		for (int i = 0; i < s.length(); i++) {
			 count = 0;
			for (int j = 0; j < s.length(); j++) {
				if (s.charAt(i) == s.charAt(j)) {
					count++;
				}
			}
			char ch;char ch1=' ';
			if (count > 1) {
				flag = false;
				ch=s.charAt(i);
				if(count>=2 &&ch1!=ch ) {
					ch1=ch;
					System.out.println(s.charAt(i) + "is repeated " + count + "times");
				}
				
				
				
			}
			
		}
		
		if (flag) {
			System.out.println("There is no duplecates in " + s);
		}
	}

}
