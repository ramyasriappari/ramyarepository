package com.collection;

import java.util.HashSet;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> ob=new HashSet<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		ob.add(60);
		System.out.println(ob);
		System.out.println(ob.size());
         System.out.println(ob);
         System.out.println(ob.isEmpty());
         System.out.println(ob);
         System.out.println(ob.contains(10));
         System.out.println(ob);
         System.out.println(ob.remove(10));
         System.out.println(ob);
         System.out.println(ob.add(22));
         System.out.println(ob);
         System.out.println(ob.clone());
         System.out.println(ob);
         System.out.println(ob.removeAll(ob));
         System.out.println(ob);
         HashSet<String> ob1=new HashSet<String>();
         ob1.add("Ramya");
         ob1.add("murthy");
         ob1.add("sarada");
         ob1.add("sowji");
         System.out.println(ob.getClass());
         System.out.println(ob1);
         System.out.println(ob1.size());
         System.out.println(ob1);
         System.out.println(ob1.contains("Ramya"));
         System.out.println(ob1);
         System.out.println(ob1.remove("sowji"));
         System.out.println(ob1);
         System.out.println(ob1.add("sowji"));
         System.out.println(ob1); 
         
       
	}

}
