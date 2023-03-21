package com.venky;

public class CountOfString {

	public static void main(String[] args) {

	}

}
/*
 * public class CountOfString {
 * 
 * public static void main(String[] args) {
 * 
 * String s="aaabbbbaaddddffcccccccccddfff"; int [] arr=new int[256]; for(int
 * i=0;i<s.length();i++) { char ch=s.charAt(i); int n=ch; arr[n]=arr[n]+1; }
 * for(int i=0; i<arr.length;i++) { if(arr[i]>0) { char ch=(char)i;
 * System.out.println(ch+"-"+arr[i]); } } }
 * 
 * }
 */

/*
 * import java.util.HashMap; import java.util.Map;
 * 
 * public class CountOfString {
 * 
 * public static void main(String[] args) {
 * 
 * String s = "aaabbbbaaddddffcccccccccddfffg"; Map<Character, Integer> map =
 * new HashMap<>(); for (int i = 0; i < s.length(); i++) { char ch =
 * s.charAt(i); if (map.containsKey(ch)) { map.put(ch, map.get(ch) + 1); } else
 * { map.put(ch, 1); } } //System.out.println(map); for(Character
 * ch:map.keySet()) { int x=map.get(ch); System.out.println(ch+"-"+x); } }
 * 
 * }
 */