package com.collection;
class  AndhraBank1
{
	static {
		System.out.println("account holder name is:ramya");
	}
	 AndhraBank1() {
		 System.out.println("account num is:1234567");		
	}
}

public class ForNameDemo {

	public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
		System.out.println("tyhtrgbgryt");
       Class ob= Class.forName("com.collection.AndhraBank1");
	    ob.newInstance();
	}
	

}
