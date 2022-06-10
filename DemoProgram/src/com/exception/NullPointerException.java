package com.exception;
class NullPoint
{
	String b[]=null;
	void nullPointer()
	{
		try
		{
			System.out.println(b.length);
		}
		catch(Exception g)
		{
			System.out.println(g);
		}
		
	}
}

public class NullPointerException {

	public static void main(String[] args) {
		NullPoint ob=new NullPoint();
		ob.nullPointer();

	}

}
