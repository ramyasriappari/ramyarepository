package com.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;

public class Linked {

	public static void main(String[] args) {
		LinkedList<Integer> ob=new LinkedList<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(40);
		ob.add(50);
		ob.add(60);
		System.out.println(ob);
		System.out.println(ob.size());
		System.out.println(ob.get(3));
		Iterator<Integer> obj=ob.iterator();
		while(obj.hasNext())
		{
			System.out.println(obj.next());
		}
         ob.add(4,70);
         System.out.println(ob);
         LinkedList<String> ob1=new LinkedList<String>();
         ob1.add("Ramya");
         ob1.add("sowji");
         ob1.add("sarada"); 
         ob1.add("durga");
         System.out.println(ob1);
         ob1.addFirst("suma");
         System.out.println(ob1);
         ob1.addLast("murthy");
         System.out.println(ob1);
         ob1.removeFirst();
         System.out.println(ob1);
         ob1.removeLast();
         System.out.println(ob1);
         //reversing
         Iterator<String> ob2=ob1.descendingIterator();
         while(ob2.hasNext())
         {
        	 System.out.println(ob2.next());
         }
         Collections.sort(ob1);
         System.out.println(ob1);
         
	}

}
