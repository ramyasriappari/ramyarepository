package com.motivity;

public class DemoCompany {
	public static void main(String args[])
	{
	Employee oracle=new Employee();
	oracle.position();
	oracle.attendInterview("Developer");
	System.out.println("provide offer letter is "+ oracle.provideOfferLetter());
	System.out.println("provide offer letter is "+ oracle.paySalary(20000));
	
	
	}
	
}
 class Employee
{
	 void position() {
		 System.out.println("1.Tester 2.Developer");
	 }
	 void attendInterview(String certificates) {
		 System.out.println("Certificates given is "+certificates);
	 }
      String provideOfferLetter()
      {
    	  return "Developer";
      }
      String paySalary(double amount)
      {
    	  System.out.println("The salary given is "+amount);
    	  return "paid";
      }	

}
