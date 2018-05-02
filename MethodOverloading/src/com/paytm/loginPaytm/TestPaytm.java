package com.paytm.loginPaytm;

public class TestPaytm
{
	public static void main(String[] args) {
		Paytm p1=new Paytm();
		p1.login(1234567899l, "123abc");
		p1.login("abc@gmail.com", "123abc");
	}

}
