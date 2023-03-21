package com.venky;

public class checking {

	public static void main(String[] args) {

		String s = "kiranisagoodboy";
		String s1 = "";
		String s2 = "";
		String longsub = "";
		int n = 0;
		for (int i = 0; i < s.length()-1; i++) {

			for (int j = i+1; j < s.length(); j++) {

				if (s.charAt(i) != s.charAt(j)) {

					s1 = s1 + String.valueOf(s.charAt(j));

				}
				else {
					break;
				}
				
				i=s1.length();     
				
			}
			 System.out.println(s1);
			for (int k = 0; k < s1.length(); k++) {

				for (int x = k + 1; x < s1.length(); x++) {

					if (s1.charAt(k) != s1.charAt(x)) {

						s2 = s2 + String.valueOf(s1.charAt(k));
					}
					else {
						break;
					}

				}

			}

		}
		if (n < s2.length()) {

			n = s2.length();
			
			longsub="";

			longsub = s2;
		}
		System.out.println(longsub);

	}

}
