package com.digite.lib;
public class Member {
	private String name;
	private Book book;
	
	public Member() {
		
	}

	public Member(String name, Book book) {
		this.name = name;
		this.book = book;
	}
	
	public String getName() {
		return name;
	}
	
	public void status() {
		if(book == null)
			System.out.println(name + " has not issued any book");
		else
			System.out.println(name + " has issued " + book.getTitle());
	}
	
	public void issue_book(Book book_name) throws BookException {
		if(book == null) {
			book = book_name;
		}
		else {
			throw new BookException("Member already has issued a book.");
		}
	}
	
	public void returnBook() throws BookException {
		if(book == null) {
			throw new BookException("Member already has issued a book.");
		}
		else {
			book.returnBook();
			book = null;
		}
	}
	
}
