package com.motivity;
import java.util.LinkedList;
public class LinkedLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> ob = new LinkedList<Integer>();
		ob.add(2);
		ob.add(1);
		ob.add(1);
		ob.add(1);
		ob.add(2);
		ob.add(2);
		System.out.println(ob);
		int k=3;
		System.out.println(ob.size()-k);
		while(k!=0)
		{
			ob.addFirst(ob.removeLast());
	        k--;
		}
	System.out.println(ob);
	}

}
