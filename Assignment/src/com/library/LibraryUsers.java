package com.library;

import java.util.Scanner;

public class LibraryUsers {
	int age;
	static LibraryUsers ob=new LibraryUsers();
	

	public static void main(String[] args) {
	System.out.println("Enter your age");
	Scanner sc=new Scanner(System.in);
     ob.age=sc.nextInt();
     getobject().registerAccount();
     getobject().requestBook();
	}
    private static LibraryUser getobject()
    {
    	if(ob.age>12)
    	{
    		return new AdultUsers();
    	}
    	else
    	{
    		return new KidUsers();
    	}
    }
}
