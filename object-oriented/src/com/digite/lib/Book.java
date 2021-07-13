package com.digite.lib;

public class Book {
	private String title;
	private Member mbr;
	
	public Book() throws BookException {
		
	}

	public Book(String title, Member mbr) {
		this.title = title;
		this.mbr = mbr;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void status() {
		if(mbr == null)
			System.out.println(title + " is not assigned to anyone.");
		else
			System.out.println(title + " is assigned to " + mbr.getName());
	}
	
	public void assign_mem(Member mbr_name) throws BookException {
		if(mbr == null) {
			mbr_name.issue_book(this);
			mbr = mbr_name;
		}	
		else
			throw new BookException("Book already assigned");
	}
	
	public void returnBook() throws BookException {
		if(mbr == null) {
			throw new BookException("Book already in Library.");
		}
		else {
			mbr = null;
		}
	}
	
}
