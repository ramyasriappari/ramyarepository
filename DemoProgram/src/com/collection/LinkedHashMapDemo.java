package com.collection;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		LinkedHashMap<Integer,String> ob=new LinkedHashMap<Integer,String>();
            ob.put(17, "Ramya");
            ob.put(16, "murthy");
            ob.put(15, "sarada");
            ob.put(14, "sowji");
            ob.put(13, "rup");
            ob.put(12, "venu");
            System.out.println(ob);
            System.out.println(ob.get(17));
            System.out.println(ob);
            System.out.println(ob.isEmpty());
            System.out.println(ob);
            System.out.println(ob.containsKey(17));
            System.out.println(ob);
            System.out.println(ob.containsValue("sandy"));
            System.out.println(ob);
            System.out.println(ob.remove(12));
            System.out.println(ob);
            System.out.println(ob.remove(13, "rup"));
            System.out.println(ob);
            
            
	}

}
