package com.collection;

import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeMap;

public class TreeMapDemo {

	public static void main(String[] args) {
		TreeMap<Integer,String>ob=new TreeMap<Integer,String>();
		ob.put(11, "Ramya");
		ob.put(12, "murthy");
		ob.put(13, "sarada");
		ob.put(14, "sowji");
		ob.put(15, "durga");
		System.out.println(ob);
		for(Map.Entry a:ob.entrySet())
		{
			System.out.println(a.getKey()+" "+a.getValue());
		}
        ob.putIfAbsent(2, "sandy");
        System.out.println(ob);
        ob.ceilingEntry(4);
        NavigableSet<Integer> obj=ob.descendingKeySet();
        System.out.println(obj);
        System.out.println(ob);
        System.out.println(ob.containsKey(11));
        System.out.println(ob);
        ob.replace(11, "Ramya", "venu");
        System.out.println(ob);
        ob.remove(11, "venu");
        System.out.println(ob);
	}

}
