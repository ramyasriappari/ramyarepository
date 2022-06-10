package com.motivity;
class Car
{
	void brand()
	{
		System.out.println("car brand is BMW");
	}
}
  class Cost extends Car
  {
	  void cost()
	  {
		  System.out.println("BMW cost is 50lakh"); 
	  }
  }
  class Color extends Cost
  {
	  void color()
	  {
		  System.out.println("BMW color is black"); 
	  }
  }
  class Milage extends Color
  {
	  void milage()
	  {
		  System.out.println("BMW milage is 20km"); 
	  }
  }
public class MultiLevelInheritance {

	public static void main(String[] args) {
		Milage ob=new Milage();
		ob.brand();
		ob.cost();
		ob.color();
		

	}

}
