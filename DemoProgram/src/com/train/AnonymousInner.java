package com.train;
abstract class RailwayStation3
{
	abstract void travelling();
}
  class Train8
  {
	  int trainNum;
	  String passangerName;
	  void travel()
	  {
		  System.out.println("train num is "+trainNum);
		  System.out.println("passanger name is "+passangerName);
		  
	  }
  }

public class AnonymousInner {

	public static void main(String[] args) {
		String fromStation = "Rjy";
		String toStation="hyd";
		RailwayStation3 ob=new RailwayStation3() {
			
			@Override
			void travelling() {
				
				 System.out.println("from station is "+fromStation);	
				 System.out.println("to station is "+toStation);	
			}
			
		};
		ob.travelling();		
		Train8 tr = new Train8();
		tr.trainNum = 123;
		tr.passangerName = "Ramya";
		tr.travel();
		
		};

	}