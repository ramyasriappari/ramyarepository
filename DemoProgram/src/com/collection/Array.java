package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class Array {

	public static void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(5);
		ob.add(60);
		System.out.println(ob);
		System.out.println(ob.contains(10));
		System.out.println(ob);
		System.out.println(ob.add(22));
		System.out.println(ob);
		System.out.println(ob.indexOf(30));
		System.out.println(ob);
		System.out.println(ob.remove(3));
		ArrayList<String> ob1=new ArrayList<String>();
		ob1.add("Ramya");
		ob1.add("Ramya");
		ob1.add("sowji");
		ob1.add("sarada");
		ob1.add("murthy");
		ob1.add("durga");
		ob1.add("Ramaya");
		System.out.println(ob1.remove("durga"));
		System.out.println(ob1.equals(ob));
		System.out.println(ob);
		System.out.println(ob1.containsAll(ob1));
		ob.removeIf(n->n%2!=0);
		System.out.println(ob1);
		System.out.println(ob1.isEmpty());
		System.out.println(ob1);
		System.out.println(ob1.lastIndexOf("Ramaya")>0);
        ob1.add("sandy");
        ob1.add("Rup");
        System.out.println(ob1);
        System.out.println(ob1.size());
        System.out.println(ob1);
        System.out.println(ob1.hashCode());
        Iterator<String> ob2=ob1.iterator();
        while(ob2.hasNext())
        {
        	System.out.println(ob2.next());
        }
       ob1.retainAll(Collections.singleton("Ramya"));
       System.out.println(ob1);
       
        
		
		
	}
	

}
