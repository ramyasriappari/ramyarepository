package com.train;
class RailwayStation1
{
	int trainNum;
	int seatNum;
	String passangerName;
	String fromStation;
	String toStation;
	void travelling()
	{
		System.out.println("The train is on the platform one");
	class Train3{
		void travels() {
			System.out.println("The trainNum is "+trainNum);
			System.out.println("Seat Number is "+seatNum);
			System.out.println("The PassangerName is "+passangerName);
			System.out.println("The FromStation is "+fromStation);
			System.out.println("The ToStation is "+toStation);
     class Train4{
	     void travel() {
		      System.out.println("The train is ready move");
		      
	          }
     }
          Train4 ob=new Train4();
          ob.travel();
		}
	}
	Train3 obj=new Train3();
	obj.travels();
	}
}
public class LocalInnerClass {
	public static void main(String[] args) {
		RailwayStation1 ob1=new RailwayStation1();	
		ob1.trainNum=17052;
		ob1.seatNum=64;
		ob1.passangerName="Ramya";
		ob1.fromStation="Vizag";
		ob1.toStation="Araku";
		ob1.travelling();
	}
	}
	