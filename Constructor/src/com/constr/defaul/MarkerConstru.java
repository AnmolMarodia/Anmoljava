package com.constr.defaul;

public class MarkerConstru
{
   String color;
   int price=50;
   String brand="Camlin";
   
   public MarkerConstru(String color)
   {
	this.color=color;
   }
   
   void dispay() 
   {
  	System.out.println(color+" "+price+" "+brand);
   }

   
   public static void main(String[] args) {
	MarkerConstru m1=new MarkerConstru("Black");
    m1.dispay();
	
	MarkerConstru m2=new MarkerConstru("Red");
	m2.dispay();

}

}
