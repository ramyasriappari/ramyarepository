package com.collection;

import java.util.LinkedHashSet;

public class LinkedHashSets {

	public static void main(String[] args) {
		LinkedHashSet<String> ob=new LinkedHashSet<String>();
		 ob.add("Ramya");
         ob.add("murthy");
         ob.add("sarada");
         ob.add("sowji");
         System.out.println(ob);
         System.out.println(ob.contains("murthy"));
         System.out.println(ob);
         System.out.println(ob.clone());
         System.out.println(ob);
         System.out.println(ob.isEmpty());
         System.out.println(ob);
         LinkedHashSet<Integer> ob1=new LinkedHashSet<Integer>();
         ob1.add(11);
         ob1.add(12);
         ob1.add(14);
         ob1.add(15);
         ob1.add(16);
         ob1.add(17);
         ob1.add(18);
         System.out.println(ob1);
         System.out.println(ob1.add(19));
         System.out.println(ob1);
         System.out.println(ob1.remove(11));
         System.out.println(ob1);
         System.out.println(ob1.equals(ob));
         System.out.println(ob1.contains(12));
         System.out.println(ob1);
         System.out.println(ob.getClass());
         System.out.println(ob1);
         System.out.println(ob1.hashCode());
         System.out.println(ob1);
         System.out.println(ob1.isEmpty());
         System.out.println(ob1.size());
         System.out.println(ob1);
         
	}

}
