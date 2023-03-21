package com.venky;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		List<Employee>li=new ArrayList<>();
		Scanner sc=new Scanner(System.in);
		while(true) {
			System.out.println("Enter the Employee Details:");
			int id=sc.nextInt();
			String name=sc.next();
			int age=sc.nextInt();
			double salary=sc.nextDouble();
			Employee e=new Employee(id,name,age,salary);
			li.add(e);
			System.out.println("Do you want to continue Y/N:");
			char ch=sc.next().charAt(0);
			if(ch=='N') {
				break;
			}
		}
		for(int i= 0;i<li.size();i++) {
			System.out.print(li.get(i));
		}
}
}
