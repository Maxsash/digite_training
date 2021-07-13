package com.digite.shop;

public class CartItem {
	Product product;
	int quantity;
	private int total_price;
	
	public CartItem(Product product, int quantity) {
		this.product = new Product();
		this.quantity = quantity;
		this.total_price = product.getPrice()*quantity;
	}
	
	public int getTotalPrice() {
		return total_price;
	}
	
	public void print() {
		System.out.println("Name: " + product.getName() + "\tQuantity: " + quantity+ 
				"\tTotal price: " + total_price);
	}
}

