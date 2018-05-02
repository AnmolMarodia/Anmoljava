package com.constr.defaul;

public class MarkerDefault
{
	String color;
	int price=50;
	String brand="Camlin";
	
	void display() 
	{
		System.out.println(color+" "+price+"  " +brand);
	}

	public static void main(String[] args)
	{
		MarkerDefault m1=new MarkerDefault();
		System.out.println(m1);// prints fully qualified classname @ hashcode
		m1.display();
		m1.color="Red";
		m1.display();
		
		MarkerDefault m2=new MarkerDefault();
		m2.display();
			m2.color="black";
			m2.display();
		
		
	}

}
