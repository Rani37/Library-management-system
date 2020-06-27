package com.dxc.pojos;

public class Book {

	private int bid;
	private String name;
	private String auth;
	private int qty;
	
	public Book()
	{
		
	}

	public Book(int bid, String name, String auth, int qty) {
		super();
		this.bid = bid;
		this.name = name;
		this.auth = auth;
		this.qty = qty;
	}

	public int getBid() {
		return bid;
	}

	public void setBid(int bid) {
		this.bid = bid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuth() {
		return auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}
	public void displayBook()
	{
		
		
	System.out.println(bid+" "+name+" "+auth+" "+qty);	
	}
}
