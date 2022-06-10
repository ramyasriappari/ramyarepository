package com.exception;
class Arithmetic
{
	int a;
	int b;
	int c=a/b;
	void display()
	{
		try
		{
			int c=a/b;
			System.out.println(" Divide is: "+c);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}

public class ArithmeticException {

	public static void main(String[] args) {
		Arithmetic ob=new Arithmetic();
		ob.a=5;
		ob.b=0;
		

	}

}
