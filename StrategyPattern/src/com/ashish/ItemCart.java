package com.ashish;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class ItemCart {
	
	private List<Item> items;
	
	@PostConstruct
	public void init() {
		
	}
	
	public ItemCart() {
		items = new ArrayList<>();
	}
	
	public void add(Item item) {
		items.add(item);
	}
	
	public int calculatePrice() {
		int finalPrice = 0 ;
		for (Item item : items) {
			finalPrice += item.getPrice();
		}
		return finalPrice;
	}
	
	public void pay(Payment payment) {
		payment.pay(calculatePrice());
	}
}
