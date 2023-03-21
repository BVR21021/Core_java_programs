package com.venky;

class Oop_s {

	public static void main(String[] args) {

		/*
		 * for(int i=1;i<=100;i+=2) {
		 * 
		 * System.out.println("odd--------->"+i);
		 * 
		 * System.out.println("even--------->"+(i+1)); }
		 */
	}
		void add(int n1,int n2) {
		n1=7;
		
		 n2=15;
		
		
		while(n1-->0) {
			
			n2++;
			
		}
		
		System.out.println("addition-->"+n2);
			
		}
		
	void add(int n1,float n2) {
			n1=7;
			
			 n2=15;
			
			
			while(n1-->0) {
				
				n2++;
				
			}
			
			System.out.println("addition-->"+n2);
				
			}

}


class Vehicle{  
	  //defining a method  
	  void run(){System.out.println("Vehicle is running");}  
	}  
	//Creating a child class  
	class Bike2 extends Vehicle{
		Bike2(){
			  
		}
		
		Bike2(int a){
			  this();
		}
	  //defining the same method as in the parent class  
	  void run(){
		
		  System.out.println("Bike is running safely");}  
	  
	  public static void main(String args[]){  
		  Vehicle obj = new Bike2();//creating object  
	  obj.run();//calling method  
	  }  
	}  
	
	
	
	
	
	
	
	
	
	  interface hg{
		 
		  abstract void bhjy();
			  
		 
		 
	 }