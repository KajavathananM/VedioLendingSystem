package com.oop.service;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.oop.model.Customer;

public class CustomerServiceImpl implements CustomerService {
	
	public void addCustomer(Customer cus) {
		
		try{  
			
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
		
		PreparedStatement c = myConn.prepareStatement("INSERT INTO customer(NIC,C_Name,Email,telephone)  VALUES(?,?,?,?)");
		
		c.setString(1,cus.getNIC());
		c.setString(2,cus.getName());
		c.setString(3,cus.getEmail());
		c.setString(4,cus.getTelephone());
		
		
		c.execute();
			
		System.out.println("Added the Recorde");
		
		
		
		
		}
		catch (Exception e) {
			
			System.out.println("Exception is:"+e);
			
		}
		
		
	}

	
	
	public void updateCustomer(Customer cus) {
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
			
			PreparedStatement c = myConn.prepareStatement("UPDATE customer"+" set C_Name=?,Email=?,telephone=?"+"where NIC=?");
															
			c.setString(1,cus.getName());
			c.setString(2,cus.getEmail());
			c.setString(3,cus.getTelephone());
			c.setString(4,cus.getNIC());
			
			c.execute();

		
			}
		catch (Exception e) {
			
			
			System.out.println("Exception is:"+e);
		}
	}



	@Override
	public void DeleteCustomer(Customer cus) {
		// TODO Auto-generated method stub
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
			
			PreparedStatement c = myConn.prepareStatement("DELETE from customer WHERE NIC=?");
															
			
			c.setString(1,cus.getNIC());
			
			
			c.execute();

		
			}
		catch (Exception e) {
			
			
			System.out.println("Exception is:"+e);
		
		}	

	}
	
}