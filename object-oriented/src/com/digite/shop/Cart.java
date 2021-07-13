package com.digite.shop;

public class Cart {
	private CartItem cart_item[];
	private int index;
	
	public Cart() {
		cart_item = new CartItem[10];
	}
	
	public void addItem(Product item, int quant) {
		//update stock in product and print error if quantity is more
		if(item.inStock(quant)) {
			item.removeStock(quant);
			cart_item[index].product = item; 
			cart_item[index++].quantity = quant;
		}
		else
			System.out.println("This product does not have enough stock.");
	}
	
	public void removeItem(Product item, int quant) {
		for (int i = 0; i < cart_item.length; i++) {
			if (item == cart_item[i].product && quant <= cart_item[i].quantity) {
				cart_item[i].quantity  -= quant;
				cart_item[i].product.addStock(quant);
				break;
			}
		}
	}
	
	public void showCart() {
		//list all products from the cart with cart total
		for (int i = 0; i < index; i++) {
			cart_item[i].print();
		}
		System.out.println("Cart Total: " + this.cartTotal());
	}
	
	public void order() {
		//clear the cart
		index = 0;
	}
	
	public int cartTotal() {
		int sum = 0;
		for (int i = 0; i < cart_item.length; i++) {
			sum += cart_item[i].getTotalPrice();
		}
		return sum;
	}
	
}
