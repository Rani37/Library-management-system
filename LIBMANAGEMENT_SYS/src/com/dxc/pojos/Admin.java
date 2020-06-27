package com.dxc.pojos;

public class Admin {
	
	private String Adname;
	private String password;
	private int id;
	public Admin(String adname, String password, int id) {
		super();
		Adname = adname;
		this.password = password;
		this.id = id;
	}
	public String getAdname() {
		return Adname;
	}
	public void setAdname(String adname) {
		Adname = adname;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	

}
