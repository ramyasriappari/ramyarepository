package com.motivity;
import java.util.Scanner;
public class Integers {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your divident");
		int x=sc.nextInt();
		System.out.println("enter your divisor");
		int y=sc.nextInt();
		int sign=0;
		int temp=0;
		if(y<0){
		sign++;
		y=y*-1;
		}
		if(x<0){
		sign++;
		x=x*-1;
		} while(x>=y)
		{
		x=x-y;
		temp++;
		}
		if(sign==1)
		System.out.println("answer is "+-temp);
		else
		System.out.println("answer "+temp);
	}

}
