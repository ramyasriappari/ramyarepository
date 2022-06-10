package com.motivity;
class Train
{
	void travelling()
	{
		System.out.println("===Train List===");	
		}}
class NarsapurExp extends Train
{
	void travelling()
	{
		System.out.println("From station is Nsp");
		System.out.println("To station is Hyd");
	}}
class Hyderabad extends Train
{
	void travelling()
	{
		System.out.println("From station is Hyd ");
		System.out.println("To station is Vizag");
	}}
class VishakhaExp extends Train
{
	void travelling()
	{
		System.out.println("From station is Vizag");
		System.out.println("To station is Araku");
	} }
public class HierarchicalInheritance {

	public static void main(String[] args) {
		Train ob=new Train();
		ob.travelling();
		ob=new NarsapurExp();
		ob.travelling();
		ob=new Hyderabad();
		ob.travelling();
		ob=new VishakhaExp();
		ob.travelling();
	}
}
