package com.motivity;
import java.util.LinkedList;
import java.util.LinkedHashSet;
public class RemoveDuplicates {
	public static void main(String[] args) {
		LinkedList<Integer> ob = new LinkedList<Integer>();
		ob.add(1);
		ob.add(2);
		ob.add(3);
		ob.add(4);
		ob.add(1);
		System.out.println("Elements in LinkedList:"+ob);
		LinkedHashSet<Integer> ob1=new LinkedHashSet<Integer>(ob);
		System.out.println("Elements in LinkedHashSet;"+ob1);
	}

}
