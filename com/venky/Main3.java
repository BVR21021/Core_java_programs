package com.venky;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class Main3 {
	public static void main(String[] args) {
		Map<Integer,Emp3>map=new HashMap<Integer,Emp3>();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println("Enter the deatils:");
			int id=sc.nextInt();
			String name=sc.next();
			double salary=sc.nextDouble();
			Emp3 e=new Emp3();
			e.setId(id);
			e.setName(name);
			e.setSalary(salary);
			map.put(id,e);
			System.out.println("Do you want to continue(y/n)");
			char ch=sc.next().charAt(0);
			if(ch=='n')
			{
				break;
			}		
		}
		System.out.println("Enter the emp id");
		int id=sc.nextInt();
if(map.containsKey(id)) {
	Emp3 e=map.get(id);
	System.out.println(e.getId()+e.getName()+e.getSalary());

	}
	}
}
