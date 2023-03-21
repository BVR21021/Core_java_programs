package com.venky;

 class A {
	 void msg(){System.out.println("Hello");}  
 }  
 class B{  
 void msg(){System.out.println("Welcome");}  
 }  
 class Oop extends A,B{//suppose if it were  
    
  public static void main(String args[]){  
    Oop obj=new Oop();  
    obj.msg();//Now which msg() method would be invoked?  
 }   

}
 
