package com.train;
 class RailwayStation2
{
	static int trainNum;
	static int seatNum;
	static class Train6
	{
		String passangerName;
		float ticketPrice;
		void travelling()
		{
			System.out.println("Passenger Name is "+passangerName);
			System.out.println("Ticket Price is "+ticketPrice);
			}
		static void travel()
		{
			System.out.println("Train Num is "+trainNum);
			System.out.println("Seat Num is "+seatNum);
		}
	}
}

public class StaticInnerClass {

	public static void main(String[] args) {
		RailwayStation2.Train6 ob=new RailwayStation2.Train6();
		ob.passangerName="Ramya";
		ob.ticketPrice=500.0f;
		RailwayStation2.trainNum=17052;
		RailwayStation2.seatNum=64;
		RailwayStation2.Train6.travel();
		ob.travelling();
		
		

	}

}
