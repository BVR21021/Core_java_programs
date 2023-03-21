/*package addApplication;
public class AABB {
	public static void main(String[] args) {
		String s="aabcccdfdfffg";int c=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
				//System.out.println(s.charAt(i)+":"+c);
			}
			
			else {
				System.out.println(s.charAt(i)+":"+c);
				c=1;
			}
		
	}
		
	}

}*/
/**************************Multiple accarences********************************************/
package com.venky;
public class AABB {
	public static void main(String[] args) {
		String s="aabbbcccc";int c=1,max=0;char ch=0;String a="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				c=1;
			}
			if(c>max) {
				max=c;
				 ch=s.charAt(i);
				a="";
				 a=a+String.valueOf(ch);
			}
			else if(c==max) {
				 ch=s.charAt(i);
				a=a+String.valueOf(ch);
			}
		}
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i)+":"+max);
		}
		
	}

}
/****************************End*******************************************
***************************Single Accarences**************************
package addApplication;
public class AABB {
	public static void main(String[] args) {
		String s="aabcccddff";int c=1,max=0;char ch=0;String a="";
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i)==s.charAt(i+1)) {
				c++;
			}
			else {
				c=1;
			}
			if(c>max) {
				max=c;
				 ch=s.charAt(i);
				a="";
				 a=a+String.valueOf(ch);
			}
			else if(c==max) {
				 ch=s.charAt(i);
				a=a+String.valueOf(ch);
			}
		}
		for(int i=0;i<a.length();i++) {
			System.out.println(a.charAt(i)+":"+max);
		}
		
	}*
*
****************************End*******************************************/