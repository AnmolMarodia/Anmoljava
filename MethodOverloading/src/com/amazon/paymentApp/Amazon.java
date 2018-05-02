package com.amazon.paymentApp;

public class Amazon
{
	Product pay(Wallet w)
	{
		Product p=new Product();
		System.out.println("Wallet accepted");
		return p;
	}

	Product pay(Credit c)
	{
		Product p=new Product();
		System.out.println("Credit card accepted");
		return p;
	}

	Product pay(Debit d)
	{
		Product p=new Product();
		System.out.println("Debit card accepted");
		return p;
	}

}
