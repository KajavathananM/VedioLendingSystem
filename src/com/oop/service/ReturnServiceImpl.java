package com.oop.service;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;

import com.oop.model.Return;


public class ReturnServiceImpl implements IReturnService {
	
	
		public void Return( Return ret) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/video_lend","root","root");
				
				PreparedStatement con = connect.prepareStatement("UPDATE return_"+" set ReturnId=?,ReturnDvdCode=?,ReturnDate=?" +" WHERE ReturnCustomerId=?");
				
				
				con.setString(4,ret.getCustomer_NIC());
				con.setString(1,ret.getReturn_Id());
				con.setString(2,ret.getDvd_code());
				con.setString(3,ret.getReturn_Date());
				
				
				con.execute();
				
				System.out.println("Record updated successfully");
					
				
			}
			catch (Exception e) {
				
				
				System.out.println("Exception is:"+e);
				
			}
			
		} 
	public void deleteReturn(Return ret) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
				
				PreparedStatement con = connect.prepareStatement("DELETE FROM return_  WHERE ReturnCustomerId=?");
				
				con.setString(1,ret.getCustomer_NIC());
				
				
				con.execute();
				System.out.println("Deleted");
				
				}
			catch (Exception e) {
				
				
				System.out.println("Exception is:"+e);
			}
					
		}

		
		
		public void calculateBalance(Return ret) {
			
			try {
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
				
			
				
				System.out.println("Balance = ");
				
				
				}
			catch (Exception e) {
				
				
				System.out.println("Exception is:"+e);
				
			}
			
		}

		@Override
		public void listReturn(com.oop.model.Return ret) {
			// TODO Auto-generated method stub
			
			
			try{  
				
				Class.forName("com.mysql.jdbc.Driver");
				
				Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls","root","root");
				
				PreparedStatement con = connect.prepareStatement("SELECT * FROM return_ where RentCustomerId=? AND ReturnId=?");
						
				con.setString(1,ret.getCustomer_NIC());
				con.setString(1,ret.getReturn_Id());
					
				con.executeUpdate();
					
				System.out.println("View ReturnList successfully");
				
			
				}
				catch (Exception e) {
					
					System.out.println("Exception is:"+e);
					
				}
			
		}



		@Override
		public void returnVideo(com.oop.model.Return ret) {
			// TODO Auto-generated method stub
			
		}






}
