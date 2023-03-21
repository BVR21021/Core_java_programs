package com.venky;

public class Testing {

	public static void main(String[] args) {

		show();
		Testing t=new Testing();
		t.test();
		
	}

	public static void show() {
		System.out.println("welcome static ............");
	}

	public void test() {
		show();
	}
	

}
