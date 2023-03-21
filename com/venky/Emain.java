package com.venky;
import java.util.ArrayList;
import java.util.List;
public class Emain {
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		String[]s= {"krishna","Ram","Vishnu","venky","Sathya"};
		String[]s1= {"hyd","ben","pune","chennai","delhi"};
		List<EmpArray>list=new ArrayList<EmpArray>();
		EmpArray e;
		for(int i=0;i<=a.length-1;i++) {
			 e=new EmpArray(a[i],s[i],s1[i]);
			list.add(e);
		}
		for(EmpArray e1:list) {
			System.out.println(e1.id+"-> "+e1.Name+"-> "+e1.loc);
		}
		System.out.println(" ---------------------------------------");	
		for(EmpArray e1:list) {
			if(e1.id==3) {
				System.out.println(e1.id+"-> "+e1.Name+"-> "+e1.loc);	
			}
		}
		System.out.println(" ---------------------------------------");	
		for(EmpArray e1:list) {
			if(e1.loc=="hyd") {
				System.out.println(e1.id+"-> "+e1.Name+"-> "+e1.loc);
			}
		}
		System.out.println(" ---------------------------------------");
		for(EmpArray e1:list) {
			if(e1.loc!="hyd"&&e1.loc!="pune") {
				System.out.println(e1.id+"-> "+e1.Name+"-> "+e1.loc);
			}
		}
		System.out.println(" ---------------------------------------");	
		for(EmpArray e1:list) {
			if(e1.id==4) {
				System.out.println(e1.id+"-> "+e1.Name+"-> "+e1.loc);	
			}
		}
		for(int i=list.size()-1;i>=0;i--) {
			
			System.out.println(e.id+"-> "+e.Name+"-> "+e.loc);	
			
		}
		
		
		
	}
}
