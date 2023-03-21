package com.venky;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestEle {

	public static void main(String[] args) {

		int[] arr= {1,4,3,6,5,9,8};
		Arrays.sort(arr);
		System.out.println(arr[arr.length-2]);
		
	}

}
