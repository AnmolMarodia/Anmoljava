package com.bigbazar.apparelexample;

public class ApparelConstrucLoading {

	String type;
	String color="black";
	char size;

	ApparelConstrucLoading(String type,char size)
	{
		this.type=type;
		this.size=size;
	}

public static void main(String[] args) {
		ApparelConstrucLoading a1= new ApparelConstrucLoading("jeans", 'm');
		a1.showDetails();
	}






void showDetails() 
	{
		System.out.println();	
	}

}
