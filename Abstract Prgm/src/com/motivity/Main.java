package com.motivity;

abstract class Car
{
	abstract public void color();
	abstract public String speed();
	abstract public double price(double price);
	public static void move() {
		System.out.println("move forward");
	}
	
}

class Bmw extends Car
{

	@Override
	public void color() {
		System.out.println("color : red ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return "speed was 80 kmph";
	}

	@Override
	public double price(double price) {
		// TODO Auto-generated method stub
		return price;
	}
	
}

class Rangerover extends Car
{

	@Override
	public void color() {
		System.out.println("color : black");
		// TODO Auto-generated method stub
		
	}

	@Override
	public String speed() {
		// TODO Auto-generated method stub
		return "speed 100 kmph";
	}

	@Override
	public double price(double price) {
		// TODO Auto-generated method stub
		return price ;
	}
	
}

public class Main {
	public static void main(String[] args) {
		Car c = new Bmw();
		c.move();
		c.color();
		System.out.println(c.price(400000.90));
		System.out.println(c.speed());
		c = new Rangerover();
		c.move();
		c.color();
		System.out.println(c.price(899999.99));
		System.out.println(c.speed());
		
	}

}
