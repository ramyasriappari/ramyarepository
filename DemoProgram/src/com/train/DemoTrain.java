package com.train;
abstract class Train1
{
	public String name;
	public String name1;
	abstract void travelling();
	 void travel(String name)
	 {
		 System.out.println("passenger name is "+name);
		 System.out.println("passenger platform is "+name1);
	 }	
}
 class Narsapur1 extends Train1
 {
	  void travelling()
	{
		  String name1;
		 this.name = "Ramya";
		 this.name1 = "one";
		 System.out.println("from station is Nsp");
		 System.out.println("to station is Hyd");
		 super.travel(name);
	} 
	 } 
class VishakhaExp1 extends Narsapur1
 {
	 void travelling()
	 {
		 System.out.println("from station is Vizag");
		 System.out.println("to station is Araku");
	 }
 }

public class DemoTrain {
	public static void main(String args[])
	{
	 Train1 ob=new Narsapur1();
    ob.travelling();
	}
}
