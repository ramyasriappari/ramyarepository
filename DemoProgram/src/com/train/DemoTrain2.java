package com.train;
 class Train2
{
	int trainName;
	String passangerNme;
	Train2(int trainName,String passangerName)
	{
		this.trainName=trainName;
		this.passangerNme=passangerName;
	}
	
}
class Nsp extends Train2
{
    String fromStation;
    String toStation;
    Nsp(int trainName,String passangerName,String fromStation,String tostation)
    {
    	super(trainName,passangerName);
    	this.fromStation=fromStation;
    	this.toStation=tostation;
    }
    void display()
    {
    	System.out.println("trainNamen is "+trainName);
    	System.out.println("passangerName is "+passangerNme);
    	System.out.println("FromStation is "+fromStation);
    	System.out.println("ToStation is "+toStation);
    }
	 
}

public class DemoTrain2 {
	public static void main(String args[])
	{
		Nsp ob=new Nsp(17052,"Ramya","Narsapur","Hyd");
		ob.display();
	}
}


