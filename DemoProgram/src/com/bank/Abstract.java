package com.bank;
 abstract class Bank2
 {
	 abstract void banks();
	 abstract void banks(String name , String branch ,int acountNum);
	 
 }
	class Sbi extends Bank2
	{
		  void banks()
		  {
		    System.out.println("Bank name is SBI");
		  }
		  
		void banks(String name, String branch, int acountNum) {
			System.out.println("Bank customer details");
			System.out.println("customer name is: "+name);
			System.out.println("Branch is:"+branch);
			System.out.println("Acount num is: "+acountNum);
		}
	}

public class Abstract {

	public static void main(String[] args) {
		Sbi ob=new Sbi();
		ob.banks();
		ob.banks("Ramya", "Razole", 799);
		
		

	}

}
