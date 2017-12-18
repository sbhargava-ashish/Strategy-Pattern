package com.ashish;

public class CashPayment implements Payment {
	
	@Override
	public void pay(int amount) {
		System.out.println("Cash payment done for Amount : " + amount );
	}

}
