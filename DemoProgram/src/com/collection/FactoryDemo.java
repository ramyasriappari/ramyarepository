package com.collection;
abstract class Bank
{
abstract void bankDetails();
abstract void bankDetail();
}
class AndhraBank extends Bank
{
	void bankDetails() {
		System.out.println("Account Holder Name is: Ramya");
	}
	void bankDetail() {
		System.out.println("Account Num is:1234567");
	}
}
class AxisBank extends Bank
{
	void bankDetails() {
		System.out.println("Account Holder Name is: venu");
	}
	void bankDetail() {
		System.out.println("Account Num is:98776543");
		
	}
	
}
class BankFactory
{
	Bank getBank (String bankName) {
		if(bankName.equals("AndhraBank"))
			return new AndhraBank();
		else if(bankName.equals("AxisBank"))
			return new AxisBank();
		else return null;
	}
}
public class FactoryDemo {

	public static void main(String[] args) {
	     BankFactory ob=new BankFactory();
	     Bank ob1=ob.getBank("AndhraBank");
	     ob1.bankDetails();
	     ob1.bankDetail();

	}

}
