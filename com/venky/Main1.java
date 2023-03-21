package com.venky;
import java.util.ArrayList;
import java.util.List;
public class Main1 {
	public static void main(String[] args) {
		int []id= {101,102,103,104};
		String[]name= {"venky","ram","raj","sathya"};
		double[]salary= {10000,20000,30000,40000};
		List<Emp>list=new ArrayList<Emp>();
		for(int i=0;i<=id.length-1;i++)
		{
			Emp e=new Emp(id[i],name[i],salary[i]);
			list.add(e);
		}
		for(Emp e:list)
		{
			System.out.println(e.id+"->"+e.name+"-> "+e.salary);
		}
	}

}
