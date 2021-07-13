package com.digite.shop;

public class Product {
	private String name;
	private int price;
	private int stock;
	
	public Product() {
		
	}

	public Product(String name, int price, int stock) {
		this.name = name;
		this.price = price;
		this.stock = stock;
	}
	
	public boolean inStock(int quant) {
		if(quant > stock)
//			System.out.println(name + " has only " + stock + " unit(s) in stock.");
			return false;
		else
//			System.out.println(name + "is in stock for the quantity requested.");
			return true;
	}
	
	public void removeStock(int quant) {
		stock -= quant;
	}
	
	public void addStock(int quant) {
		stock += quant;
	}
	
	public int getPrice() {
		return price;
	}

	public String getName() {
		return name;
	}
	
}
