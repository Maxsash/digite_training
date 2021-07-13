

import com.digite.shop.Cart;
import com.digite.shop.Product;

public class TestCart {
	public static void main(String[] args) {
		
		Cart c = new Cart();
		
		Product bread = new Product("Bread", 35, 50);
		Product apple = new Product("Apple", 10, 100);
		Product bottle = new Product("Bottle", 60, 40);
		
		c.addItem(bread, 2);
		c.addItem(bottle, 25);
		c.removeItem(bottle, 5);
		c.addItem(apple, 32);
		c.showCart();
		c.order();
		c.addItem(bread, 2);
		c.addItem(bottle, 25);
		c.removeItem(bottle, 5);
		c.addItem(apple, 32);
		c.showCart();
	}
}
