package com.automobile.vehicle;

import twowheeler.Hero;

public class Test {

	public static void main(String[] args) {
		Hero ob=new Hero();
		System.out.println("the speed of hero vechile is : "+ob.getSpeed(90));
		System.out.println("the model name is:"+ob.getModelName());
		System.out.println("the registration number is:"+ob.getRegistration());
        System.out.println(	"the vehicle owner name is:"+ob.getOwnerName());
        ob.radio();
		Honda ob1=new Honda();
		System.out.println("the speed of hero vechile is : "+ob.getSpeed(100));
		System.out.println("the model name is:"+ob.getModelName());
		System.out.println("the registration number is:"+ob.getRegistration());
        System.out.println(	"the vehicle owner name is:"+ob.getOwnerName());
        ob1.cdplayer();
	}

}
