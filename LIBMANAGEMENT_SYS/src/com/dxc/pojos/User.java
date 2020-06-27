package com.dxc.pojos;

public class User {

	private int id;
	private String name;
	private String password;
	private double balance;
	private int noDaysT;
	private int noBookT;
	
	public User()
	{
		
	}

	public User(int id, String name, String password, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.password=password;
		this.balance = balance;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public int getNoDaysT() {
		return noDaysT;
	}

	public void setNoDaysT(int noDaysT) {
		this.noDaysT = noDaysT;
	}

	public int getNoBookT() {
		return noBookT;
	}

	public void setNoBookT(int noBookT) {
		this.noBookT = noBookT;
	}
	

public void display()
{
	System.out.println(id+" "+" "+name+" "+balance+" "+noDaysT+" "+noBookT);
}
}