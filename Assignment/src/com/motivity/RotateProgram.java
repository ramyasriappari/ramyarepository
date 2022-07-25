package com.motivity;

import java.util.LinkedList;
import java.util.Scanner;

public class RotateProgram {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		LinkedList<Integer> list = new LinkedList<Integer>();
		while(true) {
		System.out.println("enter integer list values...?");
		int i=sc.nextInt();

		System.out.println("if you want to insert values say 'yes'/'no'");
		String ch=sc.next();
		if(ch.equals("yes"))
		{
		list.add(i);
		}
		if(ch.equals("no"))
		{
		list.add(i);
		System.out.println("list elementas "+list);
		break;
		}

		}
		System.out.println("plese enter postion to rotate the list ..");
		int k=sc.nextInt();
		RotateProgram ob= new RotateProgram() ;
		ob.rotateList(list,k);
		}
		public void rotateList(LinkedList<Integer>list,int k)
		{
		while(k!=0)
		{
		list.addFirst(list.removeLast());
		k--;
		}
		System.out.println(list);
    }	

	}


