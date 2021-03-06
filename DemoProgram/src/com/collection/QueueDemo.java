package com.collection;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class QueueDemo {

	public static void main(String[] args) {
	  Queue<Integer> ob=new LinkedList<Integer>();
	  ob.add(10);
	  ob.add(12);
	  ob.add(30);
	  ob.add(40);
	  ob.add(50);
	  ob.add(60);
	  ob.add(70);
	  ob.add(80);
	  ob.add(90);
	  System.out.println(ob);
	  System.out.println(ob.poll());
	  System.out.println(ob.peek());
	  System.out.println(ob);
	  System.out.println(ob.remove(12));
	  System.out.println(ob);
	  System.out.println(ob.offer(30));
	  System.out.println(ob);
	  System.out.println(ob.isEmpty());
	  System.out.println(ob);
	  System.out.println(ob.contains(40));
	  System.out.println(ob);
	  Queue<String> ob1=new LinkedList<String>();
	  ob1.add("Ramya");
	  ob1.add("satyanarayana");
	  ob1.add("sarada");
	  ob1.add("sowji");
	  ob1.add("Rup");
	  ob1.add("sandy");
	  ob1.add("Ramya");
	  System.out.println(ob1);
	  Iterator<String> ob2=ob1.iterator();
      while(ob2.hasNext())
      {
      	System.out.println(ob2.next());
      }
      ob1.retainAll(Collections.singleton("Ramya"));
      System.out.println(ob1);
      ob.removeIf(n->n%2!=0);
		System.out.println(ob1);
      
	 
	  
	  
	  
	  

	}

}
