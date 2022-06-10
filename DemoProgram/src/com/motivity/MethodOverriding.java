package com.motivity;
class Bank
{
	void rateOfInterest(int x)
	{
		System.out.println("interest is "+x);
		
	}
}
class SBI extends Bank
{
	void rateOfInterest(int y)
	{
		System.out.println("SBI interest is "+y);
	}
}
class ICICI extends Bank
{
	void rateOfInterest(int z)
	{
		System.out.println("ICICI interest is "+z);	
	}
}
class AXIS extends Bank
{
	void rateOfInterest(int a)
	{
		System.out.println("AXIS interest is "+a);
	}
 
}
public class MethodOverriding {

	public static void main(String[] args) {
		SBI ob=new SBI();
		ICICI ob1=new ICICI();
		AXIS ob2=new AXIS();
		ob.rateOfInterest(7);
		ob1.rateOfInterest(8);
		ob2.rateOfInterest(9);

		


	}

}
