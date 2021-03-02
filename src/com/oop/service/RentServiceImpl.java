package com.oop.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oop.model.Rent;

public class RentServiceImpl implements RentService {

	public void AddCustomerRent(Rent rent) {
		try {
			System.out.println("Add Customer Recordes ....");

			Class.forName("com.mysql.jdbc.Driver");
			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");

			PreparedStatement conn = myConn.prepareStatement("INSERT INTO rent(RentCustomerId,RentId,RentDvdCode,RentDate,RentDeadLine) VALUES(?,?,?,?,?)");

			conn.setString(1, rent.getRentCustomerId());
			conn.setString(2, rent.getRentId());
			conn.setString(3, rent.getRentDvdCode());
			conn.setString(4, rent.getRentDate());
			conn.setString(5, rent.getRentDeadLine());

			conn.execute();

			System.out.println("Added Customer Rent Recordes");

		} catch (Exception e) {
			System.out.println("Exception is:" + e);
		}
	}

	public void UpdateCustomerRent(Rent rent) {
		try {
			System.out.println("update Customer Recordes ....");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");

			PreparedStatement conn = myConn.prepareStatement("Update rent"+" set RentDate=?"+" where RentCustomerId=? AND RentDvdCode=?");
			
			
			conn.setString(1,rent.getRentDate());
			conn.setString(2,rent.getRentCustomerId());
			conn.setString(3,rent.getRentDvdCode());
			
			conn.execute();

			System.out.println("Update Rent Recordes");

		} catch (Exception e) {
			System.out.println("Exception is:" + e);
		}
	}

	public List<Rent> CheckCustomerRent(Rent rent) {
		try {
			System.out.println("Check Rent Recordes ....");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");

			PreparedStatement conn = myConn.prepareStatement("SELECT * FROM rent where RentCustomerId=?");

			conn.setString(1, rent.getRentCustomerId());
			
			conn.execute();

			System.out.println("Check Customer Recordes");
			
		} catch (Exception e) {
			System.out.println("Exception is:" + e);
		}
		
		return new ArrayList<Rent>();
	}

	public void DeleteCustomerRent(Rent rent) {
		try {
			System.out.println("Delete Customer Recordes ....");

			Class.forName("com.mysql.jdbc.Driver").newInstance();

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");

			PreparedStatement conn = myConn.prepareStatement("DELETE FROM rent WHERE RentId=?");

			conn.setString(1, rent.getRentId());

			conn.execute();

			System.out.println("Delete Customer Rent Recordes");

		} catch (Exception e) {
			System.out.println("Exception is:" + e);
		}
	}

}
