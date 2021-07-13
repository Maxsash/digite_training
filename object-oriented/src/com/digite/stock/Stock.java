package com.digite.stock;
/**
 *This class represents stock of any random company. It maintains the quotes of
 *their stock status. 
 * @author Yash Shrivastava
 *@version 1.0
 */
public class Stock implements Exchange {

	/** Method to see the current quote of the stock.*/
	@Override
	public void getQuote() {
		System.out.println("Get Quote");

	}

	@Override
	public void viewQuote() {
		System.out.println("View Quote");

	}

	@Override
	public void setQuote() {
		System.out.println("Set Quote");

	}

}
