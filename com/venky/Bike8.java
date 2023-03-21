package com.venky;

class Honda2 { 
	final static int a; final int b;   
	static void assign() {
		
	}
	static {
		a=20; 
	}	
	 final void run(int a){
		
		 
		 System.out.println("run()"+"running...");	 
		 } 
	 void run(int a,int b) {
		 System.out.println("run()"+"running...");	
	 }
	 Honda2(){
		 b=1; 
		int x=2;
		 System.out.println(b+"running...");
	 }
 void display() {
		 System.out.println(a+"running...");
	 }
	}
	class Bike8 extends Honda2 {  
	   public static void main(String args[]){ 
		  
	    new Honda2().display();  final int i;i=10; 
	   }  
	   
	}     