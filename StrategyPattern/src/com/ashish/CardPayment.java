package com.ashish;

public class CardPayment implements Payment {

	@Override
	public void pay(int amount) {
		System.out.println("Card payment done for Amount : " + amount );
	}

}
