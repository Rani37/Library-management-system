
package com.dxc.services;


import java.util.List;

import com.dxc.dao.DaoAdminImpl;
import com.dxc.dao.IDaoAdmin;
import com.dxc.pojos.Book;
import com.dxc.pojos.User;
import com.dxc.services.*;

public class AdminServiceImpl implements IAdminService {

	IDaoAdmin aDao=new DaoAdminImpl();

	@Override
	public boolean passwordCheck(String name,String password) {
		return aDao.passwordCheck(name,password);
	}

	@Override
	public void addUser(int id, String name, String password, double balance) {
		aDao.addUser(id,name,password,balance);
	}

	@Override
	public void addBook(int id, String bName, String auther, int qnt) {
		aDao.addBook(id,bName,auther,qnt);
	}

	@Override
	public List<Book> getUserBookList(int id) {

		return aDao.getUserBookList(id);
	}

	@Override
	public double getUserBalance(int id) {
		return aDao.getUserBalance(id);
	}

	@Override
	public List<Book> getTotalBookList() {
		return aDao.getTotalBookList();
	}

	@Override
	public void closeConnection() {
		aDao.closeConnection();
	}

	@Override
	public void deleteUser(int id) {
		aDao.deleteUser(id);
	}

	@Override
	public List<User> getUserList() {
		return aDao.getUserList();
	}

}