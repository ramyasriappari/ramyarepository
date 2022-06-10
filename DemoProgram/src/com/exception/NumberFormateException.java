package com.exception;
class NumberFormate
{
	String a="Ramya";
	void Number()
	{
		try
		{
			int b=Integer.parseInt(a);
		}
		catch(Exception g)
		{
			System.out.println(g);
		}
	}
}

public class NumberFormateException {

	public static void main(String[] args) {
	    NumberFormate ob=new NumberFormate();
	    ob.Number();
	}

}
