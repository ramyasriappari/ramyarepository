package com.collection;

import java.util.HashMap;

public class HashMapDemo {

	public static void main(String[] args) {
		HashMap<Integer,String> ob=new HashMap<Integer,String>();
		ob.put(1, "Ramya");
		ob.put(17, "murthy");
		ob.put(16, "sarada");
		ob.put(15, "sowji");
		ob.put(14, "Rup");
		ob.put(13, "durga");
		ob.put(12, "sandy");
		System.out.println(ob);
		System.out.println(ob.get(17));
		System.out.println(ob.getOrDefault(16, null));
		System.out.println(ob.containsKey(14));
		System.out.println(ob);
		System.out.println(ob.containsValue("Rup"));
		System.out.println(ob.values());
		System.out.println(ob.keySet());
		System.out.println(ob.isEmpty());
		System.out.println(ob);
		System.out.println(ob.entrySet());
		for(int i:ob.keySet())
		{
			System.out.println(i);
		}
		for(String a:ob.values())
		{
			System.out.println(a);
		}
		
		
		
		

	}

}
