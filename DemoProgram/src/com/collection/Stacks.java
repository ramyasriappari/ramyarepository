package com.collection;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> ob=new Stack<Integer>();
		ob.add(10);
		ob.add(20);
		ob.add(30);
		ob.add(44);
		ob.add(45);
		ob.add(46);
		ob.add(47);
		ob.add(50);
		System.out.println(ob.pop());
		System.out.println(ob);
		System.out.println(ob.push(12));
		System.out.println(ob);
		System.out.println(ob.search(20));
		System.out.println(ob);
		System.out.println(ob.isEmpty());
		System.out.println(ob);
		System.out.println(ob.peek());
		System.out.println(ob);
		System.out.println(ob.capacity());
		System.out.println(ob);
	    ob.ensureCapacity(500);
	    System.out.println(ob);
	    System.out.println(ob.lastElement());
	    System.out.println(ob);
	    System.out.println(ob.firstElement());
	    System.out.println(ob);
	    System.out.println(ob.contains(20));
	    System.out.println(ob);
	    ob.remove(3);
	    System.out.println(ob);
	    ob.add(2,22);
	    System.out.println(ob);
	    ob.add(33);
	    System.out.println(ob);
		
		
		


	}

}
