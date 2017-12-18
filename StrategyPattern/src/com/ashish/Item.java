package com.ashish;

public class Item {
	
	private String itemName;
	
	private int price;

	public Item(String itemName, int price) {
		super();
		this.setItemName(itemName);
		this.setPrice(price);
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	

}
