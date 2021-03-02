package com.oop.service;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.oop.model.Video;



public class VideoServiceImpl implements VideoService {

	
	public void addVideo(Video video) {
		
		try {
			System.out.println("Adding the Video Record");
			
			Class.forName("com.mysql.jdbc.Driver");

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");
			PreparedStatement c = myConn.prepareStatement("INSERT INTO dvd(DvdId,DvdName,DvdPrice) VALUES(?,?,?)");
			
			c.setString(1, video.getDvdId());
			c.setString(2, video.getDvdName());
			c.setFloat(3, video.getDvdPrice());
			
			

			c.execute();
			System.out.println("Added the Video Record");
		} catch (Exception e) {

			System.out.println("Exception is:" + e);

		}
	}

	public void deleteVideo(Video video) {
	
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");

			
			PreparedStatement c = myConn.prepareStatement("DELETE from Dvd WHERE DvdID=?");
			c.setString(1, video.getDvdId());	

			c.execute();
			System.out.println("Deleted the Record");
		} catch (Exception e) {

			System.out.println("Exception is:" + e);

		}
	}

	public void updateVideo(Video video) {
		
		try {

			Class.forName("com.mysql.jdbc.Driver");

			Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vls", "root", "root");

			PreparedStatement c = myConn.prepareStatement("UPDATE dvd "+" set DvdName=?,DvdPrice=? "+" WHERE DvdId=?");
			c.setString(3, video.getDvdId());			
			c.setString(1, video.getDvdName());
			c.setFloat(2, video.getDvdPrice());
			
			

			c.execute();
			System.out.println("Updated the Record");
		} catch (Exception e) {

			System.out.println("Exception is:" + e);

		}
	}


	
	public Video searchVideo(String msg) {
		
		Video video=new Video();
		try{  
			Class.forName("com.mysql.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/vls","root","root");  
			Statement stmt=(Statement) con.createStatement();  
			ResultSet rs=((java.sql.Statement) stmt).executeQuery("select * from Dvd where Dvdname='"+msg+"'");
			while(rs.next())  
				System.out.println(rs.getString(1)+"  "+rs.getString(2)+"  "+rs.getFloat(3));  
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			
		
		return video;
	}	

	
}
