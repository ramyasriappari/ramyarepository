package com.library;

public class AdultUsers implements LibraryUser {
	int age;
	String bookName;

	@Override
	public void registerAccount() {
		// TODO Auto-generated method stub
		System.out.println("you are register as AdultUser");
	}

	@Override
	public void requestBook() {
		// TODO Auto-generated method stub
		System.out.println("you have to returned book within 7 days");
	}
	

}
