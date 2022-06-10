package com.collection;
abstract class Bank9
{
abstract void bankDetails();
abstract void bankDetail();
}
class AndhraBank3 extends Bank
{
	void bankDetails() {
		System.out.println("Account Holder Name is: Ramya");
	}
	void bankDetail() {
		System.out.println("Account Num is:1234567");
	}
}
class AxisBank1 extends Bank
{
	void bankDetails() {
		System.out.println("Account Holder Name is: venu");
	}
	void bankDetail() {
		System.out.println("Account Num is:9876543");
		
	}
	
}
class BankFactory1
{
	static Bank getBank (String bankName) {
		if(bankName.equals("AndhraBank3"))
			return new AndhraBank();
		else if(bankName.equals("AxisBank1"))
			return new AxisBank();
		else return null;
	}
}

public class StaticFactory {

	public static void main(String[] args) {
         Bank ob=BankFactory1.getBank("AxisBank1");
         ob.bankDetails();
         ob.bankDetail();

	}

}
