package com.motivity;
class Bank1
{
	String Name;//instance
	String Branch;//instance
	static int Acnum;//static
	void display()//instance method
	{
		System.out.println(Name);//instance variable in instance method
		System.out.println(Branch);//instance variable in instance method
		System.out.println(Acnum);//static variable in instance method
	}
   static void display1()//static method
   {
	   Bank1 b1=new Bank1();
	 // System.out.println(b1.Name);//instance variable in static method
	 // System.out.println(b1.Branch);//instance variable in static method
	   System.out.println(Acnum);//static variable in static method
   }
}
public class Demo4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          Bank1 ob=new Bank1();
          ob.Name="Ramya";
          ob.Branch="Razole";
          Bank1.Acnum=123;
          ob.display();
        //  Bank1.Name="Ramya";
        // Bank1.Branch="Razole";
          Bank1.Acnum=567868;
          Bank1.display1();
          
          
	}

}


