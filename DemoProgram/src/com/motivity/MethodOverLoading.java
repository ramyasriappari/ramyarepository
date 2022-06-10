package com.motivity;
class Fridge
{
	void brand(String name,String capacity)
	{
		System.out.println("fridge name "+name);
		System.out.println("fridge cpacity "+capacity);
	}
         void brand(String color,float price)
         {
        	 System.out.println("fridge color "+color);
        	 System.out.println("fridge price "+price);
         }
}
public class MethodOverLoading {

	public static void main(String[] args) {
           Fridge fr=new Fridge();
           fr.brand("samsung","6ltr");
           fr.brand("blue",8000.0f);
           Fridge wp=new Fridge();
           wp.brand("worldpool","8ltr");
           wp.brand("red",9000f);
           Fridge l=new Fridge();
           l.brand("Lg","5ltr");
           l.brand("black",7000f);
	}
}


