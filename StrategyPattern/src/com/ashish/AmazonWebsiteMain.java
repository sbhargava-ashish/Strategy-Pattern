package com.ashish;

public class AmazonWebsiteMain {
	
	public static void main(String[] args) {
		
		ItemCart cart = new ItemCart();
		
		Item item1 = new Item("1234",10);
		Item item2 = new Item("5678",40);
		
		cart.add(item1);
		cart.add(item2);
		
		// Using Card Payment Strategy
		cart.pay(new CardPayment());
		
		// Using Cash Payment Strategy
		cart.pay(new CashPayment());
	}

}
