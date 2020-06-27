package com.dxc.services;
import java.util.List;
import java.util.List;

import com.dxc.pojos.Book;
import com.dxc.pojos.User;



public interface IAdminService {
	public boolean passwordCheck(String name,String password);

	public void addUser(int id, String name, String password, double balance);
	public void addBook(int id,String bName,String auther,int qnt);

	public List<Book> getUserBookList(int id);

	public double getUserBalance(int id);

	public List<Book> getTotalBookList();

	public void closeConnection();

	public void deleteUser(int id);

	public List<User> getUserList();

}