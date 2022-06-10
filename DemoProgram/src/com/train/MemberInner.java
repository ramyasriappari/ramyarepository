package com.train;
class RailwayStation
{
	int trainNum;
	int seatNum;
	String passangerName;
	String fromStation;
	String toStation;
	void travelling() {
		System.out.println("The train is on the platform one");
		Train3 obj=new Train3();
		obj.travels();
		
	}
	class Train3
	{
		void travels() {
			System.out.println("The trainNum is "+trainNum);
			System.out.println("Seat Number is "+seatNum);
			System.out.println("The PassangerName is "+passangerName);
			System.out.println("The FromStation is "+fromStation);
			System.out.println("The ToStation is "+toStation);
			Train4 ob1=new Train4();
			ob1.travel();
		}
	}
     class Train4{
	     void travel() {
		      System.out.println("The train is ready move");
		      
	          }
}
}
public class MemberInner {
	public static void main(String[] args) {
		RailwayStation ob=new RailwayStation();
		ob.trainNum=17052;
		ob.seatNum=64;
		ob.passangerName="Ramya";
		ob.fromStation="Narsapur";
		ob.toStation="Hyderabad";
		ob.travelling();

	}

}
