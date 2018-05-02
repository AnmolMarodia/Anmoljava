package com.bigbazar.apparelexample;

public class Apparrel
{
	String type;
	String color;
	char size;

	public Apparrel(String type,String color,char size)
	{
		this.type=type;
		this.color=color;
		this.size=size;
	}
	
	void showDetails()
	{
		System.out.println(this.type+" "+this.color+" "+this.size);
	}
	public static void main(String[] args)
	{
		Apparrel a1=new Apparrel("Jeans", "black",'m');
		a1.showDetails();

	}

}
