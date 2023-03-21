package com.venky;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main2 {
	public static void main(String[] args) {
		List<Emp>list=new ArrayList<Emp>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the deatils:");
			int id=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			Emp e=new Emp(id,name,salary);
			list.add(e);
			System.out.println("Do you want to continue(y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='n')
			{
				break;
			}		
		}
		for(Emp e:list)
		{
			System.out.println(e.id+" "+e.name+" "+e.salary);
		}
	}
}
