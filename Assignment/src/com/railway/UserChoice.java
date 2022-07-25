package com.railway;

import java.util.Random;

public class UserChoice {

	public static void main(String[] args) {
		int r=10;
		while(r>0)
		{
			result().notice();
			r--;
		}

	}
	static Compartment result()
	{
		Object[] ob= {new FirstClass() ,new Ladies(),new GeneralCompartment(),new Luggage()};
		Random s=new Random();
		return(Compartment)ob[s.nextInt(3)];
	}

}
