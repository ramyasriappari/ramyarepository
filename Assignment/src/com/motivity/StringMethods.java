package com.motivity;

public class StringMethods {

	public static void main(String[] args) {
	 String ob="MotivityLabs company";//literal
	 System.out.println(ob.charAt(3));
	 System.out.println(ob.lastIndexOf('m')); 
	 System.out.println(ob.contains("Lab"));
	 System.out.println(ob.length());
	 System.out.println(ob.endsWith("e"));
	 System.out.println(ob.replace('b', 'v'));
	 System.out.println(ob.toUpperCase());
	 System.out.println(ob.toLowerCase());
	 System.out.println(ob.concat("is"));
	 System.out.println(ob.substring(8));
	
	 String ob1=new String("Ramya");
	 
	 String ob2=new String("RAMYA");
	 
	 System.out.println(ob1.equalsIgnoreCase(ob2));
	 System.out.println(ob.isEmpty());
	 System.out.println(ob.equals(ob1));
	 
	 
	 String ob3="   sowji";
	 System.out.println(ob3.trim());
	 System.out.println(ob.codePointAt(2));//it will give Unicode of char at the specifies index
	 System.out.println(ob.codePointBefore(2));//it wiil give unicode of the char bfr specified index
	 System.out.println(ob1.compareTo(ob2));
	 System.out.println(ob1.compareToIgnoreCase(ob2));
	 
	 
	 
	System.out.println(ob.contentEquals(ob3));
	 System.out.println(ob.getBytes());
	 System.out.println(ob.hashCode());
	 System.out.println(ob.indexOf("L",5));
	}

}
