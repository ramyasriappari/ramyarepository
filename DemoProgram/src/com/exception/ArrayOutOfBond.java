package com.exception;
class Array
{
	String a[]= {"ramya","sowji"};
	void Arrays()
	{
		try
		{
			System.out.println(a[10]);
		}
		catch(Exception g)
		{
			System.out.println(g);
		}
	
	}
}

public class ArrayOutOfBond {

	public static void main(String[] args) {
        Array ob=new Array();
        ob.Arrays();

	}

}
