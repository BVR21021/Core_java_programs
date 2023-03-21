package com.venky;

public class Substrings {

	public static void main(String[] args) {
		String s = "ab12321bajkkjh3432";
System.out.println(s.substring(0, 9)+"\n"+s.substring(1, 8)+"\n"+s.substring(2, 7)+"\n"+s.substring(3, 6)+"\n"+s.substring(9, 13)+"\n"+s.substring(14, 17));
		/*System.out.println(s.substring(1, 8));
		System.out.println(s.substring(2, 7));
		System.out.println(s.substring(3, 6));
		System.out.println(s.substring(9, 13));
		System.out.println(s.substring(14, 17));*/
	}

}

/*
 * o/p ab12321ba, b12321b, 12321, 232, jkkj, 343
 * 
 * 
 * 
 * 
 * 
 * 
 */
