package com.collection;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		TreeSet<Integer> set =new TreeSet<Integer>();
		set.add(50);
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		set.add(60);
		System.out.println(set);
		System.out.println(set.first());
		System.out.println(set.isEmpty());
		System.out.println(set.contains(40));
		System.out.println(set.add(15));
		System.out.println(set);
		System.out.println(set.containsAll(set));
		System.out.println(set);
		System.out.println(set.remove(20));
		System.out.println(set);
		System.out.println(set.size());
		System.out.println(set);
		System.out.println(set.removeAll(set));
		System.out.println(set);
		System.out.println(set.headSet(50));
		System.out.println(set);
	}

}
