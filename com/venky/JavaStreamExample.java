package com.venky;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.stream.Collectors;

class Product{  
    int id;  
    String name;  
    float price;  
    public Product() {
    	
    }
    public Product(int id, String name, float price) {  
        this.id = id;  
        this.name = name;  
        this.price = price;  
    }
	  
}  
public class JavaStreamExample {  
    public static void main(String[] args) {  
        List<Product> productsList = new ArrayList<Product>();  
        //Adding Products  
        productsList.add(new Product(1,"HP Laptop",25000f));  
        productsList.add(new Product(2,"Dell Laptop",30000f));  
        productsList.add(new Product(3,"Lenevo Laptop",28000f));  
        productsList.add(new Product(4,"Sony Laptop",28000f));  
        productsList.add(new Product(5,"Apple Laptop",90000f));  
        // Using Collectors's method to sum the prices.  
        double totalPrice3 = productsList.stream()  
                        .collect(Collectors.summingDouble(product->product.price));  
        System.out.println(totalPrice3);  
          
    }  
}  

class map {
	
	public static void main(String[] args) {

	Map<String ,Integer> map1=new HashMap<>();

	
	map1.put("venky",1);
	
	
	Product p=new Product(1, " ", 2);
	
	Product p1=new Product(2, " ", 7);
	
	Product arr[]=new Product[2];
	arr[0]=p;
	arr[1]=p1;
	for(Product p3:arr) {
		System.out.println(p3.id+" "+p3.name+" "+p3.price);
	}
	List<Integer> l=new ArrayList();
	Collections.addAll(l,1,7,4,2,3,5,6);
	
	System.out.println(l);

	Iterator<Integer> itr=l.iterator();  
    itr.forEachRemaining(a-> //Here, we are using lambda expression  
    {  
  System.out.println(a);  
    });  
    
    Stack<String> stk=new Stack<>();
    stk.push(null);
    stk.push("venky:");
    stk.push("madhu");
    stk.push("venky:");
    stk.push("madhu");
    System.out.println(stk);
    
     int a=254;
     byte b1=(byte)a;
     short s=(short)a;
     short s1=(short)(byte)a;
     System.out.println(a);
     System.out.println(b1);
     System.out.println(s);
     System.out.println(s1);
     
     Set<Integer> set=new LinkedHashSet<>();
     set.add(1);
     set.add(3);
     set.add(4);
     set.add(8);
     set.add(9);
     Set<Integer> set1=new HashSet<>();
     set1.add(1);
     set1.add(3);
     set1.add(4);
     set1.add(4);
    
     System.out.println(set1);
     System.out.println(set);

    
}
}

interface its {
	
	
	
}