package com.motivity;
class Employee1
{
	void salary()
	{
		System.out.println("Programmer salary is 10000");
	}
}
 class Programmer extends Employee1
 {
	 void bonus()
	 {
		 System.out.println("Programmer bonus is 2000"); 
	 }
 }
public class SingleInheritance {

	public static void main(String[] args) {
		Programmer ob=new Programmer();
		ob.salary();
		ob.bonus();

	}
}


