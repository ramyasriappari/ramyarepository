package com.exception;

public class ArrayStrore {

	public static void main(String[] args) {
		Object a []= new String [5];
		a[0]="ramya";
		System.out.println(a[0]);
		try {
		a[1]=100;
		}
		catch(ArrayStoreException e) {
			System.out.println("exception handeld......");
		}
	}

}
