package com.venky;
import java.util.ArrayList;
import java.util.List;
public class Main {
	public static void main(String[] args) {
	     List<Emp> list=new ArrayList<Emp>();
	     Emp e1=new Emp(1,"ram",40000);
	     Emp e2=new Emp(2,"krishna",90000);
	     Emp e3=new Emp(3,"sathya",30000);
	     Emp e4=new Emp(4,"venky",50000);
	     list.add(e1);
	     list.add(e2);
	     list.add(e3);
	     list.add(e4);
	     System.out.println("--------------Records are--------------");
	     for(Emp e:list)
	     {
	    	
	    	 System.out.println(e.id+" "+e.name+" "+e.salary);
	     }
	     System.out.println("------------------Reverse order-----------------");
	     for(int i=list.size()-1;i>=0;i--)
	     {
	    	 
	    	 Emp x=list.get(i);
	    	 System.out.println(x.id+" "+x.name+" "+x.salary);
	     }
	}

}
