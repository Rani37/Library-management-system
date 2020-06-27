


package com.dxc.presentation;

import java.util.Scanner;


import com.dxc.services.AdminServiceImpl;
import com.dxc.services.UserServiceImpl;
import com.dxc.services.IAdminService;
import com.dxc.services.IUserService;

public class Library {

	public static void main(String[] args) {

		IAdminService ias=new AdminServiceImpl();
		IUserService ius=new UserServiceImpl();
		User user=new User();
		Admin admin=new Admin();


		while(true) {

			Scanner sc=new Scanner(System.in);
			System.out.println("1.Login AS Admin");
			System.out.println("2.LOgin As User");
			System.out.println("\nChoose your choice...");
			int choice=sc.nextInt();

			switch(choice)
			{
			case 1:
				System.out.println("Enter your name & password");
				String name=sc.next();
				String password=sc.next();
				boolean b1=ias.passwordCheck(name, password);
				if(b1==true)
				{
					System.out.println("\n"+name+" Successfully logined");
					admin.adminOperation();
				}else
					System.out.println("name & password incorrect\n");
				break;


			case 2:
				System.out.println("Enter your name & password");
				String name2=sc.next();
				boolean b2=ius.PasswordCheck(name2, sc.next());
				if(b2==true)
				{
					System.out.println(name2);
					user.userOperation(name2);
				}else
					System.out.println("name & password incorrect\n");
				break;


			default:
				System.out.println(" Enter Correct Choice...");
			}
		}
	}

}