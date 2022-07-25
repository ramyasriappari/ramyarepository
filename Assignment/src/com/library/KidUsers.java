package com.library;

public class KidUsers implements LibraryUser {
      int age;
      String bookType;
	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		System.out.println("Registered as kiduser");
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		System.out.println("you have to return the book within 10 days");
	}

}
