package com.amazon.paymentApp;

public class TestAmazon
{
public static void main(String[] args)
{
	Amazon a1=new Amazon();
	Wallet w=new Wallet();
	Product p=a1.pay(w);
	
	Credit c=new Credit();
	Product p1=a1.pay(c);
	
	Debit d=new Debit();
	Product p2=a1.pay(d);

	
}
}
