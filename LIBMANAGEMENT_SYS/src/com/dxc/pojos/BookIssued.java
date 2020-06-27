package com.dxc.pojos;

public class BookIssued {
	private int userId;
	private int bookId;
	private int noOfDayT;
	private int noOfBookT;

	public BookIssued()
	{
		
	}

	public BookIssued(int userId, int bookId, int noOfDayT, int noOfBookT) {
		super();
		this.userId = userId;
		this.bookId = bookId;
		this.noOfDayT = noOfDayT;
		this.noOfBookT = noOfBookT;
	
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public int getNoOfDayT() {
		return noOfDayT;
	}

	public void setNoOfDayT(int noOfDayT) {
		this.noOfDayT = noOfDayT;
	}

	public int getNoOfBookT() {
		return noOfBookT;
	}

	public void setNoOfBookT(int noOfBookT) {
		this.noOfBookT = noOfBookT;
	}
	
	public void dispaly()
	{
		System.out.println(userId+" "+bookId+""+noOfDayT+" "+noOfBookT);
	}
}
